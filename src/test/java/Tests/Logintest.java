package Tests;

import Base.Hooks;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;


public class Logintest extends Hooks {

    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void login(){

        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        indexPage.clickSignIn();
        loginPage.loginValidProcess(inputData);

    }
}
