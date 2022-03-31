package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public String findFlight(Flight flight) throws RouteNotFoundException {

        Map<String,Boolean> flightsPlan = new HashMap<>();
        flightsPlan.put("Cracow", true);
        flightsPlan.put("Warsaw", true);
        flightsPlan.put("Moscow", false);
        flightsPlan.put("London", true);
        flightsPlan.put("New York", true);
        flightsPlan.put("Tokio", false);

        //System.out.println(flightsPlan);

        if (flightsPlan.containsKey(flight.getArrivalAirport())){
            return "Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport();
        } else{
            throw (new RouteNotFoundException("Flight not found!"));
        }



    }
}
