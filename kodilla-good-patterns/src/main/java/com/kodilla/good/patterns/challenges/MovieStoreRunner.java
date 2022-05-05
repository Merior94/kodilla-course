package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!")));
    }
}
