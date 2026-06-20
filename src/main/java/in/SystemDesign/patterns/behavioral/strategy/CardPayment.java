package in.SystemDesign.patterns.behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Amount : "+ amount + " paid by Card");
    }
}
