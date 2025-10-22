import abstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.TravelHomePage;

public class DemoTest {
   // AbstractComponent abstractComponent = null;

    @Test
    public void flightTests(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
       travelHomePage.getFooterNav().getFlightAttribute();
       travelHomePage.getNavigationBar().getFlightAttribute();
        System.out.println(travelHomePage.getFooterNav().getLinksCount());
        System.out.println(travelHomePage.getNavigationBar().getLinksCount());
        driver.quit();

    }

//    @Test
//    public void test2(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        /**
//         * Strategy design pattern is one of the behavioral design pattern.
//         * Strategy pattern is used when we have multiple algorithm for a specific task
//         * and client decides the actual implementation to be used at runtime.
//         */
//        TravelHomePage travelHomePage = new TravelHomePage(driver);
//        travelHomePage.setBookingStrategy(new MultiTrip());
//        travelHomePage.checkAvailAsPerSetStrategy("originss","destinationss");
//
//
//    }
//    @AfterTest
//    public void tearDownBrowser(){
//            abstractComponent.tearDown();
//
//    }
}
