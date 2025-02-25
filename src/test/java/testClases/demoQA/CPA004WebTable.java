package testClases.demoQA;


import Base.BaseWeb;
import org.testng.annotations.Test;

import page.demoQA.homeTollsQA;
import page.demoQA.webTableTollsQA;

public class CPA004WebTable extends BaseWeb {

    @Test(groups = {"Ingresar al TOLLS QA WEBTABLE "},description = "TOOLSQA ")



    public void Login() throws InterruptedException {
        homeTollsQA home = new homeTollsQA();
        home.paginaToolsqa();
        home.ElementsToolsQA();

        webTableTollsQA table = new webTableTollsQA();
        table.webTable();
        table.formularioWebtable();

    }


}
