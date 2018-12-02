package payment;

public class CardPayment implements Payment{
    @Override
    public boolean process(double price) {
        System.out.format("Paid %.2f with Card...", price);
        return true;
    }
}
