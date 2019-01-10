package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderProcess {

    private Map<String, FoodProducer> shops = new HashMap<>();

    public OrderProcess() {
        for (String product : ExtraFoodShop.getProductsNames()) {
            shops.put(product, new ExtraFoodShop());
        }
        for (String product : GlutenFreeShop.getProductsNames()) {
            shops.put(product, new GlutenFreeShop());
        }
        for (String product : HealthyShop.getProductsNames()) {
            shops.put(product, new HealthyShop());
        }

    }

    public OrderDto process(Order order) {
        OrderDto orderDto = new OrderDto();
        for (Product product : order.getProductList()) {
            FoodProducer foodProducer = shops.get(product.getProductName());
            if (foodProducer != null) {

                boolean isOrdered = foodProducer.processOrder(product);

                if (isOrdered) {
                    foodProducer.getInformationService().inform(order.getCustomer(), product);
                    orderDto.addProduct(product);
                } else {
                    orderDto.setCompleted(false);
                }
            } else {
                System.out.println("The order is incomplete!");
            }
        }

        return orderDto;
    }
}
