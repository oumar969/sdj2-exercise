public class OrderService {
    private OrderRepository orderRepository;

    public OrderService() {
        this.orderRepository = new OrderRepository();
    }
    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}