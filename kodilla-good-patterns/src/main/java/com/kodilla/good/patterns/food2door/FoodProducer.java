package com.kodilla.good.patterns.food2door;

public interface FoodProducer {

    boolean processOrder(Product product);

    InformationService getInformationService();

}
