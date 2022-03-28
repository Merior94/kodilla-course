package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Tokio");

        try{
            System.out.println(flightFinder.findFlight(new Flight("Cracow","London")));
        } catch(RouteNotFoundException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you for choosing our Airlines!\n");
        }

        try{
            System.out.println(flightFinder.findFlight(new Flight("Warsaw","Tokio")));
        } catch(RouteNotFoundException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you for choosing our Airlines!\n");
        }

    }
}
