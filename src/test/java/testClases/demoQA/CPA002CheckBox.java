package testClases.demoQA;


import Base.BaseWeb;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.demoQA.checkboxTollsQA;
import page.demoQA.homeTollsQA;

public class CPA002CheckBox extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA CHECKBOX "},description = "TOOLSQA ")
    @Parameters({""})
    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();
        home.ElementsToolsQA();

        checkboxTollsQA check = new checkboxTollsQA();
        check.checkBox();
        check.formularioCheckbox();


    }


}
