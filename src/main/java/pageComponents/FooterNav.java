package pageComponents;

import abstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
    WebDriver driver;

    //By sectionElement = By.id("traveller-home");
    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public FooterNav(WebDriver driver, By elem) {

        super(driver,elem);
        this.driver=driver;
    }

    public void getFlightAttribute(){
        driver.findElement(flights).click();

        System.out.println(findElement(flights).getAttribute("class"));
    }

    public int getLinksCount(){
        return findElements(links).size();
    }
}
