package Pages;

import Help.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public PageMethods pageMethods;
    public TabMethod tabMethod;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        alertMethods = new AlertMethods(driver);
        frameMethods = new FrameMethods(driver);
        pageMethods = new PageMethods(driver);
        tabMethod = new TabMethod(driver);
        PageFactory.initElements(driver, this);
    }

    //pot adauga elemente pe care le regasim in toate paginile
    //le declaram PUBLIC pentru ca vreau sa fie
}
