package Base;


import constans.Constants;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.HtmlReport;
import utils.ZipUtilis;

import static reportePdf.ImedReports.*;

import java.lang.reflect.Method;

import static constans.Constants.urldemo;

public class BaseWeb {
    public static HtmlReport reportes;
    public WebDriver driver;

    public BaseWeb() {
    }

    @BeforeSuite
    public void beforeSuite(ITestContext testContext) {
        String suiteName = testContext.getCurrentXmlTest().getSuite().getName();
        System.out.println("suiteName: " + suiteName);
        reportes = new HtmlReport(suiteName);
    }

    @AfterSuite
    @Parameters({"carpetaReporte"})
   // public void afterSuite(ITestContext testContext, String carpetaReporte) {
    public void afterSuite(ITestContext testContext, @Optional("default/path/to/reports") String carpetaReporte) {
        HtmlReport.endReport();
        ZipUtilis zip = new ZipUtilis(carpetaReporte);
        zip.generarReporte();

    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(ITestContext testContext, @Optional("chrome") String browser, Method method) {

        creaPDF(Constants.pathArchivo);
        DriverContext.setUp(browser, urldemo);

        String testName = testContext.getCurrentXmlTest().getName();
        String[] obtenerGrupo = method.getAnnotation(Test.class).groups();
        String obtenerDescpr = method.getAnnotation(Test.class).description();
        String grupo = obtenerGrupo[0];
        HtmlReport.newTest(testName,grupo,obtenerDescpr);
        HtmlReport.updateDriver(DriverContext.getDriver());
        nombreClase(this.getClass().getSimpleName());
    }

    @AfterMethod
    public void tearDown() {
       // DriverContext.quitDriver();
        pdfClose();
    }

}

