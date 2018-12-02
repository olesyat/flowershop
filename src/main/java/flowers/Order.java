package flowers;

import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;


import java.util.ArrayList;

public class Order {
    @Getter
    private ArrayList<FlowerBouquet> items;
    @Getter @Setter
    private Payment payment;
    @Getter @Setter
    private Delivery delivery;

    public Order() {
        items = new ArrayList<FlowerBouquet>();
    }

    public boolean process() {
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare();
        return status;
    }

    public double getPrice() {
        double price = 0;
        for (FlowerBouquet bucket: items) {
            price += bucket.getPrice();
        }
        return price;
    }

    public  void addFlowerBucket(FlowerBouquet flower_bucket) {
        items.add(flower_bucket);
    }
}
