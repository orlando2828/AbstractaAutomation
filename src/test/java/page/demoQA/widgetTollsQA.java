package page.demoQA;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class widgetTollsQA {

    private WebDriver driver;

    public widgetTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]")
    private WebElement webMenuWidget;

    @FindBy (xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]")
    private WebElement webMenuAcordian;

    @FindBy(id = "section2Heading")
    private WebElement Acordion2;

    @FindBy(id = "section3Heading")
    private WebElement Acordion3;

    @FindBy(id = "section1Heading")
    private WebElement Acordion1;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]")
    private WebElement MenuProgresBar;

    @FindBy(id = "startStopButton")
    private WebElement StarProgres;

    public void widget() throws InterruptedException {
        boolean elemento1 = metodosGenericos.visualizarObjeto(webMenuWidget, 5);
        if (elemento1) {
            webMenuWidget.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento2 = metodosGenericos.visualizarObjeto(webMenuAcordian, 5);
        if (elemento2) {
            webMenuAcordian.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, true);
        }

        boolean elemento3 = metodosGenericos.visualizarObjeto(Acordion2, 5);
        if (elemento3) {
            Acordion2.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Error! Ingresa a opcion Widget", "Ingresar datos de acceso", Status.FAIL, true);
        }

        boolean elemento4 = metodosGenericos.visualizarObjeto(Acordion3, 5);
        if (elemento4) {
            Acordion3.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Error!Ingresa a opcion Widget", "Valida ingreso", Status.FAIL, false);
        }

        boolean elemento5 = metodosGenericos.visualizarObjeto(Acordion1, 5);
        if (elemento5) {
            Acordion1.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

    }

    public void progressBar() throws InterruptedException {
        boolean elemento1 = metodosGenericos.visualizarObjeto(webMenuWidget, 5);
        if (elemento1) {
            webMenuWidget.click();
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento6 = metodosGenericos.visualizarObjeto(MenuProgresBar, 10);
        if (elemento6) {
            Thread.sleep(400);
            MenuProgresBar.click();
            MenuProgresBar.click();
            System.out.println("entro a progressbar");
            addWebReportImage("Ingresa a opcion ProgresBar", "Valida ingreso ProgresBar", Status.PASS, false);
        } else {
            System.out.println("NO entro a progressbar");
            addWebReportImage("Error! Ingresa a opcion ProgresBar", "Valida ingreso ProgresBar", Status.FAIL, false);
        }

        boolean elemento7 = metodosGenericos.visualizarObjeto(StarProgres, 5);
        if (elemento7) {
            StarProgres.click();
            Thread.sleep(5000);
            addWebReportImage("Ingresa a opcion Widget", "Valida ingreso", Status.PASS, false);

        } else {

            addWebReportImage("Error! Ingresa a opcion Widget", "No Carga Progresbar", Status.FAIL, false);
        }

    }

}
