package flowers;

import java.util.ArrayList;

public class DefaultBouquets {
    private static DefaultBouquets my_bouquet = new DefaultBouquets();
    private ArrayList<FlowerBouquet> defaults;

    private DefaultBouquets() {
        FlowerBouquet flowerBouquet =new FlowerBouquet();
        Flower flower = new Flower();
        FlowerSpec flowerSpec = new FlowerSpec();
        flowerSpec.setColor(Color.BLUE);
        flowerSpec.setPrice(42);
        flowerSpec.setStemLength(12);
        flowerSpec.setOdor(Odor.HEAVENLY);
        flowerSpec.setCountry_of_origin(Country.Netherlands);
        flower.setType(FlowerType.CHAMOMILE);
        flower.setSpec(flowerSpec);
        flowerBouquet.add_flowers(flower, 5);
        defaults.add(flowerBouquet);

    }

    public static DefaultBouquets getInstance() {
        return my_bouquet;
    }
}
