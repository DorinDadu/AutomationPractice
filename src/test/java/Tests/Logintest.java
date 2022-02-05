package Tests;

import Base.SharedData;
import Help.ElementMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Logintest extends SharedData {

    //Declaram variabila webdriver


     public ElementMethods elementMethods;

    @Test
    public void login(){
        elementMethods=new ElementMethods(driver);

        WebElement signinElement=driver.findElement(By.id("btn1"));
        signinElement.click();

        WebElement emailelement=driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue="puscasu.dorin@gmail.com";
        emailelement.sendKeys(emailvalue);

        WebElement passwordelement=driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordvalue="44d22";
        passwordelement.sendKeys(passwordvalue);

        WebElement enterelement=driver.findElement(By.id("enterbtn"));
        enterelement.click();

        WebElement errormsgelement=driver.findElement(By.id("errormsg"));
        elementMethods.validateElementText(errormsgelement, "Invalid User Name or PassWord");
        //quit=inchide instanta cu toate taburile deschise
        //close= inchide tabul curent
        //driver.close();
    }

}
