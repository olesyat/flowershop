package delivery;

public class NovaPoshta implements Delivery{
    @Override
    public boolean prepare() {
        System.out.println("Delivery with Nova Poshta...");
        return true;
    }
}
