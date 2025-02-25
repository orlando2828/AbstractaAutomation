package page.demoQA;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class radioButtonTollsQA {

    private WebDriver driver;

    public radioButtonTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    //@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")
    @FindBy (id = "item-2")
    private WebElement BotonRadioButton;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]")
    private WebElement OptionYes;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]")
    private WebElement OptionImpres;


    public void radioButton(){

        boolean radioButton = metodosGenericos.visualizarObjeto(BotonRadioButton, 5);
        if (radioButton) {
            BotonRadioButton.click();
            addWebReportImage("Radio Button ", "text box", Status.PASS, false);
            System.out.println("Se realiza click en opcion ChecBox del menu lateral izquierdo");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click en boton Sumit ");

        }

    }

    public void formularioRadioButton() throws InterruptedException {

        boolean opcionYes = metodosGenericos.visualizarObjeto(OptionYes, 5);
        if (opcionYes) {
            OptionYes.click();
            addWebReportImage("Radio Button ", "text box", Status.PASS, false);
            System.out.println("Se realiza click option Yes");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click option Yes");

        }

        boolean opcionImpr = metodosGenericos.visualizarObjeto(OptionImpres, 5);
        if (opcionImpr) {
            Thread.sleep(400);
            OptionImpres.click();
            addWebReportImage("Radio Button ", "text box", Status.PASS, false);
            System.out.println("Se realiza click Option Impressive");

        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar click Option Impressive");

        }

    }
}

