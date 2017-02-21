package ninja.zilles;

/**
 * Created by zilles on 2/21/17.
 */
public class Food {

    private String typeFood;
    private double weightInPounds;

    public Food(String typeFood, double weightInPounds) {
        this.typeFood = typeFood;
        this.weightInPounds = weightInPounds;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    @Override
    public String toString() {
        return weightInPounds + " pounds of " + typeFood;
    }
}
