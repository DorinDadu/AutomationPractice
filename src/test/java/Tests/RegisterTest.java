package Tests;

import Base.SharedData;
import Help.ElementMethods;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.WebElement;

public class RegisterTest extends SharedData {
    public ElementMethods elementMethods;


    @Test
    public void Register(){

        elementMethods= new ElementMethods(driver);

        WebElement skipsighninElement=driver.findElement(By.id("btn2"));
        skipsighninElement.click();
        WebElement firstnameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstnameElement.click();
        String firstname="Dorin";
        firstnameElement.sendKeys(firstname);

        WebElement lastnameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        firstnameElement.click();
        String lastname="Puscasu";
        lastnameElement.sendKeys(lastname);

        WebElement adressElement=driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
        adressElement.click();
        String adress="Cluj-Napoca, Str. Doua avioane, nr.7";
        adressElement.sendKeys(adress);

        WebElement emailAdressElement=driver.findElement(By.cssSelector("input[type='email']"));
        emailAdressElement.click();
        String emailAdress="dorinP@yahoo.com";
        emailAdressElement.sendKeys(emailAdress);

        WebElement phoneElement=driver.findElement(By.cssSelector("input[type='tel']"));
        phoneElement.click();
        String phone="123456";
        phoneElement.sendKeys(phone);

        WebElement maleElement= driver.findElement(By.cssSelector("input[value='Male']"));
        maleElement.click();

        WebElement hobbiesElement=driver.findElement(By.cssSelector("input[id='checkbox2']"));
        hobbiesElement.click();

        WebElement languages=driver.findElement(By.id("msdd"));
        languages.click();
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
        countryInput.click();
        countryInput.sendKeys("Australia");
        countryInput.sendKeys(Keys.ENTER);


        WebElement year=driver.findElement(By.id("yearbox"));
        elementMethods.selectElementByvalue(year, "1970");



        WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
        elementMethods.selectElementBytext(month, "January");


        WebElement day=driver.findElement(By.id("daybox"));
        elementMethods.selectElementByvalue(day, "14");

        

        WebElement passwordElement=driver.findElement(By.cssSelector("input[ng-model='Password']"));
        passwordElement.click();
        String password="alibaba_40";
        passwordElement.sendKeys(password);

        WebElement confirmpasswordElement=driver.findElement(By.cssSelector("input[ng-model='CPassword']"));
        confirmpasswordElement.click();
        String confirmpassword="alibaba_40";
        confirmpasswordElement.sendKeys(confirmpassword);

        WebElement uploadFileElement= driver.findElement(By.cssSelector("div>input[id=\"imagesrc\"]"));
        uploadFileElement.sendKeys("C:\\Users\\Dadu\\Desktop\\IMG-20200606-WA0003.jpg");

        WebElement submitElement=driver.findElement(By.id("submitbtn"));
        submitElement.click();

        WebElement refreshElement=driver.findElement(By.id("Button1"));
        refreshElement.click();




    }
}

