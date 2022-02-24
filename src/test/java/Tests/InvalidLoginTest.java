package Tests;

import Base.Hooks;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;

public class InvalidLoginTest extends Hooks {
    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void invalidLoginFlow() {

        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        indexPage.clickSignIn();
        loginPage.loginInvalidProcess(inputData);
    }



}
