package page.demoQA;

import com.aventstack.extentreports.Status;

import driver.DriverContext;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.metodosGenericos;

import java.time.Duration;

import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;

public class homeTollsQA {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public homeTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//body[1]/div[2]/header[1]/a[1]/img[1]")
    private WebElement imgToolsQA;

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement botonElements;

    @FindBy(xpath = "//*[@id='fixedban']//button")
    private WebElement btnCerrarBanner;




    /** Entro a la Pagina y recorro***********************************************************************************************/
    public void paginaToolsqa() throws InterruptedException {
        boolean imgtoolsqa = metodosGenericos.visualizarObjeto(imgToolsQA, 5);
        if (imgtoolsqa) {
            Thread.sleep(400);
            System.out.println("encuentra imagen imgtoolsqa");
            imgToolsQA.click();
            System.out.println("hace el click");
            addWebReportImage("Se realiza el login de Tools QA", "Ingresar datos de acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza el login de Tools QA", "Ingresar datos de acceso", false);
            Assert.assertTrue(true);
            System.out.println("cumple el assertTrue");
        } else {
            addWebReportImage("Se realiza el login de Tools QA", "Ingresar datos de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Se realiza el login de Tools QA", "Ingresar datos de acceso", false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }
    }

    public void ElementsToolsQA() throws InterruptedException {

        boolean elements = metodosGenericos.visualizarObjeto(botonElements, 5);
        if (elements) {
            System.out.println("encuentra el botón elements");

            // Oculta el banner persistente con id 'fixedban'
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementById('fixedban').style.display='none';");

            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(botonElements));
            botonElements.click();
            System.out.println("hace el click elements");
            addWebReportImage("Agregar Elementos", "Agregar Elementos", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente Admnistrador", false);
            Assert.assertTrue(true);
            System.out.println("Hace el assertrue de elements");
        } else {
            addWebReportImage("Agregar Elementos", "NO se Agregar Elementos", Status.FAIL, false);
            System.out.println("No es  Posible realizar Click en Page Elements");
            Assert.assertTrue(false);
        }


    }

}
