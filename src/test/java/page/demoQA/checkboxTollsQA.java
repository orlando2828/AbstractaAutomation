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
import utils.metodosGenericos;

import static org.openqa.selenium.By.xpath;
import static utils.HtmlReport.addWebReportImage;

public class checkboxTollsQA {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public checkboxTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }


    @FindBy (id = "item-1")
    private WebElement botonCheckbox;

   // @FindBy(id = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")

    //button[@class='rct-option rct-option-expand-all']
    @FindBy(xpath = "//button[@class='rct-option rct-option-expand-all']")
    private WebElement btonMasCheckbox;

   // @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[3]")
    @FindBy(xpath = "//span[@class='rct-title' and text() ='Desktop']" )
    private WebElement seleccionDesktop;


   // @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]")
    @FindBy(xpath = "//span[@class='rct-title' and text()='Documents']/ancestor::li//button/*[name()='svg']")
    private WebElement FlechaAbajoExpandeUno;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]")
    private WebElement FlechaAbajoExpandeDos;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement BotonMas;

    @FindBy(xpath = " //body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]")
    private WebElement BotonMenos;


    public void checkBox(){

        boolean menucheck = metodosGenericos.visualizarObjeto(botonCheckbox, 5);
        if (menucheck) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(botonCheckbox));
            botonCheckbox.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click en opcion ChecBox del menu lateral izquierdo");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click en boton Sumit ");

        }

    }

    public void formularioCheckbox(){

        boolean btnmas = metodosGenericos.visualizarObjeto(btonMasCheckbox, 5);
        if (btnmas) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(btonMasCheckbox));
            btonMasCheckbox.click();
            System.out.println("Se realiza click en + que expande el arbol del checkbox");
            addWebReportImage("text Box ", "text box", Status.PASS, false);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click en + que espande el arbol del checkbox");

        }

        boolean seleccheck = metodosGenericos.visualizarObjeto(seleccionDesktop, 5);
        if (seleccheck) {
            WebElement desktopElement = driver.findElement(xpath("//span[@class='rct-title' and text()='Desktop']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", desktopElement);
           // WebDriverWait wait = new WebDriverWait(driver, (5));
            //wait.until(ExpectedConditions.elementToBeClickable(seleccionDesktop));
           // seleccionDesktop.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean expandeUno = metodosGenericos.visualizarObjeto(FlechaAbajoExpandeUno, 5);
        if (expandeUno) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(FlechaAbajoExpandeUno));
            FlechaAbajoExpandeUno.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el 2do arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean expandeDos = metodosGenericos.visualizarObjeto(FlechaAbajoExpandeDos, 5);
        if (expandeDos) {
            FlechaAbajoExpandeDos.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Seleccionador que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Seleccionador que expande el arbol del checkbox");

        }

        boolean btnMas = metodosGenericos.visualizarObjeto(BotonMas, 5);
        if (btnMas) {
            BotonMas.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click + que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click + que expande el arbol del checkbox");

        }

        boolean btnMenos = metodosGenericos.visualizarObjeto(BotonMenos, 5);
        if (btnMenos) {
            BotonMenos.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            System.out.println("Se realiza click (-) que expande el arbol del checkbox");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click (-) que expande el arbol del checkbox");

        }
    }


    }

