package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GlutenFreeShop implements FoodProducer {

    private static Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Bread", 5);
        products.put("Pasta", 6);
        products.put("Cookies", 5);
    }

    @Override
    public boolean processOrder(Product product) {
        return true;
    }

    @Override
    public InformationService getInformationService() {
        return new FoodProducerMailService();
    }

    static Set<String> getProductsNames() {
        return products.keySet();
    }
}
