package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HealthyShop implements FoodProducer {

    private static Map<String, Integer> products = new HashMap<>();

    static {
        products.put("Apples", 5);
        products.put("Bananas", 6);
        products.put("Carrots", 10);
    }

    @Override
    public boolean processOrder(Product product) {
        Integer valuesInMagazine = products.get(product.getProductName());
        int valuesInMagazineAfterOrder = valuesInMagazine - product.getProductQuantity();

        if (valuesInMagazine >= product.getProductQuantity()) {
            products.put(product.getProductName(), valuesInMagazineAfterOrder);
            System.out.println("Magazine: " + products);
            return true;
        } else if (valuesInMagazine != 0) {
            System.out.println("Currently we don't have as many kilograms of " + product.getProductName() + " as you have chosen.");

        } else {
            System.out.println("We don't have " + product.getProductName() + " in magazine");

        }
        return false;
    }

    @Override
    public InformationService getInformationService() {
        return new FoodProducerMailService();
    }

    static Set<String> getProductsNames() {
        return products.keySet();
    }
}
