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

import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;

public class elementsTollsQA {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public elementsTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    //@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    @FindBy (id = "item-0")
    private WebElement botonTextBox;

    @FindBy(id = "userName")
    private WebElement txtFullName;

    @FindBy(id = "userEmail")
    private WebElement txtEmailTB;

    @FindBy(id = "currentAddress")
    private WebElement txtDireccion;

    @FindBy(id = "permanentAddress")
    private WebElement txtDireccionPerm;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    private WebElement botonSumit;



    public void textBox() throws InterruptedException {

        boolean textBox = metodosGenericos.visualizarObjeto(botonTextBox, 5);
        if (textBox) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(botonTextBox));
            botonTextBox.click();
            reporteObjetoDesplegado(true, "Se valida sección administrador", "ambiente Admnistrador", false);
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

    }

    public void formularioTextbox() throws InterruptedException {

        boolean name = metodosGenericos.visualizarObjeto(txtFullName, 5);
        if (name) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(txtFullName));
            txtFullName.sendKeys("Orlando Guevilao");
            System.out.println("Se realiza Ingreso de Full Name");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se valida sección administrador", "ambiente administrador", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente administrador", false);
            System.out.println("No es  Posible realizar Ingreso de Full Name");
            Assert.assertTrue(false);
        }


        boolean email = metodosGenericos.visualizarObjeto(txtEmailTB, 5);
        if (email) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(txtEmailTB));
            txtEmailTB.sendKeys("orlando28@gmail.com");
            System.out.println("Se realiza Ingreso de Email");
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente administrador", false);
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }


        boolean direccion = metodosGenericos.visualizarObjeto(txtDireccion, 5);
        if (direccion) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(txtDireccion));
            txtDireccion.sendKeys("Persa Bio-Bio en la calle Victor Manuel");
            System.out.println("Se realiza Ingreso de Dirección");
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente administrador", false);
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Direccion");
            Assert.assertTrue(false);
        }

        boolean direccionperm = metodosGenericos.visualizarObjeto(txtDireccionPerm, 5);
        if (direccionperm) {
            WebDriverWait wait = new WebDriverWait(driver,(5));
            wait.until(ExpectedConditions.elementToBeClickable(txtDireccionPerm));
            txtDireccionPerm.sendKeys("Plaza de la dignidad sin número ex plaza italia o plaza Baquedano");
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente administrador", false);
            System.out.println("Se realiza Ingreso de Direccion Permanente");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Direccion Permanente");
            Assert.assertTrue(false);
        }

       boolean submit = metodosGenericos.visualizarObjeto(botonSumit, 5);
        if (submit) {
            // se reemplaza con metodo JavascriptExcecutor
            System.out.println("Se realiza click en boton Sumit");

            //botonSumit.click();
            //System.out.println("Se realiza click en boton Sumit");
            reporteObjetoDesplegado(true, "Se valida seccion administrador", "ambiente administrador", false);
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click en boton Sumit ");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(false);
        }

    }

}
