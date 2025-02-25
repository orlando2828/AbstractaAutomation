package Base;

import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.HtmlReport;

import java.lang.reflect.Method;

import static constans.Constants.urlshopping;
import static reportePdf.ImedReports.pdfClose;

public class BaseWeb_Shopping {
    public static HtmlReport reportes;
    public WebDriver driver;

    public BaseWeb_Shopping() {
    }

    @BeforeSuite
    public void beforeSuite(ITestContext testContext) {
        String suiteName = testContext.getCurrentXmlTest().getSuite().getName();
        System.out.println("suiteName: " + suiteName);
        reportes = new HtmlReport(suiteName);
    }

    @AfterSuite
    //@Parameters({"carpetaReporte"})
    public void afterSuite(ITestContext testContext) {
        HtmlReport.endReport();

    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(ITestContext testContext,@Optional("chrome") String browser, Method method) {
        DriverContext.setUp(browser, urlshopping);
        String testName = testContext.getCurrentXmlTest().getName();
        String[] obtenerGrupo = method.getAnnotation(Test.class).groups();
        String obtenerDescpr = method.getAnnotation(Test.class).description();
        String grupo = obtenerGrupo[0];
        HtmlReport.newTest(testName,grupo,obtenerDescpr);
        HtmlReport.updateDriver(DriverContext.getDriver());
    }

    @AfterMethod
    public void tearDown() {
       // DriverContext.quitDriver();
        pdfClose();
    }
}
