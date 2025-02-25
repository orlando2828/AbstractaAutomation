package testClases.demoQA;


import Base.BaseWeb;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.demoQA.homeTollsQA;
import page.demoQA.radioButtonTollsQA;

public class CPA003RadioButton extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA RADIO BUTTON "},description = "TOOLSQA ")
    @Parameters({""})
    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();
        home.ElementsToolsQA();

        radioButtonTollsQA radio = new radioButtonTollsQA();
        radio.radioButton();
        radio.formularioRadioButton();


    }


}
