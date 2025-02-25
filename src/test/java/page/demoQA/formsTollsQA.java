package page.demoQA;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class formsTollsQA {

    private WebDriver driver;

    public formsTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    @FindBy(xpath = "//*[@id=\"app\"]/header/a/img")
    private WebElement ToolsQA;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div")
    private WebElement MenuCentralForms;

    @FindBy (xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")
    private WebElement botonPracticForms;

    @FindBy(id = "firstName")
    private WebElement txtNameF;

    @FindBy(id = "lastName")
    private WebElement txtlastNameF;


    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]")
    private WebElement optionMasculino;


    @FindBy(id = "userEmail")
    private WebElement txtEmailF;

    @FindBy(id = "userNumber")
    private WebElement txtMobile;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]")
    private WebElement optionDeporte;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[2]/label[1]")
    private WebElement optionLeer;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[3]/label[1]")
    private WebElement optionMusic;


    @FindBy(id = "currentAddress")
    private WebElement txtDireccionF;


    @FindBy(id = "subjectsInput")
    private WebElement txtAsignaturas;

    @FindBy(xpath = "//*[@id=\"state\"]/div/div[1]/div[1]")
    private WebElement CboselectCiudad;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div")
    private WebElement MenuWidget;



    /** Entro a la Pagina y recorro***********************************************************************************************/
    public void demoqa5() {

//        boolean elemento1 = metodosGenericos.visualizarObjeto(ToolsQA, 5);
//        if (elemento1) {
//            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
//            ToolsQA.click();
//
//        } else {
//            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
//
//        }

        boolean elemento2 = metodosGenericos.visualizarObjeto(MenuCentralForms, 5);
        if (elemento2) {
            MenuCentralForms.click();
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);

        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento3 = metodosGenericos.visualizarObjeto(botonPracticForms, 10);
        if (elemento3) {
            botonPracticForms.click();
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento4 = metodosGenericos.visualizarObjeto(txtNameF, 5);
        if (elemento4) {
            txtNameF.sendKeys("Rodrigo Alejandro");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            System.out.println("Se realiza Ingreso de Name");

        } else {
            System.out.println("No es  Posible realizar Ingreso de Name");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }


        boolean elemento5 = metodosGenericos.visualizarObjeto(txtlastNameF, 5);
        if (elemento5) {
            txtlastNameF.sendKeys("Espinoza Maltez");
            System.out.println("Se realiza Ingreso Apellidos");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento6 = metodosGenericos.visualizarObjeto(optionMasculino, 5);
        if (elemento6) {
            optionMasculino.click();

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento7 = metodosGenericos.visualizarObjeto(txtEmailF, 5);
        if (elemento7) {
            txtEmailF.sendKeys("RspinozaM@example.com");
            System.out.println("Se realiza Ingreso de Email");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Salario");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento8 = metodosGenericos.visualizarObjeto(txtMobile, 5);
        if (elemento8) {
            txtMobile.sendKeys("1234567890");
            System.out.println("Se realiza Ingreso Numero Mobile");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {
            System.out.println("No es  Posible realizar Ingreso Numero Mobile");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento9 = metodosGenericos.visualizarObjeto(txtMobile, 5);
        if (elemento9) {
            txtMobile.sendKeys("1234567890");
            System.out.println("Se realiza Ingreso Numero Mobile");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {
            System.out.println("No es  Posible realizar Ingreso Numero Mobile");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

    }


    /**-->Luego cambiar a Page esta clase
     /** OBJETOS PERTENECIENTES A OPCION ELEMENTS FORMS*********************************************************************/
    //Click ToolQA


    public void deporte() throws InterruptedException {
        boolean elemento1 = metodosGenericos.visualizarObjeto(optionDeporte, 5);
        if (elemento1) {
            optionDeporte.click();

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento2 = metodosGenericos.visualizarObjeto(optionLeer, 5);
        if (elemento2) {
            optionLeer.click();

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento3 = metodosGenericos.visualizarObjeto(optionMusic, 5);
        if (elemento3) {
            optionMusic.click();

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento4 = metodosGenericos.visualizarObjeto(txtDireccionF, 5);
        if (elemento4) {
            txtDireccionF.sendKeys("Alameda 1150, Morande con Compañia");
            System.out.println("Se realiza Ingreso Direccion");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {
            System.out.println("No es  Posible realizar Ingreso de Direccion");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        boolean elemento5 = metodosGenericos.visualizarObjeto(txtAsignaturas, 5);
        if (elemento5) {
            txtAsignaturas.sendKeys("English");

            Thread.sleep(400);
            txtAsignaturas.sendKeys("Computer Science");
            Thread.sleep(400);
            txtAsignaturas.sendKeys("Arts");
            Thread.sleep(400);
            txtAsignaturas.sendKeys("Social Studies");
            Thread.sleep(400);
            txtAsignaturas.sendKeys("History");
            Thread.sleep(400);
            CboselectCiudad.click();
            Thread.sleep(400);
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
        } else {

            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
        }

        ToolsQA.click();

    }






}

