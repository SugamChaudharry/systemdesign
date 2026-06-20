package in.SystemDesign.patterns.behavioral.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Amount : "+ amount + " paid by upi");
    }
}
