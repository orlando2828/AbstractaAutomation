package page.mercadoLibre;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.metodosGenericos;

import static constans.Constants.productoModa;
import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;



public class homeMercadoLibreWeb implements homeMercadoLibre {

    private WebDriver driver;

    public homeMercadoLibreWeb() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "/html/body/header/div/a[2]")
    private WebElement logoHome;

    @FindBy(id="cb1-edit")
    private WebElement txtBuscar;

    //@FindBy(xpath = "/html/body/header/div/form/button")
    @FindBy(className = "nav-search-btn")
    private WebElement lupaBuscar;

    @FindBy(className = "cookie-consent-banner-opt-out")
    private WebElement infoCookie;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/button[1]")
    private  WebElement btonEntendidoCookie;

    public void informacionCookie(){
        boolean elementsCookie = metodosGenericos.visualizarObjeto(infoCookie, 5);
        if(elementsCookie){
            metodosGenericos.visualizarObjeto(btonEntendidoCookie, 5);
            btonEntendidoCookie.click();
            addWebReportImage("Informacion de este sitio usa Cookies", "Se da por entendido que el sitio acepta Cookies", Status.PASS, false);
            reporteObjetoDesplegado(true, "Sitio con Cookies", "Se aceptan Cookies", false);
            Assert.assertTrue(true);
        }
    }

    public void homePagina(){
       // metodosGenericos.esperarElemento(logoHome);
        boolean elementsHome = metodosGenericos.visualizarObjeto(logoHome, 5);

        if (elementsHome){
            addWebReportImage("Ingreso a Home Mercado Libre", "Ingreso correcto a Home Mercado Libre", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se Ingresa a Home Mercado Libre", "Ingreso realizado correctamente", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! No es posible, Ingresar a Home Mercado Libre", "Ingreso incorrecto a Home Mercado Libre", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, Ingresar a Home Mercado Libre", "Ingreso incorrecto a Home Mercado Libre", false);
            System.out.println("No es  Posible Ingresar ni visualizar a Home Mercado Libre");
            Assert.assertTrue(false);
        }

        }

    public void ingresoProducto( String producto){
        metodosGenericos.esperarElemento(txtBuscar);
        boolean elementsBuscar = metodosGenericos.visualizarObjeto(txtBuscar, 5);

        if(elementsBuscar){
            txtBuscar.sendKeys(producto);
            addWebReportImage("Ingreso de producto requerido", "Ingreso correcto de producto requerido", Status.PASS, false);
            reporteObjetoDesplegado(true, "Se realiza ingreso de producto a buscar", "Producto ingresado corectamente", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! el criterio de busqueda no es valido", "Ingreso incorrecto de producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, ingresar producto", "Ingreso incorrecto de producto", false);
            System.out.println("No es  Posible Ingresar el producto");
            Assert.assertTrue(false);
        }
    }

    public void busquedaProducto(){
        //metodosGenericos.esperarElemento(lupaBuscar);
        boolean elementslupa = metodosGenericos.visualizarObjeto(lupaBuscar, 7);
        if(elementslupa){
            metodosGenericos.esperarElemento(lupaBuscar);
            lupaBuscar.click();
            addWebReportImage("Busqueda de producto", "Se realiza busqueda del producto ingresado", Status.PASS, false);
            reporteObjetoDesplegado(true, "Busqueda de producto", "Se realiza busqueda del producto ingresado :" +productoModa, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! Al buscar producto ingresado", "No se encuentran busquedas con el producto :" +productoModa, Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Producto ingresado no encontrado", "Producto no encontrado", false);
            System.out.println("No es  Posible Ingresar el producto");
            Assert.assertTrue(false);
        }
    }




}
