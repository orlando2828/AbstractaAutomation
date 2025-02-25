package page.mercadoLibre;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.metodosGenericos;

import static constans.Constants.*;
import static constans.Constants.precioProd;
import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;
import static utils.metodosGenericos.esperar;

public class seleccionProductoCategoriaWeb implements seleccionProductoCategoria{

    private WebDriver driver;

    public seleccionProductoCategoriaWeb() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    /**Inicio de portal Home Mercado Libre**********************************/
    @FindBy(xpath = "/html/body/header/div/a[2]")
    private WebElement inicioHome;


    /*********** Seleccion de los primeros productos************************/
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol/li[1]/div/div/div[2]/div[1]/a")
    private WebElement linkProduc_1;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol/li[1]/div/div/div[2]/div[1]")
    private WebElement titleProducto_1;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol/li[1]/div/div/div[2]/div[2]/div[1]/div[1]/div")
    private  WebElement precioProduc_1;

    /*********** Seleccion de los Segundos productos************************/
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol[1]/li[3]/div/div/a")
    private WebElement linkProduc_2;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol[1]/li[3]/div/div/a/div/div[4]/h2")
    private WebElement titleProducto_2;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/section/ol[1]/li[3]/div/div/a/div/div[2]/div/div/div/span[1]/span[2]/span[2]")
    private  WebElement precioProduc_2;

    public void obtieneDescrPrimerProducto(){

        /***Obtiene Link del producto***/
        boolean elementslink = metodosGenericos.visualizarObjeto(linkProduc_1, 5);
        if(elementslink){
            linkProducto= linkProduc_1.getAttribute("href");
            System.out.println("Primer Link :" +linkProducto);
            addWebReportImage("Primer,Producto Seleccionado", "El Link del producto seleccionado es: "+linkProducto, Status.PASS, false);
            reporteObjetoDesplegado(true, "Producto Seleccionado", "El link del producto seleccionado es: " +linkProducto, false);
            Assert.assertTrue(true);
        }else{
            addWebReportImage("Error! Al Seleccionar Segundo Producto", "No es posible seleccionar primer producto y obtener el link de este", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! No es posible, Seleccionar Segundo Producto", "No se pudo obtener  el primer link del producto", false);
            Assert.assertTrue(false);
        }

        /***Obtiene Nombre del producto***/
        boolean elementsProduc = metodosGenericos.visualizarObjeto(titleProducto_1, 5);
        if (elementsProduc){
            metodosGenericos.esperarElemento(titleProducto_1);
            nameProduct=titleProducto_1.getText();
            System.out.println("primer nombre producto"+ nameProduct);
            // UtilsWeb.desenmarcarObjeto(titleProducto_1);
            addWebReportImage("Primer, Producto Seleccionado", "El producto seleccionado es, camiseta: "+nameProduct, Status.PASS, false);
            reporteObjetoDesplegado(true, "Primer, Producto Seleccionado", "El producto seleccionado es, camiseta:" +nameProduct, false);
            Assert.assertTrue(true);
        }else{
            addWebReportImage("Error! Al Seleccionar Producto", "No es posible seleccionar primer producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! No es posible, Seleccionar Primer Producto", "Producto no encontrado", false);
            Assert.assertTrue(false);
        }

        /***Obtiene Nombre del Precio***/
        boolean elementsPrecio = metodosGenericos.visualizarObjeto(precioProduc_1, 5);
        if(elementsPrecio){
            metodosGenericos.esperarElemento(precioProduc_1);
            precioProd=precioProduc_1.getText();
            //UtilsWeb.desenmarcarObjeto(precioProduc_1);
            System.out.println("Primer precio:" + precioProd);
            metodosGenericos.visualizarObjeto(titleProducto_1, 3);
            titleProducto_1.click();
            addWebReportImage("Primer,Producto Seleccionado", "El Valor producto seleccionado es: "+precioProd, Status.PASS, false);
            reporteObjetoDesplegado(true, "Primer,Producto Seleccionado", "El valor producto seleccionado es:" +precioProd, false);
            Assert.assertTrue(true);

        }else{
            addWebReportImage("Error! Al Seleccionar Producto", "No es posible seleccionar primer precio producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! No es posible, Seleccionar Primer Precio Producto", "Producto no encontrado", false);
            Assert.assertTrue(false);
        }

        /**Vuelvo a pagina de Inicio*/
        metodosGenericos.visualizarObjeto(inicioHome, 5);
        inicioHome.click();
        esperar(3);

    }

    public void obtieneDescrSegundoProducto(){

        /***Obtiene Link del producto***/
        boolean elementslink = metodosGenericos.visualizarObjeto(linkProduc_2, 5);
        if(elementslink){
            linkProducto= linkProduc_2.getAttribute("href");
            System.out.println("Segundo Link Categoria Ropa Interior:" +linkProducto);
            addWebReportImage("Segundo, Producto Seleccionado", "El Link del producto seleccionado es: "+linkProducto, Status.PASS, false);
            reporteObjetoDesplegado(true, "Producto Seleccionado", "El link del producto seleccionado es:" +linkProducto, false);
            Assert.assertTrue(true);
        }else{
            addWebReportImage("Error! Al Seleccionar Segundo Producto", "No es posible seleccionar el producto y obtener el link de este", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, Seleccionar Producto", "No se pudo obtener el link del producto", false);
            Assert.assertTrue(false);
        }

        /***Obtiene Nombre del producto***/
        boolean elementsProduc = metodosGenericos.visualizarObjeto(titleProducto_2, 10);
        if (elementsProduc){
            metodosGenericos.esperarElemento(titleProducto_2);
            nameProduct=titleProducto_2.getText();
            System.out.println("Segundo nombre producto: "+nameProduct);
            //UtilsWeb.desenmarcarObjeto(titleProducto_2);
            addWebReportImage("Segundo, Producto Seleccionado Ropa Interior", "El producto seleccionado es, camiseta: "+nameProduct, Status.PASS, false);
            reporteObjetoDesplegado(true, "Segundo, Producto Seleccionado", "El producto seleccionado es, camiseta:" +nameProduct, false);
            Assert.assertTrue(true);
        }else{
            addWebReportImage("Error! Al Seleccionar Segundo Producto Ropa Interior", "No es posible seleccionar el producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "Error! No es posible, Seleccionar Segundo Producto Ropa Interior", "Producto no encontrado", false);
            Assert.assertTrue(false);
        }

        /***Obtiene Nombre del Precio***/
        boolean elementsPrecio = metodosGenericos.visualizarObjeto(precioProduc_2, 10);
        if(elementsPrecio){
            metodosGenericos.esperarElemento(precioProduc_2);
            precioProd=precioProduc_2.getText();
            System.out.println("segundo precio:  "+precioProd);
            //UtilsWeb.desenmarcarObjeto(precioProduc_2);
            metodosGenericos.visualizarObjeto(titleProducto_2, 3);
            titleProducto_2.click();
            addWebReportImage("Segundo, Producto Seleccionado Ropa Interior", "El Valor producto seleccionado es: "+precioProd, Status.PASS, false);
            reporteObjetoDesplegado(true, "Producto Seleccionado Ropa Interior", "El valor producto seleccionado es:" +precioProd, false);
            Assert.assertTrue(true);
        }else{
            addWebReportImage("Error! Al Seleccionar Segundo Producto Ropa Interior", "No es posible seleccionar precio del producto", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, Seleccionar Segundo Producto", "Precio del producto no encontrado", false);
            Assert.assertTrue(false);
        }

        /**Vuelvo a pagina de Inicio*/
        metodosGenericos.visualizarObjeto(inicioHome, 5);
        inicioHome.click();
        esperar(3);
    }

}
