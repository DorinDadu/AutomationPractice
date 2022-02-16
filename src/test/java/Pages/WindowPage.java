package Pages;

import Help.ElementMethods;
import Help.TabMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WindowPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public TabMethod tabMethod;

    public WindowPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        tabMethod = new TabMethod(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".nav-tabs>li>a")
    public List<WebElement> windowOptionsElement;
    @FindBy(css = "#Tabbed>a>button")
    public WebElement newTabElement;
    @FindBy(css = "#Seperate>button")
    public WebElement newWindowElement;
    @FindBy(css = "#Multiple>button")
    public WebElement newWindowTabElement;

    public void newTabProcess(){
        windowOptionsElement.get(0).click();
        elementMethods.clickElement(newTabElement);

        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }

    public void newWindowProcess(){
        windowOptionsElement.get(1).click();
        elementMethods.clickElement(newWindowElement);

        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }

    public void multipleTabsProcess(){
        windowOptionsElement.get(2).click();
        elementMethods.clickElement(newWindowTabElement);

        tabMethod.switchToTab(2);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }
}
