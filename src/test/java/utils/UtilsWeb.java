package utils;

import driver.DriverContext;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reportePdf.EstadoPrueba;

import static reportePdf.ImedReports.addWebReportImage;
import static utils.ControlledActionsWeb.loadingNegado;


public class UtilsWeb {
    public UtilsWeb() {
    }

    public static boolean isEnabled(WebElement element) throws NoSuchElementException {
        System.out.println("Esta el elemento habilitado?:" + element.getAttribute("enabled"));
        return element.getAttribute("enabled").trim().equals("true");
    }

    public static void mueveMouseAlElemento(WebElement element) {
        Actions action = new Actions(DriverContext.getDriver());
        action.moveToElement(element).build().perform();
    }

    public static void scrollFocusAlElemento(WebElement element) {
        ((JavascriptExecutor) DriverContext.getDriver()).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
    }

    public static void mouseFocusElemento(WebElement element) {
        String javaScript = "var evObj = document.createEvent('MouseEvents');evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)DriverContext.getDriver()).executeScript(javaScript, new Object[]{element});
    }

    public static void enmarcarObjeto(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor)DriverContext.getDriver();

            for(int i = 0; i < 3; ++i) {
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", new Object[]{element, "border: 5px solid LimeGreen;"});
                Thread.sleep(500L);
            }
        } catch (InterruptedException var3) {
            addWebReportImage("enmarcarObjeto", "Error: Al ejecutar JavaScript para modificar propiedad css del elemento. " + var3.getMessage(), EstadoPrueba.FAILED, true);
        }

    }

    public static void desenmarcarObjeto(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor)DriverContext.getDriver();

            for(int i = 0; i < 3; ++i) {
                Thread.sleep(500L);
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", new Object[]{element, ""});
            }
        } catch (InterruptedException var3) {
            addWebReportImage("desenmarcarObjeto", "Error: Al ejecutar JavaScript para modificar propiedad css del elemento. " + var3.getMessage(), EstadoPrueba.FAILED, true);
        }

    }

    public static void cambiarIframe(String tipoLocalizador, String valorPropiedad) {
        System.out.println("\nMETODO ->'cambiarIframe'");

        try {
            DriverContext.getDriver().switchTo().defaultContent();
            String var2 = tipoLocalizador.toUpperCase();
            byte var3 = -1;
            switch(var2.hashCode()) {
                case 2331:
                    if (var2.equals("ID")) {
                        var3 = 0;
                    }
                    break;
                case 2388619:
                    if (var2.equals("NAME")) {
                        var3 = 2;
                    }
                    break;
                case 64205144:
                    if (var2.equals("CLASS")) {
                        var3 = 3;
                    }
                    break;
                case 83718269:
                    if (var2.equals("XPATH")) {
                        var3 = 1;
                    }
            }

            switch(var3) {
                case 0:
                    DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().findElement(By.id(valorPropiedad)));
                    break;
                case 1:
                    DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().findElement(By.xpath(valorPropiedad)));
                    break;
                case 2:
                    DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().findElement(By.name(valorPropiedad)));
                    break;
                case 3:
                    DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().findElement(By.className(valorPropiedad)));
                    break;
                default:
                    DriverContext.getDriver().switchTo().frame(DriverContext.getDriver().findElement(By.xpath(valorPropiedad)));
            }
        } catch (Exception var4) {
            addWebReportImage("cambiarIframe", "Se genero la siguiente excepción: \n\n" + var4.getMessage(), EstadoPrueba.FAILED, true);
        }

    }

    public static void scrollVertical(String cantidadPixel, WebElement iFrame) {
        System.out.println("\n[scrollVertical] cantidadPixel: " + cantidadPixel);
        ((JavascriptExecutor)DriverContext.getDriver().switchTo().defaultContent()).executeScript("window.scrollBy(0," + cantidadPixel + ")", new Object[0]);

        try {
            DriverContext.getDriver().switchTo().frame(iFrame);
        } catch (NullPointerException var3) {
            System.out.println("Continua el flujo");
        }

    }

    public static void scrollHorizontal(String cantidadPixel, WebElement iFrame) {
        System.out.println("\n[scrollHorizontal] cantidadPixel: " + cantidadPixel);
        ((JavascriptExecutor)DriverContext.getDriver()).executeScript("window.scrollBy(0," + cantidadPixel + ")", new Object[0]);

        try {
            DriverContext.getDriver().switchTo().frame(iFrame);
        } catch (NullPointerException var3) {
            System.out.println("Continua el flujo");
        }

    }

    public static boolean validarTextoSinReporte(String textoApp, String textoAValidar) {
        return textoApp.trim().equals(textoAValidar.trim());
    }

    public static void removerElementoWeb() {
        JavascriptExecutor js = (JavascriptExecutor)DriverContext.getDriver();
        js.executeScript("return document.getElementsByClassName('review-info-star').remove();", new Object[0]);
    }

    public static void elementoClick(WebElement element, String descTipoElemento, String vista, boolean Imagen) {
        System.out.println("\nMétodo -> 'elementoClick'\n");

        try {
            String reporteFailed = "Error: Después de 60 segundos el objeto '" + descTipoElemento + "', no se visualiza correctamente en la vista de '" + vista + "'.";
            loadingNegado(element, 3, reporteFailed, descTipoElemento);
            UtilsWeb.desenmarcarObjeto(element);
            UtilsWeb.enmarcarObjeto(element);
            if (Imagen) {
                addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] El objeto '" + descTipoElemento + "', se visualiza correctamente en la vista de '" + vista + "'.", EstadoPrueba.PASSED, false);
            } else {
                addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] El objeto '" + descTipoElemento + "', se visualiza correctamente en la vista de '" + vista + "'.", EstadoPrueba.PASSED, false);
            }

            UtilsWeb.desenmarcarObjeto(element);
            element.click();
        } catch (NoSuchElementException var5) {
            addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] Error: No se pudo encontrar elemento: '" + descTipoElemento + "' asociado a la vista de '" + vista + "'. -> " + var5.getMessage(), EstadoPrueba.FAILED, true);
        }

    }


}
