package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class Application {
    public static void main(String[] args) {

        Product shoes1 = new Product("Adidas Sneakers", "sport", 200.99);
        Product shoes2 = new Product("Boots", "casual", 350.00);
        Product shoes3 = new Product("Nike Sneakers", "sport", 210.50);
        Product shoes4 = new Product("Puma Runners", "sport", 325.99);

        User user = new User("Michael", 31254, "Warsaw 00-497, Nowy Świat 2", "majkel123456@wp.pl");

        OrderRequest orderRequest = new OrderRequest(user, shoes1, 3);

        ProductOrderService productOrderService = new ProductOrderService(orderRequest.getProduct(),
                new ShopAbcShoes(),
                new RepositoryApp(),
                new EmailService(),
                new TheBank(),
                new DHL());

        OrderDto orderDto = productOrderService.process(orderRequest);
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(orderDto);
    }
}
