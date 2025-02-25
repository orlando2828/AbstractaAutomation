package driver;

import constans.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static constans.Constants.browser;

public class DriverManager {

    private DesiredCapabilities capabilities = new DesiredCapabilities ();
    private WebDriver webDriver;
    private File root = new File("driverNavegador");
    private String extensionDriver = "";
    ChromeOptions options = new ChromeOptions();


    public DriverManager() {
    }

    protected void resolveDriver(String nav, String ambURL) {
        System.out.println("\n[ Sistema operativo >>> " + System.getProperty("os.name").toLowerCase() + " ]\n");
        System.out.println("[ iniciando WebDriver ]");
        String navegador = nav.toLowerCase();
        byte var5 = -1;
        switch(navegador.hashCode()) {
            case -1928898497:
                if (navegador.equals("explorer")) {
                    var5 = 1;
                }
                break;
            case -1361128838:
                if (navegador.equals("chrome")) {
                    var5 = 0;
                }
                break;
            case -849452327:
                if (navegador.equals("firefox")) {
                    var5 = 2;
                }
                break;
            case 3108285:
                if (navegador.equals("edge")) {
                    var5 = 3;
                }
        }
        switch(var5) {
            case 0:
                System.out.println("[ Chrome ]");
                Constants.browser = "Chrome";
                //se omite porque esta bajando una versión estable 114 para chrome 114 y vamos en 133
                //WebDriverManager.chromedriver().setup();
              // se descarga driver fisico para no afectar cambiar browser que afecten otros proyectos
                System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
                this.options.addArguments(new String[]{"--disable-notifications"});
                this.options.addArguments(new String[]{"--ignore-certificate-errors"});
                this.options.addArguments(new String[]{"--disable-popup-blocking"});
                this.webDriver = new ChromeDriver(this.options);
                this.webDriver.manage().window().maximize();
                break;
            case 1:
                Constants.browser = "Explorer";
                System.out.println("[ Explorer ]");
                this.capabilities.setCapability("enablePersistentHover", false);
                this.capabilities.setCapability("requireWindowFocus", false);
                this.capabilities.setCapability("unexpectedAlertBehaviour", true);
                this.capabilities.setCapability("acceptSslCerts", true);
                this.capabilities.setCapability("ignoreProtectedModeSettings", true);
                this.capabilities.setJavascriptEnabled(true);
                WebDriverManager.iedriver().setup();
                this.webDriver = new InternetExplorerDriver();
                this.capabilities.setBrowserName("Explorer");
                this.webDriver.manage().window().maximize();
                break;
            case 2:
                Constants.browser = "Firefox";
                System.out.println("[ Firefox ]");
                WebDriverManager.firefoxdriver().setup();
                this.webDriver = new FirefoxDriver();
                this.webDriver.manage().window().maximize();
                break;
            case 3:
                Constants.browser = "Edge";
                System.out.println("[ Edge ]");
                WebDriverManager.edgedriver().setup();
                this.webDriver = new EdgeDriver();
                this.capabilities.setBrowserName("Microsoft Edge");
                this.webDriver.manage().window().maximize();
                break;
            default:
                System.out.println("No es posible lanzar el navegador, no se reconoce el navegador: " + nav);
        }
        this.webDriver.get(ambURL);
    }

    protected WebDriver getDriver() {
        return this.webDriver;
    }

    protected void setDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected Dimension getScreenSize() {
        return this.webDriver.manage().window().getSize();
    }
}
