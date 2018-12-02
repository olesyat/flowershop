package flowers;

import lombok.Data;

@Data
public class FlowerSpec {
    private Color color;
    private double price;
    private double StemLength;
    private Odor odor;
    private Country country_of_origin;
    private String special_atribute;

}
