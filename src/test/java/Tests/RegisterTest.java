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

        registerPage.registerValidProcess("Dorin", "P",
                "Strada Doua Avioane, nr. 44B, Cluj-Napoca, jud. Cluj, Romania", "C:\\Users\\Dadu\\Desktop\\IMG-20200606-WA003\\jPG", "DorinP@dogmail.com",
                "0740060532", "English", "Java", "Australia", "1970",
                 "444Dadu222", "444Dadu222");
    }
}

