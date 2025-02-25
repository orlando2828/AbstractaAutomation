package page.mercadoLibre;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.metodosGenericos;

import static reportePdf.ImedReports.reporteObjetoDesplegado;
import static utils.HtmlReport.addWebReportImage;

public class categoriaDeBusquedaWeb implements categoriaDeBusqueda {

    private WebDriver driver;

    public categoriaDeBusquedaWeb() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }




    /**Criterio de Envio*/
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/aside/div[3]/div[1]/ul/li/section/button/label[1]")
    private WebElement optionFull;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/aside/div[3]/div[2]/ul/li/section/button/label")
    private WebElement optionGratis ;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/aside/div[3]/div[3]/ul/li/section/button/label[1]/svg")
    private WebElement optionInternacional;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[1]/ul/li/section/div")
    private WebElement selectorFull ;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[2]/ul/li/section/div")
    private WebElement selectorGratis ;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[3]/ul/li/section/div")
    private WebElement selectorIntern ;

    /**Criterio de busqueda por genero*/
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[5]/ul/li[1]/form/button")
    private WebElement opcionMujer;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[5]/ul/li[2]/form/button/span[1]")
    private WebElement opcionHombre;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[5]/ul/li[3]/form/button/span[1]")
    private WebElement opcionSinGnero ;

    /**Criterio de busqueda por Categoria*/
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[6]/ul/li[1]/form/button/span[1]")
    private WebElement categoriaDeporte;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[6]/ul/li[2]/form/button/span[1]")
    private WebElement categoriaPoleras;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[6]/ul/li[3]/form/button/span[1]")
    private WebElement categoriaBlusas;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[6]/ul/li[4]/form/button/span[1]")
    private WebElement categoriaCamisas;
    @FindBy(xpath ="//*[@id=\"root-app\"]/div/div/aside/div[3]/div[6]/ul/li[5]/form/button/span[1]")
    private WebElement categoriaRopaInt;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/aside/div[3]/div[4]/ul/li[1]/form/button/span[1]")
    private WebElement categoriaRopa_Lencecia;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div/aside/div[3]/div[4]/ul/li[1]/form/button/span[1]")
    private WebElement categoriaLenceria;

    public void  tipoDeEnvio(String tipoEnvio){

        boolean elementsFull = metodosGenericos.visualizarObjeto(optionFull, 5);
        boolean elementsGratis = metodosGenericos.visualizarObjeto(optionGratis, 5);
        boolean elementsInter = metodosGenericos.visualizarObjeto(optionInternacional, 5);


        if (elementsFull){
            metodosGenericos.esperarElemento(selectorFull);
            selectorFull.click();
            addWebReportImage("Opcion envio Full", "Seleccion correcta opcion Envio Full", Status.PASS, false);
            reporteObjetoDesplegado(true, "Opcion envio Full", "Seleccion correcta opcion Envio Full", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta opcion Envio Full", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta de Envio", false);
            System.out.println("Seleccion incorrecta opcion Envio Full");
            Assert.assertTrue(false);
        }

        if (elementsGratis){
            metodosGenericos.esperarElemento(selectorGratis);
            selectorGratis.click();
            addWebReportImage("Opcion envio Gratis", "Seleccion correcta opcion Envio Gratis", Status.PASS, false);
            reporteObjetoDesplegado(true, "Opcion envio Full", "Seleccion correcta opcion Envio Gratis", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta opcion Envio Gratis", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta de Envio", false);
            System.out.println("Seleccion incorrecta opcion Envio Gratis");
            Assert.assertTrue(false);
        }

        if (elementsInter){
            metodosGenericos.esperarElemento(selectorIntern);
            selectorIntern.click();
            addWebReportImage("Opcion envio Gratis", "Seleccion correcta opcion Envio Internacional", Status.PASS, false);
            reporteObjetoDesplegado(true, "Opcion envio Full", "Seleccion correcta opcion Envio Internacional", false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta opcion Envio Internacional", Status.FAIL, false);
            reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de envio", "Seleccion incorrecta de Envio", false);
            System.out.println("Seleccion incorrecta opcion Envio Internacional");
            Assert.assertTrue(false);
        }

    }

    public void busquedaPorGenero(String Genero){
        boolean elementsMujer = metodosGenericos.visualizarObjeto(opcionMujer, 5);
        boolean elementsHombre = metodosGenericos.visualizarObjeto(opcionHombre, 5);
        boolean elementsSinGenero = metodosGenericos.visualizarObjeto(opcionSinGnero, 5);

        switch (Genero) {
            case "Mujer":
                if (elementsMujer) {
                    metodosGenericos.esperarElemento(opcionMujer);
                    opcionMujer.click();
                    addWebReportImage("Busqueda por Genero", "Seleccion correcta opcion Mujer", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Genero", "Seleccion correcta Genero Mujer", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Genero Mujer", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Genero Mujer", false);
                    System.out.println("Seleccion incorrecta, Genero Mujer");
                    Assert.assertTrue(false);
                }
                break;
            case "Hombre":
                if (elementsHombre) {
                    metodosGenericos.esperarElemento(opcionHombre);
                    opcionHombre.click();
                    addWebReportImage("Busqueda por Genero", "Seleccion correcta opcion Hombre", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Genero", "Seleccion correcta Genero Hombre", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Genero Hombre", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Genero Hombre", false);
                    System.out.println("Seleccion incorrecta, Genero Hombre ");
                    Assert.assertTrue(false);
                }
                break;
            case "Sin Genero" :
                if (elementsSinGenero) {
                    metodosGenericos.esperarElemento(opcionSinGnero);
                    opcionSinGnero.click();
                    addWebReportImage("Busqueda por Genero", "Seleccion correcta opcion sin genero", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Genero", "Seleccion correcta sin genero", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Sin Genero", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar Busqueda por Genero", "Seleccion incorrecta, Sin Genero", false);
                    System.out.println("Seleccion incorrecta, Opcion Sin Genero ");
                    Assert.assertTrue(false);
                }
                break;

        }
    }

    public void busquedaPorCategoria(String Categoria){
        boolean elementsDeporte = metodosGenericos.visualizarObjeto(categoriaDeporte, 5);
        boolean elementsPoleras = metodosGenericos.visualizarObjeto(categoriaPoleras, 5);
        boolean elementsBlusas = metodosGenericos.visualizarObjeto(categoriaBlusas, 5);
        boolean elementsCamisas = metodosGenericos.visualizarObjeto(categoriaCamisas, 5);
        boolean elementsRopaint = metodosGenericos.visualizarObjeto(categoriaRopaInt, 5);

        switch (Categoria) {
            case "Deporte":

                if (elementsDeporte) {
                    metodosGenericos.esperarElemento(categoriaDeporte);
                    categoriaDeporte.click();
                    addWebReportImage("Busqueda por Categoria", "Seleccion correcta, busqueda por categoria deporte", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Categoria", "Seleccion correcta, busqueda por categoria deporte", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria deporte", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria deporte", false);
                    System.out.println("Seleccion incorrecta Categoria deporte");
                    Assert.assertTrue(false);
                }
                break;
            case "Poleras":
                if (elementsPoleras) {
                    metodosGenericos.esperarElemento(categoriaPoleras);
                    categoriaPoleras.click();
                    addWebReportImage("Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Poleras", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Poleras", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Poleras", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Poleras", false);
                    System.out.println("Seleccion incorrecta Categoria Poleras");
                    Assert.assertTrue(false);
                }
                break;
            case "Blusas":
                if (elementsBlusas) {
                    metodosGenericos.esperarElemento(categoriaBlusas);
                    categoriaBlusas.click();
                    addWebReportImage("Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Blusas", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Blusas", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Blusas", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Blusas", false);
                    System.out.println("Seleccion incorrecta Categoria Blusas");
                    Assert.assertTrue(false);
                }
                break;
            case "Camisetas":
                if (elementsCamisas) {
                    metodosGenericos.esperarElemento(categoriaCamisas);
                    categoriaCamisas.click();
                    addWebReportImage("Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Camisas", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Camisas", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Camisas", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Camisas", false);
                    System.out.println("Seleccion incorrecta Categoria Camisas");
                    Assert.assertTrue(false);
                }
                break;
            case "Ropa Interior":
                if (elementsRopaint) {
                    metodosGenericos.esperarElemento(categoriaRopaInt);
                    categoriaRopaInt.click();
                    metodosGenericos.esperarElemento(categoriaRopa_Lencecia);
                    categoriaRopa_Lencecia.click();
                    metodosGenericos.esperarElemento(categoriaLenceria);
                    categoriaLenceria.click();
                    addWebReportImage("Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Ropa interior", Status.PASS, false);
                    reporteObjetoDesplegado(true, "Busqueda por Categoria", "Seleccion correcta, busqueda por categoria Ropa interior", false);
                    Assert.assertTrue(true);
                } else {
                    addWebReportImage("Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Ropa interior", Status.FAIL, false);
                    reporteObjetoDesplegado(false, "\"Error! No es posible, seleccionar este tipo de categoria", "Seleccion incorrecta categoria Ropa interior", false);
                    System.out.println("Seleccion incorrecta Categoria Ropa interior");
                    Assert.assertTrue(false);
                }
                break;

        }

    }

}
