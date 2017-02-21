package ninja.zilles;

/**
 * Created by zilles on 2/21/17.
 */
public class SoybeanPlant extends Plant {

    private static final double GROWTH_FACTOR = .1;

    public SoybeanPlant(double initialWeight) {
        super("Soybean", initialWeight);
    }

    @Override
    public void water() {
        weightInPounds += GROWTH_FACTOR;
    }
}
