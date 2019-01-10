package com.kodilla.good.patterns.food2door;

public class FoodProducerMailService implements InformationService {

    @Override
    public void inform(Customer customer, Product product) {

        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Product: " + product);
    }
}
