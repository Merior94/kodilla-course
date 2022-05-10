package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;

public class OrderProcessor {
    ArrayList<Manufacturer> manufacturers;

    public OrderProcessor() {
        manufacturers = new ArrayList<>();
        manufacturers.add(new ExtraFoodShop());
        manufacturers.add(new HealthyShop());
        manufacturers.add(new GlutenFreeShop());
    }

    //realizacja zamówienia
    public boolean process(OrderRequest orderRequest) {

        Manufacturer manufacturer = manufacturers.stream()
                .filter(m -> m.getName().equals(orderRequest.getManufacturer()))
                .findFirst()
                .orElseThrow();

//            if (manufacturer != null) {
//                manufacturer.process(orderRequest);
//                return true;
//            }
//            System.out.println("Błąd! Nie znaleziono takiego dostawcy ");
//            return false;

        return true;
    }
}
