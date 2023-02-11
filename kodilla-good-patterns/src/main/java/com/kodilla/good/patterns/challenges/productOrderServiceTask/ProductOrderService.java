package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class ProductOrderService {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private DeliveryService deliveryService;
    private PaymentService paymentService;
    private InformationService informationService;

    public ProductOrderService(final Product product,
                               final OrderService orderService,
                               final OrderRepository orderRepository,
                               final InformationService informationService,
                               final PaymentService paymentService,
                               final DeliveryService deliveryService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrderComplete = orderService.makeNewOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity());

        if (isOrderComplete) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity());

            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedProductQuantity(), false);
        }
    }
}
