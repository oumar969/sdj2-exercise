public class OrderService {
    private OrderStorage orderStorage;

    public OrderService(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    public void createOrder(Order order) {
        orderStorage.save(order);
    }
}