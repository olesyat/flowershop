package flowers;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FlowerBouquet {
    private ArrayList<Flower> bouquet;
    private double price;
    public double getPrice() {
        double f_price = 0;
        for(Flower flower: bouquet) {
            f_price += flower.getPrice();
        }
        return f_price;
    }
    public FlowerBouquet() {
        this.bouquet = new ArrayList<Flower>();
    }

    public void add_flowers(Flower flower, Integer n){
        for (int i = 0; i < n; i++) {
            bouquet.add(flower);
        }
    }
}
