//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utils;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import constans.SwipeDirection;
import driver.DriverContext;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.HtmlReport.addWebReportImage;

public class ControlledActionsWeb {

    public ControlledActionsWeb() {
    }

    public static void loading(WebElement element, int tiempo, String descripcion, String tipoElemento) {
        System.out.println("\nMétodo -> 'loading'\n");

        try {
            long start = System.nanoTime();
            long end = 0L;
            long microseconds = 0L;
            long tiempoTranscurrido = 0L;

            do {
                end = System.nanoTime();
                microseconds = end - start;
                tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
                if (tiempoTranscurrido >= 60L) {
                    addWebReportImage("loading", descripcion, Status.FAIL, true);

                }

                Duration.ofMillis(100L);
            } while(visualizarObjeto(element, tiempo));

            addWebReportImage("loading", "[ControlledActions] Se despliega de forma correcta la pagina.", Status.PASS, false);
        } catch (NoSuchElementException var12) {
            addWebReportImage("loading", "[ControlledActions] Error: No se pudo encontrar elemento '" + tipoElemento + "' -> " + var12.getMessage(), Status.FAIL, true);
        }

    }

    public static void loadingNegado(WebElement element, int tiempo, String descripcion, String tipoElemento) {
        System.out.println("\nMétodo -> 'loadingNegado'\n");

        try {
            long start = System.nanoTime();
            long end = 0L;
            long microseconds = 0L;
            long tiempoTranscurrido = 0L;

            do {
                end = System.nanoTime();
                microseconds = end - start;
                tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
                if (tiempoTranscurrido >= 60L) {
                    addWebReportImage("loading", descripcion, Status.FAIL, true);
                }

                Duration.ofMillis(100L);
            } while(!visualizarObjeto(element, tiempo));

            addWebReportImage("loading", "[ControlledActions] Se despliega de forma correcta la pagina.", Status.PASS, false);
        } catch (NoSuchElementException var12) {
            addWebReportImage("loading", "[ControlledActions] Error: No se pudo encontrar elemento '" + tipoElemento + "' -> " + var12.getMessage(), Status.FAIL, true);
        }

    }

    public static void loadingNegadoScroll(WebElement element, int tiempo, String descripcion, String tipoElemento) {
        System.out.println("\nMétodo -> 'loadingNegado'\n");

        try {
            long start = System.nanoTime();
            long end = 0L;
            long microseconds = 0L;
            long tiempoTranscurrido = 0L;

            do {
                end = System.nanoTime();
                microseconds = end - start;
                tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
                if (tiempoTranscurrido >= 60L) {
                    addWebReportImage("loading", descripcion, Status.FAIL, true);
                }

                Duration.ofMillis(100L);
            } while(!visualizarObjetoScroll(element, tiempo));

            addWebReportImage("loading", "[ControlledActions] Se despliega de forma correcta la pagina.", Status.PASS, false);
        } catch (NoSuchElementException var12) {
            addWebReportImage("loading", "[ControlledActions] Error: No se pudo encontrar elemento '" + tipoElemento + "' -> " + var12.getMessage(), Status.FAIL, true);
        }

    }

    public static void botonClick(WebElement element, String tipoBoton, boolean Imagen) {
        System.out.println("\nMétodo -> 'botonClick'\n");

        try {
            String reporteFailed = "Error: No se visualiza el botón de '" + tipoBoton + "'.";
            loadingNegado(element, 3, reporteFailed, tipoBoton);
            UtilsWeb.enmarcarObjeto(element);
            if (element.isEnabled()) {
                if (Imagen) {
                    addWebReportImage("Click en el botón", "[ControlledActions] Se visualiza el botón de '" + tipoBoton + "', activo.", Status.PASS, false);
                } else {
                    addWebReportImage("Click en el botón", "[ControlledActions] Se visualiza el botón de '" + tipoBoton + "', activo.", Status.PASS, false);
                }
            } else if (Imagen) {
                addWebReportImage("Click en el botón", "[ControlledActions] Se visualiza el botón de '" + tipoBoton + "', inactivo", Status.FAIL, false);
            } else {
                addWebReportImage("Click en el botón", "[ControlledActions] Se visualiza el botón de '" + tipoBoton + "', inactivo", Status.FAIL, false);
            }

            UtilsWeb.desenmarcarObjeto(element);
            element.click();
        } catch (NoSuchElementException var4) {
            addWebReportImage("Click en el botón", "[ControlledActions] Error: No se pudo encontrar elemento '" + tipoBoton + "' -> " + var4.getMessage(), Status.FAIL, true);
        }

    }

    public static void elementoClick(WebElement element, String descTipoElemento, String vista, boolean Imagen) {
        System.out.println("\nMétodo -> 'elementoClick'\n");

        try {
            String reporteFailed = "Error: Después de 60 segundos el objeto '" + descTipoElemento + "', no se visualiza correctamente en la vista de '" + vista + "'.";
            loadingNegado(element, 3, reporteFailed, descTipoElemento);
            UtilsWeb.desenmarcarObjeto(element);
            UtilsWeb.enmarcarObjeto(element);
            if (Imagen) {
                addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] El objeto '" + descTipoElemento + "', se visualiza correctamente en la vista de '" + vista + "'.", Status.PASS, false);
            } else {
                addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] El objeto '" + descTipoElemento + "', se visualiza correctamente en la vista de '" + vista + "'.", Status.PASS, false);
            }

            UtilsWeb.desenmarcarObjeto(element);
            element.click();
        } catch (NoSuchElementException var5) {
            addWebReportImage("Click en el elemento: " + descTipoElemento, "[ControlledActions] Error: No se pudo encontrar elemento: '" + descTipoElemento + "' asociado a la vista de '" + vista + "'. -> " + var5.getMessage(), Status.FAIL, true);
        }

    }

    public static void setAttribute(WebElement element, String attName, String attValue) {
        System.out.println("\nMétodo -> 'setAttribute'\n");
        JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);
    }

    public static void reporteElementoDesplegado(WebElement element, String descTipoElemento, String vista, String nombreAtributo, String valorAtributo) {
        System.out.println("\nMétodo -> 'reporteElementoDesplegado'\n");
        String reporteFailed = "Error: Después de 60 segundos el elemento '" + descTipoElemento + "', no se visualiza correctamente en la vista de '" + vista + "'.";
        loadingNegado(element, 5, reporteFailed, "'" + descTipoElemento + "'");
        addWebReportImage("Elemento desplegado", "[ControlledActions] El objeto '" + descTipoElemento + "', se visualiza correctamente en la vista de '" + vista + "'.", Status.PASS, false);
        System.out.println("\n" + nombreAtributo + " [Antes]: " + element.getAttribute(nombreAtributo) + "\n");
        setAttribute(element, nombreAtributo, valorAtributo);
        loadingNegado(element, 5, reporteFailed, "'" + descTipoElemento + "'");
        System.out.println("\n" + nombreAtributo + " [Cambio]: " + element.getAttribute(nombreAtributo) + "\n");
    }

    public static void esperaPorDosElementoEnPantalla(WebElement element1, WebElement element2, int tiempo, String descripcion, String tiposElementos) {
        System.out.println("\nMétodo -> 'esperaPorDosElementoEnPantalla'\n");

        try {
            long start = System.nanoTime();
            long end = 0L;
            long microseconds = 0L;
            long tiempoTranscurrido = 0L;

            do {
                do {
                    end = System.nanoTime();
                    microseconds = end - start;
                    tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
                    if (tiempoTranscurrido >= 60L) {
                        addWebReportImage("esperaPorDosElementoEnPantalla", descripcion, Status.FAIL, true);
                    }

                    Duration.ofMillis(100L);
                } while(!visualizarObjeto(element1, tiempo));
            } while(!visualizarObjeto(element2, tiempo));
        } catch (NoSuchElementException var13) {
            addWebReportImage("esperaPorDosElementoEnPantalla", "[ControlledActions] Error: No se pudo encontrar los elemento '" + tiposElementos + "' -> " + var13.getMessage(), Status.FAIL, true);
        }

    }

    public static boolean visualizarObjeto(WebElement objeto, int segundos) {
        try {
            System.out.println("Buscamos el objeto:" + objeto + ", esperamos " + segundos + " segundos, hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), (long)segundos);
            wait.until(ExpectedConditions.visibilityOf(objeto));
            System.out.println("Se encontró objeto: " + objeto + ", se retorna true.");
            return true;
        } catch (Exception var3) {
            System.out.println("No se encontró objeto: " + objeto + ", se retorna false.");
            return false;
        }
    }

    public static boolean validarEnable(WebElement objeto, int segundos) {
        boolean res = false;

        try {
            System.out.println("Se validará que el objeto: " + objeto + " se encuentre enabled en " + segundos + " segundos.");

            for(int i = 0; i < 9; ++i) {
                if (UtilsWeb.isEnabled(objeto)) {
                    System.out.println("El objeto:" + objeto + " se encuentra enabled.");
                    res = true;
                    break;
                }

                if (i == 9) {
                    System.out.println("El objeto:" + objeto + " después de " + segundos + " segundos no se encuentra enabled.");
                    res = false;
                } else {
                    metodosGenericos.esperar(segundos);
                }
            }
        } catch (Exception var4) {
            addWebReportImage("validarEnable", "Se genero la siguiente excepción: \n\n" + var4.getMessage(), Status.FAIL, true);
        }

        return res;
    }

    public static void reporteObjetoDesplegado(boolean estadoObjeto, String objeto, String vista, boolean fatal) {
        if (estadoObjeto) {
            addWebReportImage("Elemento encontrado: " + objeto, "El objeto -> " + objeto + ", se visualiza correctamente en la vista de " + vista + ".", Status.PASS, false);
        } else {
            addWebReportImage("Elemento no encontrado: " + objeto, "El objeto -> " + objeto + ", no se visualiza  en la vista de " + vista + ".", Status.FAIL, fatal);
        }

    }

    public static void reporteObjetoDesplegadoImagen(boolean estadoObjeto, String objeto, String vista, boolean fatal) {
        if (estadoObjeto) {
            addWebReportImage("Elemento encontrado: " + objeto, "El objeto -> " + objeto + ", se visualiza correctamente en la vista de " + vista + ".", Status.PASS, false);
        } else {
            addWebReportImage("Elemento no encontrado: " + objeto, "El objeto -> " + objeto + ", no se visualiza  en la vista de " + vista + ".", Status.FAIL, fatal);
        }

    }

    public static void reporteObjetoDesplegadoScroll(int maxPixelBuscarElemento, WebElement elemento, int tiempo, SwipeDirection direccionDesplazamiento, String objeto, WebElement iFrame, String vista, boolean fatal) {
        boolean estadoObjeto = visualizarObjetoScroll(maxPixelBuscarElemento, elemento, tiempo, direccionDesplazamiento, objeto, iFrame);
        if (estadoObjeto) {
            addWebReportImage("Elemento encontrado: " + objeto, "El objeto -> " + objeto + ", se visualiza correctamente en la vista de " + vista + ".", Status.PASS, false);
        } else {
            addWebReportImage("Elemento no encontrado: " + objeto, "El objeto -> " + objeto + ", no se visualiza  en la vista de " + vista + ".", Status.FAIL, fatal);
        }

    }

    public static void reporteObjetoDesplegadoImagenScroll(int maxPixelBuscarElemento, WebElement elemento, int tiempo, SwipeDirection direccionDesplazamiento, String objeto, WebElement iFrame, String vista, boolean fatal) {
        boolean estadoObjeto = visualizarObjetoScroll(maxPixelBuscarElemento, elemento, tiempo, direccionDesplazamiento, objeto, iFrame);
        if (estadoObjeto) {
            UtilsWeb.enmarcarObjeto(elemento);
            addWebReportImage("Elemento encontrado: " + objeto, "El objeto -> " + objeto + ", se visualiza correctamente en la vista de " + vista + ".", Status.PASS, false);
            UtilsWeb.desenmarcarObjeto(elemento);
        } else {
            addWebReportImage("Elemento no encontrado: " + objeto, "El objeto -> " + objeto + ", no se visualiza  en la vista de " + vista + ".", Status.FAIL, fatal);
        }

    }

    public static void reporteEnmarcacionObjImagen(WebElement elemento, boolean estadoObjeto, String objeto, String vista, boolean fatal) {
        if (estadoObjeto) {
            UtilsWeb.enmarcarObjeto(elemento);
            addWebReportImage("Elemento encontrado: " + objeto, "El objeto:" + objeto + ", se visualiza correctamente en la vista de " + vista + ".", Status.PASS, false);
            UtilsWeb.desenmarcarObjeto(elemento);
        } else {
            addWebReportImage("Elemento no encontrado: " + objeto, "El objeto:" + objeto + ", no se visualiza  en la vista de " + vista + ".", Status.FAIL, fatal);
        }

    }

    public static boolean visualizarObjetoScroll(WebElement objeto, int segundos) {
        try {
            System.out.println("Buscamos el objeto:" + objeto + ", esperamos " + segundos + " segundos, hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), (long)segundos);
            wait.until(ExpectedConditions.visibilityOf(objeto));
            System.out.println("Se encontró objeto:" + objeto + ", se retorna true.");
            UtilsWeb.scrollFocusAlElemento(objeto);
            return true;
        } catch (Exception var3) {
            System.out.println("No se encontró objeto:" + objeto + ", se retorna false.");
            return false;
        }
    }

    public static boolean visualizarObjetoMouse(WebElement objeto, int segundos) {
        try {
            System.out.println("Buscamos el objeto:" + objeto + ", esperamos " + segundos + " segundos, hasta que aparezca.");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), (long)segundos);
            wait.until(ExpectedConditions.visibilityOf(objeto));
            System.out.println("Se encontró objeto:" + objeto + ", se retorna true.");
            UtilsWeb.mouseFocusElemento(objeto);
            return true;
        } catch (Exception var3) {
            System.out.println("No se encontró objeto:" + objeto + ", se retorna false.");
            return false;
        }
    }

    public static boolean visualizarObjetoScroll(int maxPixelPantalla, WebElement objeto, int segundos, SwipeDirection direccion, String nombreElemento, WebElement iFrame) {
        boolean elementoEncontrado = false;

        try {
            System.out.println("\nBuscamos el objeto:" + objeto + ", esperamos " + segundos + " segundos, hasta que aparezca.");
            int contador = 0;
            int cantidadPixel = 150;
            boolean validaCambioDireccion = false;

            do {
                elementoEncontrado = visualizarObjeto(objeto, segundos);
                if (elementoEncontrado) {
                    System.out.println("\n[ControlledActions] - visualizarObjetoScroll, Se encuentra elemento: " + nombreElemento);
                } else {
                    System.out.println("\n[ControlledActions] - visualizarObjetoScroll, se hace scroll para buscar elemento: " + nombreElemento + " intento numero:" + contador);
                    switch(direccion) {
                        case DOWN:
                            UtilsWeb.scrollVertical(String.valueOf(cantidadPixel), iFrame);
                            break;
                        case UP:
                            UtilsWeb.scrollVertical("-" + cantidadPixel, iFrame);
                            break;
                        case LEFT:
                            UtilsWeb.scrollHorizontal("-" + cantidadPixel, iFrame);
                            break;
                        case RIGHT:
                            UtilsWeb.scrollHorizontal(String.valueOf(cantidadPixel), iFrame);
                            break;
                        default:
                            addWebReportImage("[ControlledActions] - visualizarObjetoScroll", "ERROR: No se existe la opción '" + direccion + "'.", Status.FAIL, true);
                    }

                    if (!validaCambioDireccion) {
                        cantidadPixel += 150;
                    } else {
                        cantidadPixel -= 150;
                    }

                    ++contador;
                }

                if (cantidadPixel >= maxPixelPantalla) {
                    validaCambioDireccion = true;
                    switch(direccion) {
                        case DOWN:
                            direccion = SwipeDirection.UP;
                            break;
                        case UP:
                            direccion = SwipeDirection.DOWN;
                            break;
                        case LEFT:
                            direccion = SwipeDirection.RIGHT;
                            break;
                        case RIGHT:
                            direccion = SwipeDirection.LEFT;
                    }
                }
            } while(!elementoEncontrado && cantidadPixel > 0);
        } catch (NoSuchElementException var10) {
            System.out.println("[ControlledActions] - visualizarObjetoScroll, No se encuentra elemento falla el método.");
            addWebReportImage("Error al hacer click a:" + nombreElemento, "[ControlledActions] Error: El elemento '" + nombreElemento + "' no fue encontrado: " + var10.getMessage(), Status.FAIL, true);
        }

        return elementoEncontrado;
    }

    public static void botonClic(WebElement element, String nombreBoton, String step) {
        System.out.println("\nMétodo -> 'botonClick'\n");

        try {
            String reporteFailed = "El Step falla porque no se encontro el elemento: " + nombreBoton + ".";
            loadingNegado(element, 3, reporteFailed, nombreBoton);
            UtilsWeb.enmarcarObjeto(element);
            if (!element.isEnabled()) {
                addWebReportImage(step, "El Step falla porque el botón: " + nombreBoton + " esta deshabilitado.", Status.FAIL, true);
            } else {
                addWebReportImage("Click en el elemento: " + nombreBoton, "[ControlledActions] El objeto '" + nombreBoton + "', se visualiza correctamente.", Status.PASS, false);
            }

            UtilsWeb.desenmarcarObjeto(element);
            element.click();
        } catch (NoSuchElementException var4) {
            addWebReportImage("Click en el botón", "[ControlledActions] Error: No se pudo encontrar elemento '" + nombreBoton + "' -> " + var4.getMessage(), Status.FAIL, true);
        }

    }

    public static void movePointerOverElement(WebElement objeto) {
        Point coordenadas = objeto.getLocation();
        Actions mouse = new Actions(DriverContext.getDriver());
        mouse.moveByOffset(coordenadas.getX(), coordenadas.getY());
    }

    public static void moveScreenToElement(WebElement objeto) {
        Actions pantalla = new Actions(DriverContext.getDriver());
        pantalla.moveToElement(objeto);
    }

    public static void switchToIFrame(WebElement iframe) {
        DriverContext.getDriver().switchTo().frame(iframe);
    }

    public static void loadingNegative(WebElement objeto, int tiempo) {
        try {
            long start = System.nanoTime();
            long end = 0L;
            long microseconds = 0L;
            long tiempoTranscurrido = 0L;

            do {
                end = System.nanoTime();
                microseconds = end - start;
                tiempoTranscurrido = TimeUnit.SECONDS.convert(microseconds, TimeUnit.NANOSECONDS);
                if (tiempoTranscurrido >= 60L) {
                    System.out.println("El tiempo de espera supera el tiempo limite, de 60 segundos.");
                    addWebReportImage("Después de 60 segundos no se encuentra elemento" + objeto.getText(), "No se puede encontrar el elemento, se ha superado el tiempo de espera", Status.FAIL, true);
                }

                Duration.ofMillis(100L);
            } while(!visualizarObjeto(objeto, tiempo));
        } catch (NoSuchElementException var10) {
            System.out.println("[ControlledActions] Error: No se pudo encontrar elemento " + var10.getMessage());
            addWebReportImage("loadingNegative", "[ControlledActions] Error: Se genero la siguiente excepción: " + var10.getMessage(), Status.FAIL, true);
        }

    }
}
