package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //elemente
    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(xpath = "//*[@id=\"errormsg\"]")
    private WebElement errorMessageElement;

    //metode
    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void clickEnter() {
        elementMethods.clickElement(enterElement);
    }

    public void loginValidProcess(HashMap<String, String> inputData) {
        fillEmail(inputData.get("email"));
        fillPassword(inputData.get("password"));
        clickEnter();

    }

    public void loginInvalidProcess(HashMap<String, String> inputData) {
        fillEmail(inputData.get("email"));
        clickEnter();
        elementMethods.validateElementText(errorMessageElement, inputData.get("errorMsg"));

    }

}

