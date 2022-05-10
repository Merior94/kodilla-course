package com.kodilla.good.patterns.challenges.flights;

public class FlightSearchApplication {

    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        System.out.println("Z Krakowa:");
        System.out.println(flightSearchEngine.searchFlightFrom("Kraków"));

        System.out.println("Z Warszawy:");
        System.out.println(flightSearchEngine.searchFlightFrom("Warszawa"));


        System.out.println("Do Warszawy:");
        System.out.println(flightSearchEngine.searchFlightTo("Warszawa"));

        System.out.println("Z Krakowa do Warszawy:");
        System.out.println(flightSearchEngine.searchFlightFromTo("Kraków","Warszawa"));

        System.out.println("Z Rzeszowa do Wrocławia:");
        System.out.println(flightSearchEngine.searchFlightFromTo("Rzeszów","Wrocław"));

    }
}
