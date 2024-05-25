package pageObjects;

import abstractComponents.SearchFlightAvail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageComponents.FooterNav;
import pageComponents.NavigationBar;

public class TravelHomePage {
    By sectionElement = By.id("traveller-home");
    WebDriver driver;
    SearchFlightAvail searchFlightAvail;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar();
    }

    public FooterNav getFooterNav(){
        return new FooterNav(driver,sectionElement);
    }
    public void goTo(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public void setBookingStrategy(SearchFlightAvail setTripDetails){
        searchFlightAvail = setTripDetails;
    }

    public void checkAvailAsPerSetStrategy(String origin, String destination){
        searchFlightAvail.checkAvail(origin,destination);
    }

}
