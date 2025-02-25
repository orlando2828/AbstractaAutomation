package testClases.demoQA;


import Base.BaseWeb;
import org.testng.annotations.Test;
import page.demoQA.formsTollsQA;
import page.demoQA.homeTollsQA;


public class CPA005Form extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA FORMULARIOS"},description = "TOOLSQA ")



    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();

        formsTollsQA form = new formsTollsQA();
        form.demoqa5();
        form.deporte();

    }


}
