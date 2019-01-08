package com.kodilla.good.patterns.store;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Product product) {
        System.out.println();

        System.out.println("Thank you for purchasing the product in our store!");
        System.out.println("Order data:");

        System.out.println("User: " + user.getUserName() + "\n" + "Ordered product: " + product.getProductName() + "\n"
                + "Quantity: " + product.getProductQuantity());
    }
}
