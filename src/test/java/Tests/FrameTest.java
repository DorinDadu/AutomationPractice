package Tests;

import Base.Hooks;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;


public class FrameTest extends Hooks {

     public IndexPage indexPage;
     public FramePage framePage;
     public RegisterPage registerPage;


     @Test
     public void framesTest() {
          indexPage = new IndexPage(getDriver());
          framePage = new FramePage(getDriver());
          registerPage = new RegisterPage(getDriver());


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
