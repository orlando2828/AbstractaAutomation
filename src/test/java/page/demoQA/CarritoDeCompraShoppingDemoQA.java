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

public class CarritoDeCompraShoppingDemoQA {

    private WebDriver driver;

    public CarritoDeCompraShoppingDemoQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    /***************************CORRESPONDIENTE AL CARRITO DE COMPRAS*******************************************************/
    @FindBy(id = "menuCart")
    private WebElement CarritoCompra;
    @FindBy(id = "checkOutButton")
    private WebElement Pagar;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]")
    private WebElement DatosPersonales;
    @FindBy(id = "next_btnundefined")
    private WebElement btonNext;
    @FindBy(id = "pay_now_btn_MasterCredit")
    private WebElement PagarTotal;
    @FindBy(name = "save_to_cart")
    private WebElement botonAnadeCarrito;
    @FindBy(xpath = "//body[1]/div[3]/nav[1]/a[1]")
    private WebElement FrondPrincipal;

    public void pagoCarritoCompra() throws InterruptedException {

        boolean elementoCarrito = metodosGenericos.visualizarObjeto(CarritoCompra, 10);
        if (elementoCarrito) {
            addWebReportImage("Pago De Carrito De Compras", "Selecciona Carrito Compras", Status.PASS, false);
            CarritoCompra.click();
        } else {
            addWebReportImage("Error! Pago De Carrito De Compras", "No Se Pudo Seleccionar Carrito Compras", Status.FAIL, false);
        }
        Thread.sleep(2000);
        boolean elementoPagar = metodosGenericos.visualizarObjeto(Pagar, 10);
        if (elementoPagar) {
            addWebReportImage("Pago De Carrito De Compras", "Realiza Pago Carrito Compras", Status.PASS, false);
            Pagar.click();
        } else {
            addWebReportImage("Error! Pago De Carrito De Compras", "No Se Pudo Realizar Pago Carrito Compras", Status.FAIL, false);
        }
        Thread.sleep(2000);
        boolean elementoDatosPer = metodosGenericos.visualizarObjeto(DatosPersonales, 10);
        if (elementoDatosPer) {
            addWebReportImage("Pago De Carrito De Compras", "Agrega Datos Personales Al Carrito", Status.PASS, false);
            DatosPersonales.click();
        } else {
            addWebReportImage("Error! Pago De Carrito De Compras", "No Se Pudo Agregar Datos Personales Al Carrito", Status.FAIL, false);
        }
        Thread.sleep(2000);
        boolean elementoBtonNext = metodosGenericos.visualizarObjeto(btonNext, 10);
        if (elementoBtonNext) {
            addWebReportImage("Pago De Carrito De Compras", "Agrega Datos Personales Al Carrito", Status.PASS, false);
            btonNext.click();
        } else {
            addWebReportImage("Error! Pago De Carrito De Compras", "No Se Pudo Agregar Datos Personales Al Carrito", Status.FAIL, false);
        }
        Thread.sleep(2000);
        boolean elementoTotal = metodosGenericos.visualizarObjeto(PagarTotal, 10);
        if (elementoTotal) {
            addWebReportImage("Pago De Carrito De Compras", "Realiza El Pago Total ", Status.PASS, false);
            PagarTotal.click();
        } else {
            addWebReportImage("Error! Pago De Carrito De Compras", "No Se Pudo Realizar El Pago Total", Status.FAIL, false);
        }
        Thread.sleep(2000);
    }
    /************************************************************************************************************************/


    /***************************CORRESPONDIENTE A CONTACTOS*****************************************************************/
    @FindBy(name = "categoryListboxContactUs")
    private WebElement selectElementMice;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[5]/div[1]/div[1]/div[2]/sec-form[1]/div[1]/div[1]/sec-view[2]/div[1]/select[1]")
    private WebElement selectElementMiceProd;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[5]/div[1]/div[1]/div[2]/sec-form[1]/div[1]/div[1]/sec-view[3]/div[1]/input[1]")
    private WebElement txtEmailContac;
    @FindBy(name = "subjectTextareaContactUs")
    private WebElement txtMensaje;
    @FindBy(id = "send_btnundefined")
    private WebElement btonEnviar;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[5]/div[2]/div[1]/a[1]")
    private WebElement Shoping;

    public void contactenos() throws InterruptedException {
        boolean elementoMice = metodosGenericos.visualizarObjeto(selectElementMice, 10);
        if (elementoMice) {
            addWebReportImage("Contactanos", "Se Ingresa Opcion Contactenos", Status.PASS, false);
            Select selectMice = new Select(selectElementMice);
            selectMice.selectByVisibleText("Mice");
        } else {
            addWebReportImage("Error! Contactanos", "No Se Pudo Ingresar Opcion Contactenos", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoMiceProd = metodosGenericos.visualizarObjeto(selectElementMiceProd, 10);
        if (elementoMiceProd) {
            addWebReportImage("Contactanos", "Se Ingresa Opcion Contactenos", Status.PASS, false);
            Select selectMice = new Select(selectElementMiceProd);
            selectMice.selectByVisibleText("Kensington Orbit 72337 Trackball with Scroll Ring");
        } else {
            addWebReportImage("Error! Contactanos", "No Se Pudo Ingresar Opcion Contactenos", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoEmail = metodosGenericos.visualizarObjeto(txtEmailContac, 10);
        if (elementoEmail) {
            addWebReportImage("Contactenos", "Se Ingresa Email De Contacto", Status.PASS, false);
            txtEmailContac.sendKeys("adminCiisa@example.com");
        } else {
            addWebReportImage("Error! Contactenos", "No Se Pudo Ingresar Email De Contacto", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoMsg = metodosGenericos.visualizarObjeto(txtMensaje, 10);
        if (elementoMsg) {
            addWebReportImage("Contactenos", "Se Ingresa Mensaje Solicitando Ayuda Con Producto", Status.PASS, false);
            txtMensaje.sendKeys("Favor necesito saber mas especificaciones del producto y el valor de envio a regiones adicional a esto el tiempo de entrega");
        } else {
            addWebReportImage("Error! Contactenos", "No Se Pudo Ingresar Mensaje Solicitando Ayuda Con Producto", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoEnviar = metodosGenericos.visualizarObjeto(btonEnviar, 10);
        if (elementoEnviar) {
            addWebReportImage("Contactenos", "Se Realiza Envio De Mensaje", Status.PASS, false);
            btonEnviar.click();
        } else {
            addWebReportImage("Error! Contactenos", "No Se Pudo Realizar Envio De Mensaje", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoShopping = metodosGenericos.visualizarObjeto(Shoping, 10);
        if (elementoShopping) {
            addWebReportImage("Contactenos", "Se Vuelve Al Portal Shopping De Ventas", Status.PASS, false);
            Shoping.click();
        } else {
            addWebReportImage("Error! Contactenos", "No Se Pudo Volver Al Portal Shopping De Venta", Status.FAIL, false);
        }
        Thread.sleep(2000);

    }


    /************************************************************************************************************************/
}
