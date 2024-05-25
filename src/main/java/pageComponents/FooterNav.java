package pageComponents;

import abstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
    WebDriver driver;

    //By sectionElement = By.id("traveller-home");
    By flights = By.cssSelector("[title='Flights']");

    public FooterNav(WebDriver driver, By elem) {
        super(driver,elem);
    }

    public void selectFlightAttribute(){
        //driver.findElement(flights).click();
        ;
        System.out.println(findElement(flights).getAttribute("class"));
    }
}
