package flowers;

import lombok.Data;

@Data
public class Flower {
    private FlowerSpec spec;
    private FlowerType type;

    public String getSpecial_atribute() {return spec.getSpecial_atribute();}
    public double getStemLength() {
        return spec.getStemLength();
    }
    public double getPrice() {return spec.getPrice();}
    public Country getCounryofOrigin() {return spec.getCountry_of_origin();}
    public Odor getOdor() {return spec.getOdor();}

}
