package Help;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabMethod {
    public WebDriver driver;

    public TabMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToTab(int index){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        System.out.println("Titlul paginii 2: "+driver.getTitle());
    }

    public void closeCurrentTab(){
        driver.quit();
    }

    public void closeTab(){

        driver.close();
    }
}
