package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement> windowOptionsElement;
    @FindBy(css = "#Tabbed>a>button")
    private WebElement newTabElement;
    @FindBy(css = "#Seperate>button")
    private WebElement newWindowElement;
    @FindBy(css = "#Multiple>button")
    private WebElement newWindowTabElement;

    public void newTabProcess() {
        windowOptionsElement.get(0).click();
        elementMethods.clickElement(newTabElement);

        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }

    public void newWindowProcess() {
        windowOptionsElement.get(1).click();
        elementMethods.clickElement(newWindowElement);

        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }

    public void multipleTabsProcess() {
        windowOptionsElement.get(2).click();
        elementMethods.clickElement(newWindowTabElement);

        tabMethod.switchToTab(2);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(1);
        tabMethod.closeCurrentTab();
        tabMethod.switchToTab(0);
    }
}
