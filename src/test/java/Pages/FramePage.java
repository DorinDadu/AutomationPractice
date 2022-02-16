package Pages;

import Help.ElementMethods;
import Help.FrameMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public FrameMethods frameMethods;
    public PageMethods pageMethods;


    public FramePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        frameMethods = new FrameMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="singleframe")
    public WebElement singleframeElement;

    @FindBy(css="div>input[type='text']")
    public WebElement inputTextElement;

    @FindBy(css = "a[href='#Multiple']")
    public WebElement multipleframeElement;

    @FindBy(css = "iframe[src='MultipleFrames.html']")
    public WebElement multipleFrame;

    @FindBy(css = "iframe[src='SingleFrame.html']")
    public WebElement singleFrame;

    @FindBy(css="div>input[type='text']")
    public WebElement inputText2Element;

    public void gotosingleframe(){
        frameMethods.switchtoFrameByElement(singleframeElement);
    }

    public void fillinputTextElement(){
        elementMethods.fillElement(inputTextElement, "Sete");}

    public void switchtoURL(){
        pageMethods.navigatetoURL("http://demo.automationtesting.in/Frames.html");}


    public void switchtomultipleElement(){
        frameMethods.switchtoFrameByElement(multipleFrame);}

    public void switchtoSingleElement(){
        frameMethods.switchtoFrameByElement(singleFrame);
    }

    public void fillinputText2Element(){
        elementMethods.fillElement(inputText2Element,"Imi e mai sete");
    }

    public void clickMultipleFrame(){

        elementMethods.clickElement(multipleframeElement);
    }

}

