package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set<Continent> continents = new HashSet<>();

    public BigDecimal getPeopleQuantity(){

        BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return peopleQuantity;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public Set<Continent> getContinents() {
        return continents;
    }
}
