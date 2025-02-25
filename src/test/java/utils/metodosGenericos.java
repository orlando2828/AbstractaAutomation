package utils;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reportePdf.EstadoPrueba;
import reportePdf.ImedReports;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static reportePdf.EstadoPrueba.PASSED;
import static reportePdf.EstadoPrueba.FAILED;
import static utils.HtmlReport.addWebReportImage;



public class metodosGenericos {
    private static WebDriver driver;
    public metodosGenericos() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);

    }

    public static String tipoAmbiente() {
        if ("QA".equals("QA")) {
            return "Certificación";
        } else {
            return "QA".equals("INT") ? "Integración" : "Desarrollo";
        }
    }

    public static void esperar(int segundos) {
        System.out.println("Inicia la espera de " + segundos + " segundos;");
        long start = System.nanoTime();
        long end = 0L;
        long microseconds = 0L;
        long tiempoTranscurrido = 0L;

        do {
            end = System.nanoTime();
            microseconds = end - start;
            tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
        } while(tiempoTranscurrido < (long)segundos);

        System.out.println("Fin de la espera de " + segundos + " segundos;");
    }
    public static boolean esperarElemento(WebElement objeto) {
        boolean existe = false;
        int intentos = 0;
        while(!existe & intentos < 10) {
            System.out.println("Esperando: [ " + (intentos + 1) + " de 10 ]");
            existe = visualizarObjeto(objeto, 5);
            if (!existe) {
                ++intentos;
            }
        }
        if(intentos >= 10){
            HtmlReport.addErrorMessage("No se pudo encontrar el WebElement" +objeto);
            HtmlReport.fail("No se pudo encontrar el WebElement" +objeto);
            Assert.fail();
        }
        return existe;
    }

    public  static void elimiarEditar(String editElim, String Texto){

        int rowCount= driver.findElements(By.xpath("//table[@class='table table-striped datatable']/tbody/tr")).size();
        System.out.println("de es de "+rowCount);

        switch (editElim){
            case "Eliminar":

                while (rowCount>=0){

                    String valTr = String.valueOf(rowCount);
                    String TR ="//table[@class='table table-striped datatable']/tbody//tr[#]";
                    TR = TR.replace("#",valTr);
                    System.out.println("xpathhhhhh"+TR);
                    WebElement tr1 = driver.findElement(By.xpath(TR));
                    String textBuscar = tr1.getText();
                    //String ComunaAlias = Texto;
                    System.out.println("nombre a pagina es :"+textBuscar);
                    System.out.println("nombre a paremtros es :"+Texto);

                    if(textBuscar.equals(Texto)){
                        System.out.println("texto encontrado");

                        String xpathedit ="//td[contains(@class,'text-right')]/button";
                        String btnedit = TR+xpathedit;
                        WebElement edit = driver.findElement(By.xpath(btnedit));
                        boolean Edit = visualizarObjeto(edit, 10);
                        if (Edit) {
                            edit.click();
                            addWebReportImage("Se edita la Instituciones", "Ingresar datos de acceso", Status.PASS, false);
                        } else {
                            addWebReportImage("Se edita la Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                        }break;

                    }else {
                        System.out.println("no se encuentra el texto");
                        rowCount=rowCount-1;
                        System.out.println("row es de "+rowCount);
                    }
                    break;
                }




                break;
            case "Editar":

                while (rowCount>=0){

                    String valTr = String.valueOf(rowCount);
                    String TR ="//table[@class='table table-striped datatable']/tbody//tr[#]";
                    TR = TR.replace("#",valTr);
                    System.out.println("xpathhhhhh"+TR);
                    WebElement tr1 = driver.findElement(By.xpath(TR));
                    String textBuscar = tr1.getText();
                    //String ComunaAlias = Texto;
                    System.out.println("nombre a pagina es :"+textBuscar);
                    System.out.println("nombre a paremtros es :"+Texto);

                    if(textBuscar.equals(Texto)){
                        System.out.println("texto encontrado");

                        String xpathedit ="//td[contains(@class,'text-right')]/a";
                        String btnedit = TR+xpathedit;
                        WebElement edit = driver.findElement(By.xpath(btnedit));
                        boolean Edit = visualizarObjeto(edit, 10);
                        if (Edit) {
                            edit.click();
                            addWebReportImage("Se edita la Instituciones", "Ingresar datos de acceso", Status.PASS, false);
                        } else {
                            addWebReportImage("Se edita la Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
                        }break;

                    }else {
                        System.out.println("no se encuentra el texto");
                        rowCount=rowCount-1;
                        System.out.println("row es de "+rowCount);
                    }

                }

                break;


        }

    }

    public static boolean visualizarObjeto(WebElement elementName, int timeout) {
        try{
            System.out.println("Valida si es visible el elemento a válidar.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), timeout);
            wait.until(ExpectedConditions.visibilityOf(elementName));
            System.out.println("Es visible el elemento : "+elementName);
            return true;
        }catch(Exception e){
            HtmlReport.addErrorMessage(e.getMessage());
            System.out.println("No es visible el elemento : " +elementName);
            return false;
        }
    }



    public static void robotDisco() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.delay(20);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        //robot.delay(50);
    }

    public static void robotSlash() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_NUMPAD9);
        robot.keyRelease(KeyEvent.VK_NUMPAD9);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_NUMPAD2);
        robot.keyRelease(KeyEvent.VK_NUMPAD2);
        robot.keyRelease(KeyEvent.VK_ALT);
        //robot.delay(50);
    }

    public static void robotComma() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_NUMPAD5);
        robot.keyRelease(KeyEvent.VK_NUMPAD5);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_NUMPAD8);
        robot.keyRelease(KeyEvent.VK_NUMPAD8);
        robot.keyRelease(KeyEvent.VK_ALT);
        //robot.delay(50);
    }

    public static void robotUnderScore() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_NUMPAD9);
        robot.keyRelease(KeyEvent.VK_NUMPAD9);
        robot.delay(30);
        robot.keyPress(KeyEvent.VK_NUMPAD5);
        robot.keyRelease(KeyEvent.VK_NUMPAD5);
        robot.keyRelease(KeyEvent.VK_ALT);
        //robot.delay(50);
    }

    public static void robotType(String s) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        byte[] bytes = s.getBytes();
        System.out.println("--> "+bytes);
        for (byte b : bytes)
        {
            int code = b;
            //System.out.println("code: "+code);
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) code = code - 32;
            if (code == 95){
                // imprime underScore
                robotUnderScore();
                continue;
            }
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }


    public static void robotPath(String ruta) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        String[] parts = ruta.split("\\\\");
        System.out.println(parts);
        robotDisco();
        robotComma();
        robotSlash();
        //Thread.sleep( 200 );
        for(int i=1; i < parts.length; i++) {
            System.out.println(parts[i]);
            Thread.sleep(300);
            metodosGenericos.robotType(parts[i]);
            if (!parts[i].contains("jpg")) {
                metodosGenericos.robotSlash();
            }
            //Thread.sleep( 100 );
        }
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public static void reporteObjetoDesplegadoPDF(boolean estadoObjeto, String objeto, String vista, boolean fatal) {
        if (estadoObjeto) {
            ImedReports.addWebReportImage("Elemento encontrado: " + objeto, "El objeto:" + objeto + ", se visualiza correctamente en la vista de " + vista + ".", PASSED, fatal);
        } else {
            ImedReports.addWebReportImage("Elemento no encontrado: " + objeto, "El objeto:" + objeto + ", no se visualiza  en la vista de " + vista + ".", FAILED, fatal);
        }

    }

}

