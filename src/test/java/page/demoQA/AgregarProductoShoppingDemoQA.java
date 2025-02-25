package page.demoQA;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class AgregarProductoShoppingDemoQA {

    private WebDriver driver;

    public AgregarProductoShoppingDemoQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    /***************************CORRESPONDIENTE A LA SELECCION DE PARLANTES**************************************************/
    @FindBy(id = "speakersImg")
    private WebElement btonSpeaker;
    @FindBy(id = "accordionPrice")
    private WebElement btonPrecio;
    @FindBy(id = "accordionAttrib0")
    private WebElement btonCompatib;
    @FindBy(id = "compatibility_0")
    private WebElement OptionCompatibOne;
    @FindBy(id = "compatibility_1")
    private WebElement OptionCompatibDos;
    @FindBy(id = "accordionAttrib1")
    private WebElement btonFabricante;
    @FindBy(id = "manufacturer_1")
    private WebElement OptionHP;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/h4[1]")
    private WebElement BotonTecnologia;
    @FindBy(id = "wireless_technology_0")
    private WebElement OptionBluetho;
    @FindBy(id = "accordionColor")
    private WebElement OptionColor;
    @FindBy(id = "24")
    private WebElement SeleccionAltavosHP;
    @FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]")
    private WebElement SeleccionCant;
    @FindBy(name = "save_to_cart")
    private WebElement botonAnadeCarrito;
    @FindBy(xpath = "//body[1]/div[3]/nav[1]/a[1]")
    private WebElement FrondPrincipal;

    public void agregaParlantes(){

        boolean elementobtnSpeaker = metodosGenericos.visualizarObjeto(btonSpeaker, 10);
        if (elementobtnSpeaker) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion de Compra Producto Speakers", Status.PASS, false);
            btonSpeaker.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No se pudo Acceder La Opcion de Compra Producto Speakers", Status.FAIL, false);
        }

        boolean elementobtonPrecio = metodosGenericos.visualizarObjeto(btonPrecio, 10);
        if (elementobtonPrecio) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Click En El Precio Del Producto", Status.PASS, false);
            btonPrecio.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Realizar Click En El Precio Del Producto", Status.FAIL, false);
        }

        boolean elementoCompatibilidad = metodosGenericos.visualizarObjeto(btonCompatib, 10);
        if (elementoCompatibilidad) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion de Compatibilidad Del Producto", Status.PASS, false);
            btonCompatib.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion de Compatibilidad Del Producto", Status.FAIL, false);
        }

        boolean elementoCompatibOne = metodosGenericos.visualizarObjeto(OptionCompatibOne, 10);
        if (elementoCompatibOne) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion de Compatibilidad Del Producto One", Status.PASS, false);
            OptionCompatibOne.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion de Compatibilidad Del Producto", Status.FAIL, false);
        }

        boolean elementoCompatibDos = metodosGenericos.visualizarObjeto(OptionCompatibDos, 10);
        if (elementoCompatibDos) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion de Compatibilidad Del Producto Dos", Status.PASS, false);
            OptionCompatibDos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion de Compatibilidad Del Producto", Status.FAIL, false);
        }

        boolean elementoFabricante = metodosGenericos.visualizarObjeto(btonFabricante, 10);
        if (elementoFabricante) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion de Fabricante Del Producto Dos", Status.PASS, false);
            btonFabricante.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion de Fabricante Del Producto", Status.FAIL, false);
        }

        boolean elementoOptionHP = metodosGenericos.visualizarObjeto(OptionHP, 10);
        if (elementoOptionHP) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion HP Del Producto", Status.PASS, false);
            OptionHP.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion HP Del Producto", Status.FAIL, false);
        }

        boolean elementoTecnologia = metodosGenericos.visualizarObjeto(BotonTecnologia, 10);
        if (elementoTecnologia) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion Tecnologia Del Producto", Status.PASS, false);
            BotonTecnologia.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion Tecnologia Del Producto", Status.FAIL, false);
        }

        boolean elementoOptionBluetho = metodosGenericos.visualizarObjeto(OptionBluetho, 10);
        if (elementoOptionBluetho) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion Bluetooth Del Producto", Status.PASS, false);
            OptionBluetho.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion Bluetooth Del Producto", Status.FAIL, false);
        }

        boolean elementoOptionColor = metodosGenericos.visualizarObjeto(OptionColor, 10);
        if (elementoOptionColor) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion Color Del Producto", Status.PASS, false);
            OptionColor.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion Color Del Producto", Status.FAIL, false);
        }

        boolean elementoAltavoz = metodosGenericos.visualizarObjeto(SeleccionAltavosHP, 10);
        if (elementoAltavoz) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona La Opcion Altavoz Del Producto", Status.PASS, false);
            SeleccionAltavosHP.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar La Opcion Altavoz Del Producto", Status.FAIL, false);
        }

        boolean elementoSeleccionCant = metodosGenericos.visualizarObjeto(SeleccionCant, 10);
        if (elementoSeleccionCant) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Selecciona Cantidad Del Producto", Status.PASS, false);
            SeleccionCant.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Seleccionar Cantidad Del Producto", Status.FAIL, false);
        }

        boolean elementoCarro = metodosGenericos.visualizarObjeto(botonAnadeCarrito, 10);
        if (elementoCarro) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Agrega Producto Al Carro De Compras", Status.PASS, false);
            botonAnadeCarrito.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Agregar Producto Al Carro De Compras", Status.FAIL, false);
        }

        /**DESPUES DE LA COMPRA VUELVA A LA PAGINA HOME*/
        boolean elementoHomePage = metodosGenericos.visualizarObjeto(FrondPrincipal, 10);
        if (elementoHomePage) {
            addWebReportImage("Pagina Principal Shooping", "Vuelve a Pagina Principal Inicial", Status.PASS, false);
            FrondPrincipal.click();
        } else {
            addWebReportImage("Error! Al Volver a Pagina Principal Shooping", "No Se Puede Volver aPagina Principal Inicial", Status.FAIL, false);
        }

    }
    /************************************************************************************************************************/


    /***************************CORRESPONDIENTE A LA SELECCION DE TABLETS****************************************************/
    @FindBy(id = "tabletsImg")
    private WebElement btonTabletsImg;
    @FindBy(id = "accordionPrice")
    private WebElement OptionPrecioTB;
    @FindBy(id = "accordionAttrib0")
    private WebElement OptionMonitor;
    @FindBy(id = "display_1")
    private WebElement PantallaUno;
    @FindBy(id = "display_0")
    private WebElement PantallaDos;
    @FindBy(id = "display_2")
    private WebElement PantallaTres;
    @FindBy(id = "accordionAttrib1")
    private WebElement OptionProcesador;
    @FindBy(id = "processor_2")
    private WebElement ProcesDos;
    @FindBy(id = "17")
    private WebElement SelecionaTablets;

    public void agregaTablets(){

        boolean elementoTablets = metodosGenericos.visualizarObjeto(btonTabletsImg, 10);
        if (elementoTablets) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion de Compra Producto Tablets", Status.PASS, false);
            btonTabletsImg.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion de Compra Producto Tablets", Status.FAIL, false);
        }

        boolean elementoPrecio = metodosGenericos.visualizarObjeto(OptionPrecioTB, 10);
        if (elementoPrecio) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Precio Del Producto Tablets", Status.PASS, false);
            OptionPrecioTB.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoMonitor = metodosGenericos.visualizarObjeto(OptionMonitor, 10);
        if (elementoMonitor) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Monitor Del Producto Tablets", Status.PASS, false);
            OptionPrecioTB.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Monitor Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoPantallaUno = metodosGenericos.visualizarObjeto(PantallaUno, 10);
        if (elementoPantallaUno) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Monitor 1 Del Producto Tablets", Status.PASS, false);
            OptionPrecioTB.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Monitor 1 Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoPantallaDos = metodosGenericos.visualizarObjeto(PantallaDos, 10);
        if (elementoPantallaDos) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Monitor 2 Del Producto Tablets", Status.PASS, false);
            PantallaDos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Monitor 2 Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoPantallaTres = metodosGenericos.visualizarObjeto(PantallaDos, 10);
        if (elementoPantallaTres) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Monitor 3 Del Producto Tablets", Status.PASS, false);
            PantallaTres.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Monitor 3 Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoOptProcesador = metodosGenericos.visualizarObjeto(OptionProcesador, 10);
        if (elementoOptProcesador) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Procedador Del Producto Tablets", Status.PASS, false);
            OptionProcesador.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Procedador Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoProcesador = metodosGenericos.visualizarObjeto(ProcesDos, 10);
        if (elementoOptProcesador) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Procedador 1 Del Producto Tablets", Status.PASS, false);
            ProcesDos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Procedador 1 Del Producto Tablets", Status.FAIL, false);
        }

        boolean elementoSelecTB = metodosGenericos.visualizarObjeto(SelecionaTablets, 10);
        if (elementoSelecTB) {
            addWebReportImage("Agrega Productos Relacionados a Tabletes", "Selecciona La Opcion Procedador 1 Del Producto Tablets", Status.PASS, false);
            SelecionaTablets.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Acceder La Opcion Procedador 1 Del Producto Tablets", Status.FAIL, false);
        }

        /**DESPUES DE LA COMPRA VUELVA A LA PAGINA HOME*/
        boolean elementoHomePage = metodosGenericos.visualizarObjeto(FrondPrincipal, 10);
        if (elementoHomePage) {
            addWebReportImage("Pagina Principal Shooping", "Vuelve a Pagina Principal Inicial", Status.PASS, false);
            FrondPrincipal.click();
        } else {
            addWebReportImage("Error! Al Volver a Pagina Principal Shooping", "No Se Puede Volver aPagina Principal Inicial", Status.FAIL, false);
        }
    }
    /************************************************************************************************************************/


    /***************************CORRESPONDIENTE A LA SELECCION DE LAPTOS****************************************************/
    @FindBy(id = "laptopsImg")
    private WebElement btonLaptopsImg;
    @FindBy(id = "accordionPrice")
    private WebElement PrecioLap;
    @FindBy(id = "accordionAttrib0")
    private WebElement MonitorLap;
    @FindBy(id = "accordionAttrib1")
    private WebElement SistemaLap;
    @FindBy(id = "operating_system_1")
    private WebElement optwin10;
    @FindBy(id = "accordionAttrib2")
    private WebElement ProcesadorLap; //no va
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[7]/p[1]/a[1]")
    private WebElement SeleccionaLap;

    public void agregaLaptos(){
        boolean elementoLaptos = metodosGenericos.visualizarObjeto(btonLaptopsImg, 10);
        if (elementoLaptos) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona La Opcion de Compra Producto Laptos", Status.PASS, false);
            btonLaptopsImg.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion de Compra Producto Laptos", Status.FAIL, false);
        }

        boolean elementoPrecio = metodosGenericos.visualizarObjeto(PrecioLap, 10);
        if (elementoPrecio) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona La Opcion Precio Del Producto Laptos", Status.PASS, false);
            PrecioLap.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion Precio Del Producto Laptos", Status.FAIL, false);
        }

        boolean elementoMonitor = metodosGenericos.visualizarObjeto(MonitorLap, 10);
        if (elementoMonitor) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona La Opcion Precio Del Producto Laptos", Status.PASS, false);
            MonitorLap.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion Precio Del Producto Laptos", Status.FAIL, false);
        }

        boolean elementoSistema = metodosGenericos.visualizarObjeto(SistemaLap, 10);
        if (elementoSistema) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona La Opcion Sistema Del Producto Laptos", Status.PASS, false);
            SistemaLap.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion Sistema Del Producto Laptos", Status.FAIL, false);
        }

        boolean elementoWin10 = metodosGenericos.visualizarObjeto(optwin10, 10);
        if (elementoWin10) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona La Opcion Windows 10 Del Producto Laptos", Status.PASS, false);
            optwin10.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No se pudo Acceder La Opcion Windows 10 Del Producto Laptos", Status.FAIL, false);
        }

        boolean elementoSelLapto = metodosGenericos.visualizarObjeto(SeleccionaLap, 10);
        if (elementoSelLapto) {
            addWebReportImage("Agrega Productos Relacionados a Laptos", "Selecciona Producto Laptos", Status.PASS, false);
            SeleccionaLap.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Tabletes", "No Se Pudo Seleccionar Producto Laptos", Status.FAIL, false);
        }

        /**DESPUES DE LA COMPRA VUELVA A LA PAGINA HOME*/
        boolean elementoHomePage = metodosGenericos.visualizarObjeto(FrondPrincipal, 10);
        if (elementoHomePage) {
            addWebReportImage("Pagina Principal Shooping", "Vuelve a Pagina Principal Inicial", Status.PASS, false);
            FrondPrincipal.click();
        } else {
            addWebReportImage("Error! Al Volver a Pagina Principal Shooping", "No Se Puede Volver aPagina Principal Inicial", Status.FAIL, false);
        }
    }
    /************************************************************************************************************************/


    /***************************CORRESPONDIENTE A LA SELECCION DE LAPTOS****************************************************/
    @FindBy(id = "headphonesImg")
    private WebElement menuAudifonos;
    @FindBy(id = "accordionPrice")
    private WebElement precioAudifonos;
    @FindBy(id = "accordionAttrib0")
    private WebElement compatyAudifonos;
    @FindBy(id = "accordionAttrib1")
    private WebElement opcionAudifonos;
    @FindBy(id = "accordionAttrib2")
    private WebElement Weight;
    @FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/p[1]/a[1]")
    private WebElement SeleccionaAudif;

    public void agregaAudifonos() throws InterruptedException {
        boolean elementoAudifono = metodosGenericos.visualizarObjeto(menuAudifonos, 10);
        if (elementoAudifono) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Agrega Producto Audifono", Status.PASS, false);
            menuAudifonos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Agregar Producto Audifono", Status.FAIL, false);
        }

        boolean elementoPrecio = metodosGenericos.visualizarObjeto(precioAudifonos, 10);
        if (elementoPrecio) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Seleccion Precio De Producto Audifono", Status.PASS, false);
            precioAudifonos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Seleccionar Precio De Producto Audifono", Status.FAIL, false);
        }

        boolean elementoCompatibilidad = metodosGenericos.visualizarObjeto(compatyAudifonos, 10);
        if (elementoCompatibilidad) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Seleccion Opciones De Compatibilidad De Producto Audifono", Status.PASS, false);
            compatyAudifonos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Seleccionar Opciones De Compatibilidad De Producto Audifono", Status.FAIL, false);
        }

        boolean elementoOpcion = metodosGenericos.visualizarObjeto(opcionAudifonos, 10);
        if (elementoOpcion) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Seleccion Opciones Del Producto Audifono", Status.PASS, false);
            opcionAudifonos.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Seleccionar Opciones Del Producto Audifono", Status.FAIL, false);
        }

        boolean elementoWeight = metodosGenericos.visualizarObjeto(Weight, 10);
        if (elementoWeight) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Seleccion Opciones Del Producto Audifono", Status.PASS, false);
            Weight.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Seleccionar Opciones Del Producto Audifono", Status.FAIL, false);
        }

        boolean elementoSeleccion = metodosGenericos.visualizarObjeto(SeleccionaAudif, 10);
        if (elementoSeleccion) {
            addWebReportImage("Agrega Productos Relacionados a Audifonos", "Selecciona Producto Audifono", Status.PASS, false);
            SeleccionaAudif.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados a Audifonos", "No Se Pudo Seleccionar Producto Audifono", Status.FAIL, false);
        }
        Thread.sleep(1000);
        boolean elementoCarro = metodosGenericos.visualizarObjeto(botonAnadeCarrito, 10);
        if (elementoCarro) {
            addWebReportImage("Agrega Productos Relacionados Con Speakers", "Agrega Producto Al Carro De Compras", Status.PASS, false);
            botonAnadeCarrito.click();
        } else {
            addWebReportImage("Error! Al Agregar Productos Relacionados Con Speakers", "No Se Pudo Agregar Producto Al Carro De Compras", Status.FAIL, false);
        }
        Thread.sleep(1000);
        /**DESPUES DE LA COMPRA VUELVA A LA PAGINA HOME*/
        boolean elementoHomePage = metodosGenericos.visualizarObjeto(FrondPrincipal, 10);
        if (elementoHomePage) {
            addWebReportImage("Pagina Principal Shooping", "Vuelve a Pagina Principal Inicial", Status.PASS, false);
            FrondPrincipal.click();
        } else {
            addWebReportImage("Error! Al Volver a Pagina Principal Shooping", "No Se Puede Volver aPagina Principal Inicial", Status.FAIL, false);
        }
        Thread.sleep(1000);
    }
    /************************************************************************************************************************/

}
