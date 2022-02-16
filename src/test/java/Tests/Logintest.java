package Tests;

import Base.SharedData;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;


public class Logintest extends SharedData {

    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test
    public void login(){

        indexPage = new IndexPage(driver);
        loginPage = new LoginPage(driver);

        indexPage.clickSignIn();
        loginPage.loginInvalidProcess("vasile@.com","parola123","Invalid User Name or PassWord");

    }
}
