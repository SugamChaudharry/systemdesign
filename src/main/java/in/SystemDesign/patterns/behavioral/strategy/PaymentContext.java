package in.SystemDesign.patterns.behavioral.strategy;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount){
        paymentStrategy.pay(amount);
    }
}
