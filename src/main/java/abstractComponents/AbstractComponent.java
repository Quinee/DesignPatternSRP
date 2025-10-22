package abstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {
    WebElement elem;
    WebDriver driver;
    public AbstractComponent(WebDriver driver, By elem) {
        this.driver = driver;
        this.elem = driver.findElement(elem);
    }

    public WebElement findElement(By findElemBy){
        return elem.findElement(findElemBy);
    }
    public List<WebElement> findElements(By findElemBy){
        return elem.findElements(findElemBy);
    }
    abstract  public int getLinksCount();
    public void tearDown(){
        driver.quit();
        System.out.println("DC");
    }
}
