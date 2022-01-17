package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
    public WebDriver driver;

    @Test

    public void Register(){

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        WebElement firstnameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstnameElement.click();
        String firstname="Dorin";
        firstnameElement.sendKeys(firstname);

        WebElement lastnameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        firstnameElement.click();
        String lastname="Puscasu";
        lastnameElement.sendKeys(lastname);

       // WebElement adressElement=driver.findElement(By.cssSelector("input[ng-model='Adress']"));
       // adressElement.click();
       // String adress="Cluj-Napoca, Str. Doua avioane, nr.7";
       // adressElement.sendKeys(adress);

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

        WebElement skills=driver.findElement(By.id("Skills"));
        Select dropdownskills= new Select(skills);
        //dropdownskills.selectByIndex(2);
        dropdownskills.selectByValue("Java");

        WebElement year=driver.findElement(By.id("yearbox"));
        Select dropdownyear= new Select(year);
        dropdownyear.selectByValue("1970");


        WebElement date=driver.findElement(By.id("daybox"));
        Select dropdowndate= new Select(date);
        dropdowndate.selectByValue("14");
        

        WebElement passwordElement=driver.findElement(By.cssSelector("input[ng-model='Password']"));
        passwordElement.click();
        String password="alibaba_40";
        passwordElement.sendKeys(password);

        WebElement confirmpasswordElement=driver.findElement(By.cssSelector("input[ng-model='CPassword']"));
        confirmpasswordElement.click();
        String confirmpassword="alibaba_40";
        confirmpasswordElement.sendKeys(confirmpassword);












    }
}

