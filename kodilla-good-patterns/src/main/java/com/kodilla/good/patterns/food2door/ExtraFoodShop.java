package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExtraFoodShop implements FoodProducer {

    private static Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Caviar", 5);
        products.put("Beef", 6);
        products.put("Truffles", 3);
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
