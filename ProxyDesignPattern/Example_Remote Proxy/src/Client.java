public class Client {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorProxy("localhost", 1099);
            int result = calculator.add(3, 4);
            System.out.println("3 + 4 = " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}