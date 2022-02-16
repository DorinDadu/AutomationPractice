package Tests;

import Base.SharedData;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;


public class FrameTest extends SharedData {
     public IndexPage indexPage;
     public FramePage framePage;
     public RegisterPage registerPage;



   @Test
   public void framesTest(){
        indexPage = new IndexPage(driver);
        framePage = new FramePage(driver);
        registerPage = new RegisterPage(driver);


        indexPage.clickSkipSignIn();
        registerPage.goToFramePage();
        framePage.gotosingleframe();
        framePage.fillinputTextElement();
        framePage.switchtoURL();
        framePage.clickMultipleFrame();
        framePage.switchtomultipleElement();
        framePage.switchtoSingleElement();
        framePage.fillinputText2Element();

    }

}
