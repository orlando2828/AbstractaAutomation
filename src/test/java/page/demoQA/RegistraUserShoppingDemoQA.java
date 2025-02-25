package page.demoQA;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class RegistraUserShoppingDemoQA {

    private WebDriver driver;

    public RegistraUserShoppingDemoQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    /*******ELEMENTOS CORRESPONDIENTES A REGISTRO DE USUARIOS******************/
    @FindBy(id = "menuUserSVGPath")
    private WebElement iconoUser;
    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]/a[2]")
    private WebElement LinkRegistrarse;
    @FindBy(name = "usernameRegisterPage")
    private  WebElement txtUserName;
    @FindBy(name = "emailRegisterPage")
    private WebElement txtEmail;
    @FindBy(name = "passwordRegisterPage")
    private WebElement txtPass;
    @FindBy(name = "confirm_passwordRegisterPage")
    private WebElement txtConfirmPass;
    @FindBy(name = "first_nameRegisterPage")
    private WebElement txtFirstName;
    @FindBy(name = "last_nameRegisterPage")
    private WebElement txtLastName;
    @FindBy(name = "phone_numberRegisterPage")
    private WebElement txtFono;
    @FindBy(name = "countryListboxRegisterPage")
    private WebElement cboPais;
    @FindBy(name = "cityRegisterPage")
    private WebElement txtCiudad;
    @FindBy(name = "addressRegisterPage")
    private WebElement txtDirecPageRegis;
    @FindBy(name = "state_/_province_/_regionRegisterPage")
    private WebElement txtRegion;
    @FindBy(name = "postal_codeRegisterPage")
    private WebElement txtCodigoPostal;
    @FindBy(name = "i_agree")
    private WebElement optionAcepto;
    @FindBy(id = "register_btnundefined")
    private WebElement btonRegistrar;
    /***************************************************************************/


    /**********INGRESO LOGIN CON USUARIO YA CREADO******************************/
    @FindBy(xpath = "//body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]")
    private WebElement btonLogin;
    @FindBy(name = "username")
    private WebElement txtNameUser;
    @FindBy(xpath = "//body[1]/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[2]/div[1]/input[1]")
    private WebElement txtPassUser;
    @FindBy(id = "sign_in_btnundefined")
    private WebElement btonIngresar;
    /***************************************************************************/
    String UserName= "Admin001";
    String PassUser = "Admin001";

    public void registraUsuarioNuevo(){
        boolean elemento1 = metodosGenericos.visualizarObjeto(iconoUser, 10);
        if (elemento1) {
            addWebReportImage("Menu Superior Icono User", "Acceder a Registro de Nuevo Usuario", Status.PASS, false);
            iconoUser.click();
        } else {
            addWebReportImage("Error! Menu Superior Icono User", "No se pudo Acceder al Registro de Nuevo Usuario", Status.FAIL, false);
        }

        boolean elemento2 = metodosGenericos.visualizarObjeto(LinkRegistrarse, 10);
        if (elemento2) {
            addWebReportImage("Pantalla Registro de Nuevos Usuarios", "Ingreso Registro de Nuevo Usuario", Status.PASS, false);
            iconoUser.click();
        } else {
            addWebReportImage("Error! Pantalla Registro de Nuevos Usuarios", "No se Pudo Ingresar Registro de Nuevo Usuario", Status.FAIL, false);
        }

        boolean elemento3 = metodosGenericos.visualizarObjeto(txtUserName, 10);
        if (elemento3) {
            txtUserName.sendKeys("admin01");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Nombre Nuevo Usuario", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso Datos Personales", "No es Posible Ingresar Nombre Nuevo Usuario", Status.FAIL, false);
        }

        boolean elemento4 = metodosGenericos.visualizarObjeto(txtEmail, 10);
        if (elemento4) {
            txtEmail.sendKeys("rodrigo.espinoza.maltez@ciisa.cl");
            addWebReportImage("Ingreso Datos Personales", "Ingresa de Correo Electronico", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso Datos Personales", "No es Posible Ingresar Correo Electronico,Formato Incorrecto", Status.FAIL, false);
        }

        boolean elemento5 = metodosGenericos.visualizarObjeto(txtPass, 10);
        if (elemento5) {
            txtEmail.sendKeys("admin01");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto de Password", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso Datos Personales", "No es Posible Ingresar Password", Status.FAIL, false);
        }

        boolean elemento6 = metodosGenericos.visualizarObjeto(txtConfirmPass, 10);
        if (elemento6) {
            txtConfirmPass.sendKeys("admin01");
            addWebReportImage("Ingreso de Confimacion Password", "Ingresa Correcto Confirmacion Password", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Email", "No es Posible Ingresar Password", Status.FAIL, false);
        }

        boolean elemento7 = metodosGenericos.visualizarObjeto(txtFirstName, 10);
        if (elemento7) {
            txtFirstName.sendKeys("Rodrigo");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Primer Nombre", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Email", "No es Posible Ingresar Primer Nonbre", Status.FAIL, false);
        }

        boolean elemento8 = metodosGenericos.visualizarObjeto(txtLastName, 10);
        if (elemento8) {
            txtLastName.sendKeys("Espinoza Maltez");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Apellidos", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar Los Apellidos", Status.FAIL, false);
        }

        boolean elemento9 = metodosGenericos.visualizarObjeto(txtFono, 10);
        if (elemento9) {
            txtLastName.sendKeys("Espinoza Maltez");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Apellidos", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar Los Apellidos", Status.FAIL, false);
        }

        boolean elemento10 = metodosGenericos.visualizarObjeto(txtCiudad, 10);
        if (elemento10) {
            txtCiudad.sendKeys("Region Metropolitana");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Ciudad", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar Los Apellidos", Status.FAIL, false);
        }

        boolean elemento11 = metodosGenericos.visualizarObjeto(cboPais, 10);
        if (elemento11) {
            Select selectMiceProd = new Select(cboPais);
            selectMiceProd.selectByVisibleText("Chile");
            addWebReportImage("Ingreso Datos Personales", "Seleccion Correcta  de Pais", Status.PASS, false);
        }else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Seleccionar un Pais", Status.FAIL, false);
        }

        boolean elemento12 = metodosGenericos.visualizarObjeto(txtDirecPageRegis, 10);
        if (elemento12) {
            txtDirecPageRegis.sendKeys("www.demoqa.com");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Direcion de registro de pagina", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar Direcion de registro de pagina", Status.FAIL, false);
        }

        boolean elemento13 = metodosGenericos.visualizarObjeto(txtRegion, 10);
        if (elemento13) {
            txtRegion.sendKeys("Region Metropolitana");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto Direcion de Region", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar Direcion de registro de pagina", Status.FAIL, false);
        }

        boolean elemento14 = metodosGenericos.visualizarObjeto(txtCodigoPostal, 10);
        if (elemento14) {
            txtCodigoPostal.sendKeys("9120000");
            addWebReportImage("Ingreso Datos Personales", "Ingresa Correcto de Codigo Postal", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Ingresar  Codigo Postal", Status.FAIL, false);
        }

        boolean elemento15 = metodosGenericos.visualizarObjeto(optionAcepto, 10);
        if (elemento15) {
            optionAcepto.click();
            addWebReportImage("Ingreso Datos Personales", "Acepto Condiciones de Registro", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Aceptar Condiciones de Registro", Status.FAIL, false);
        }

        boolean elemento16 = metodosGenericos.visualizarObjeto(btonRegistrar, 10);
        if (elemento16) {
            btonRegistrar.click();
            addWebReportImage("Ingreso Datos Personales", "Registro Correcto de Usuario", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso de Datos Personales", "No es Posible Realizar Registro de Usuario" , Status.FAIL, false);
        }
    }

    public void ingresoLogin(){

        boolean elementClickBton = metodosGenericos.visualizarObjeto(btonLogin, 10);
        if (elementClickBton) {
            btonLogin.click();
            addWebReportImage("Login,Ingreso a Plataforma", "Correcto Ingreso de Login", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso a Plataforma Con Login Ingresado", "No es Posible Ingresar Login", Status.FAIL, false);
        }

        boolean elementUser = metodosGenericos.visualizarObjeto(txtUserName, 10);
        if (elementUser) {
            txtUserName.sendKeys(UserName);
            addWebReportImage("Login,Ingreso a Plataforma", "Correcto Ingreso de Login Usuario", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso a Plataforma Con Login Ingresado", "No es Posible Ingresar Login Usuario", Status.FAIL, false);
        }

        boolean elementPass = metodosGenericos.visualizarObjeto(txtPassUser, 10);
        if (elementPass) {
            txtPassUser.sendKeys(PassUser);
            addWebReportImage("Login,Ingreso a Plataforma", "Correcto Ingreso de Login Password", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso a Plataforma Con Login Ingresado", "No es Posible Ingresar Login Password", Status.FAIL, false);
        }

        boolean elementIngresar = metodosGenericos.visualizarObjeto(btonIngresar, 10);
        if (elementIngresar) {
            btonIngresar.click();
            addWebReportImage("Ingreso a Plataforma Logueandose", "Correcto Click Boton Ingreso a Plataforma", Status.PASS, false);
        } else {
            addWebReportImage("Error! Ingreso a Plataforma Con Login Ingresado", "No es Posible Ingreso a Plataforma", Status.FAIL, false);
        }
    }
}
