package delivery;

public class Ukrposhta implements Delivery {
    @Override
    public boolean prepare() {
        System.out.println("Delivery with Urkpost...");
        return true;
    }
}

