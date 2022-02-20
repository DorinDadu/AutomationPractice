package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) { super(driver);}

    @FindBy(id="singleframe")
    private WebElement singleframeElement;
    @FindBy(css="div>input[type='text']")
    private WebElement inputTextElement;
    @FindBy(css = "a[href='#Multiple']")
    private WebElement multipleframeElement;
    @FindBy(css = "iframe[src='MultipleFrames.html']")
    private WebElement multipleFrame;
    @FindBy(css = "iframe[src='SingleFrame.html']")
    private WebElement singleFrame;
    @FindBy(css="div>input[type='text']")
    private WebElement inputText2Element;

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

