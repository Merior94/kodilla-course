package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngine {
    ArrayList<Flight> flights;

    public FlightSearchEngine() {
        this.flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Warszawa", "Rzeszów"));

        flights.add(new Flight("Kraków", "Rzeszów"));
        flights.add(new Flight("Kraków", "Wrocław"));

        flights.add(new Flight("Rzeszów", "Warszawa"));

        System.out.println("All flights: ");
        for (Flight f : flights) {
            System.out.println(f);
        }
        System.out.println("-----");
    }

    public ArrayList<Flight> searchFlightTo(String to) {

        return flights.stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> searchFlightFrom(String from) {

        return flights.stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Flight> searchFlightFromTo(String from, String to) {
        ArrayList<Flight> list1 = this.searchFlightFrom(from);
        ArrayList<Flight> list2 = this.searchFlightTo(to);
        ArrayList<Flight> result = new ArrayList<>();

        for (Flight f1: list1){
            for (Flight f2: list2) {
                if (Objects.equals(f1.getTo(), f2.getFrom())) {
                    result.add(f1);
                    result.add(f2);
                }
            }
        }

//        ArrayList<Flight> result = new ArrayList<>();
//        flights.stream()
//                .filter(f -> f.getFrom().equals(from))
//                .forEach(f -> result.addAll(this.searchFlightFrom(f.getTo())));


        //System.out.println(list3);

//        ArrayList<Flight> list4 = flights.stream()
//                .filter(f -> f.getFrom().equals(from) || f.getTo().equals(to))
//                .filter(f -> f.)
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        System.out.println("test" + list4);

        //.flatMap(f -> this.searchFlightFrom(f.getTo()).stream())
        //.forEach(f -> System.out.println("From - to:" + f.getFrom() + f.getTo()));

        //.collect(Collectors.toCollection(ArrayList::new));

        //sprawdzam wszystkie loty z miejsca startu
//        ArrayList<Flight> resultFrom = this.searchFlightFrom(from);
//
//        System.out.println(resultFrom);
//        System.out.println();
//
//        ArrayList<Flight> result = this.searchFlightFrom(resultFrom.getTo());
//
//        //sprawdzam który ze znalezionych lotów kończy się na lotnisku,z którego można dolecieć do miejsca docelowego
//        for (Flight f:resultFrom) {
//            //this.searchFlightFrom(f.getFrom());
//            System.out.println(f);
//            System.out.println();
//
//            System.out.println(this.searchFlightFrom(f.getTo()));
//            System.out.println("-");
//        }
//        System.out.println("-----");


//        result = result.stream()
//                .forEach(f -> this.searchFlightFrom(f.getTo()))
//                .flatMap()
//                //.filter(f -> this.searchFlightFrom(f.getTo()) to)
//                .collect(Collectors.toCollection(ArrayList::new));

//        System.out.println(result);
//
//        System.out.println("-----");

//        Stream<Flight> resultStream = Stream.concat(resultFrom.stream(),resultTo.stream());
//
//        ArrayList<Flight> result  = resultStream
//                .filter(f -> f.getTo().equals(to))
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        for (Flight f:result) {
//            System.out.println(f);
//        }

        return result;
    }

}
