package in.SystemDesign.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CardPayment();
        paymentStrategy.pay(20000.00);

        paymentStrategy = new UpiPayment();

        paymentStrategy.pay(4000.00);
    }
}
