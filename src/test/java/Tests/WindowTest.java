package Tests;

import Base.SharedData;
import Help.ElementMethods;
import Help.TabMethod;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;

public class WindowTest extends SharedData {
    public TabMethod tabMethod;
    public ElementMethods elementMethods;

    @Test
    public void windowOptionTest(){

        tabMethod=new TabMethod(driver);
        elementMethods=new ElementMethods(driver);

        WebElement SkipSigninelement=driver.findElement(By.cssSelector("[id='btn2'"));
        elementMethods.clickElement(SkipSigninelement);

        WebElement switchToElement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action= new Actions(driver);
        Action.moveToElement(switchToElement).perform();

        WebElement windowsElement= driver.findElement(By.xpath("//a[text()='Windows']"));
        elementMethods.clickElement(windowsElement);

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowOptions =driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        elementMethods.clickElement(windowOptions.get(0));


        WebElement newtabok= driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newtabok.click();

        tabMethod.switchToTab(1);
        tabMethod.closeTab();
        tabMethod.switchToTab(0);


        windowOptions.get(2).click();
        WebElement newWindow = driver.findElement(By.cssSelector("#Multiple>button"));
        newWindow.click();

        tabMethod.switchToTab(2);
        tabMethod.closeTab();
        tabMethod.switchToTab(1);
        tabMethod.closeTab();
        tabMethod.switchToTab(0);

    }



}
