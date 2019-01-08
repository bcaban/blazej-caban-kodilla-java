package com.kodilla.good.patterns.store;


public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }


}
