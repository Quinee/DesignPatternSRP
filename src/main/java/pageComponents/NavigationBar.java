package pageComponents;

import abstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {
    WebDriver driver;
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");
    By elem;
    public NavigationBar(WebDriver driver, By elem){
        super(driver,elem);
        this.driver=driver;
        this.elem=elem;
    }

    @Override
    public int getLinksCount() {
        return findElements(links).size();

    }

    public void getFlightAttribute(){
        System.out.println(findElement(flights).getAttribute("class"));
    }
}
