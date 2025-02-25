package testClases.demoQA;

import Base.BaseWeb;
import org.testng.annotations.Test;
import page.demoQA.homeTollsQA;
import page.demoQA.widgetTollsQA;

public class CPA006Widget extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA WIDGET"},description = "TOOLSQA ")

    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();

        widgetTollsQA wid = new widgetTollsQA();
        wid.widget();
        //Con Problemas solucionar xpath progres
        //wid.progressBar();

        }

}
