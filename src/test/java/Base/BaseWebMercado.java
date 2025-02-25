package Base;


import constans.Constants;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.HtmlReport;
import utils.ZipUtilis;

import java.lang.reflect.Method;

import static constans.Constants.urlMercado;
import static reportePdf.ImedReports.*;

public class BaseWebMercado {
    public static HtmlReport reportes;
    public WebDriver driver;

    public BaseWebMercado() {
    }

    @BeforeSuite
    public void beforeSuite(ITestContext testContext) {
        String suiteName = testContext.getCurrentXmlTest().getSuite().getName();
        System.out.println("suiteName: " + suiteName);
        reportes = new HtmlReport(suiteName);
    }

    @AfterSuite
    @Parameters({"carpetaReporte"})
    public void afterSuite(ITestContext testContext, String carpetaReporte) {
        HtmlReport.endReport();
        ZipUtilis zip = new ZipUtilis(carpetaReporte);
        zip.generarReporte();

    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(ITestContext testContext,@Optional("chrome") String browser, Method method) {

        creaPDF(Constants.pathArchivo);
        DriverContext.setUp(browser, urlMercado);

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

