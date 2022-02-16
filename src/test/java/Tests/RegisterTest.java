package Tests;

import Base.SharedData;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTest extends SharedData {
    public IndexPage indexPage;
    public RegisterPage registerPage;

    @Test
    public void register() {

        indexPage = new IndexPage(driver);
        registerPage = new RegisterPage(driver);

        indexPage.clickSkipSignIn();
        //registerPage.uploadFile("C:\\\\Users\\\\Dadu\\\\Desktop\\\\img-20200606-W0003.jpg");
        registerPage.registerValidProcess("Dorin", "P", "str.Doua avioane 47", "DorinP@dogmail.com", "0740060532", "English", "Java", "Australia",
                "1970","444Dadu222", "444Dadu222");
    }
}

