package pageComponents;

import abstractComponents.SearchFlightAvail;

public class RoundTrip implements SearchFlightAvail {
    @Override
    public void checkAvail(String origin, String destination) {
        System.out.println("I am inside RoundTrip");
    }
}
