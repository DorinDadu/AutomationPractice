package Tests;

import Base.SharedData;
import Help.ElementMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.WebElement;

public class RegisterTest extends SharedData {
    public ElementMethods elementMethods;


    @Test
    public void Register(){

        elementMethods= new ElementMethods(driver);

        WebElement skipsighninElement=driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipsighninElement);

        WebElement firstnameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        elementMethods.fillElement(firstnameElement,"Dorin");

        WebElement lastnameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        elementMethods.fillElement(lastnameElement, "Puscasu");

        WebElement adressElement=driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
        elementMethods.fillElement(adressElement, "Cluj-Napoca, Str. Doua avioane, nr. 7");

        WebElement emailAdressElement=driver.findElement(By.cssSelector("input[type='email']"));
        elementMethods.fillElement(emailAdressElement, "DirinP@dogmail.com");

        WebElement phoneElement=driver.findElement(By.cssSelector("input[type='tel']"));
        elementMethods.fillElement(phoneElement, "555-23457");

        WebElement maleElement= driver.findElement(By.cssSelector("input[value='Male']"));
       elementMethods.clickElement(maleElement);

        WebElement hobbiesElement=driver.findElement(By.cssSelector("input[id='checkbox2']"));
        elementMethods.clickElement(hobbiesElement);

        WebElement languages=driver.findElement(By.id("msdd"));
        elementMethods.clickElement(languages);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        List<WebElement> languageOptions= driver.findElements(By.cssSelector(".ui-autocomplete.ui-front>li>a"));
        for (int index=0;index< languageOptions.size();index++){
            if (languageOptions.get(index).getText().equals("English")
            || (languageOptions.get(index).getText().equals("Arabic"))){
                languageOptions.get(index).click();
            }
            }

        WebElement skills=driver.findElement(By.id("Skills"));
        elementMethods.selectElementBytext(skills, "Java");

        WebElement countryInput = driver.findElement(By.cssSelector("span[role='combobox']"));
        elementMethods.clickElement(countryInput);
        List<WebElement> countryOptions= driver.findElements(By.cssSelector(".select2-hidden-accessible>option"));
        for (int index=0;index< countryOptions.size();index++) {
            if (countryOptions.get(index).getText().equals("Australia")) {
                elementMethods.clickElement(countryOptions.get(index));
                countryInput.sendKeys(Keys.ENTER);

            }

        }
        WebElement year=driver.findElement(By.id("yearbox"));
        elementMethods.selectElementByvalue(year, "1970");

        WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
        elementMethods.selectElementBytext(month, "January");

        WebElement day=driver.findElement(By.id("daybox"));
        elementMethods.selectElementByvalue(day, "14");

        WebElement passwordElement=driver.findElement(By.cssSelector("input[ng-model='Password']"));
        elementMethods.fillElement(passwordElement, "alibaba_40");

        WebElement confirmpasswordElement=driver.findElement(By.cssSelector("input[ng-model='CPassword']"));
        elementMethods.fillElement(confirmpasswordElement, "alibaba_40");

        WebElement submitElement=driver.findElement(By.id("submitbtn"));
        elementMethods.clickElement(submitElement);

        WebElement refreshElement=driver.findElement(By.id("Button1"));
        elementMethods.clickElement(refreshElement);




    }
}

