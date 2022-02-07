package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.FrameMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends SharedData {
   public FrameMethods frameMethods;
   public ElementMethods elementMethods;

   @Test
   public void framesTest(){
         frameMethods = new FrameMethods(driver);
         elementMethods =new ElementMethods(driver);

        WebElement SkipSigninelement=driver.findElement(By.cssSelector("[id='btn2'"));
        elementMethods.clickElement(SkipSigninelement);

        WebElement switchToElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action= new Actions(driver);
        Action.moveToElement(switchToElement).perform();

        WebElement framesElement= driver.findElement(By.xpath("//a[text()='Frames']"));
        elementMethods.clickElement(framesElement);


        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        frameMethods.switchtoFrameByid("singleframe");

        WebElement inputText = driver.findElement(By.cssSelector("div>input[type='text']"));
        elementMethods.fillElement(inputText, "Sete");

        frameMethods.switchToDefault();

        WebElement multipleFrame = driver.findElement(By.cssSelector("a[href='#Multiple']"));
        elementMethods.clickElement(multipleFrame);

        frameMethods.switchtoFrameByElement(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.switchtoFrameByElement(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));

        WebElement inputText2 =driver.findElement(By.cssSelector("div>input[type='text']"));
        elementMethods.fillElement(inputText2,"Imi e mai sete");




    }


}
