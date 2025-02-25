package testClases.demoQA;


import Base.BaseWeb;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.demoQA.elementsTollsQA;
import page.demoQA.homeTollsQA;

public class CPA001LOGIN extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA LOGIN"},description = "TOOLSQA ")
    @Parameters({""})
    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();
        home.ElementsToolsQA();

        elementsTollsQA elements = new elementsTollsQA();
        elements.textBox();
        elements.formularioTextbox();
    }


}
