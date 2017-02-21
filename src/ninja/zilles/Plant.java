package ninja.zilles;

import java.util.ArrayList;

/**
 * Created by zilles on 2/21/17.
 */
public abstract class Plant implements Harvestable {

    private static final double GROWTH_FACTOR = 1.1;
    private static final double USEFUL_FRACTION = 0.5;

    private String foodType;
    protected double weightInPounds;

    public Plant(String foodType, double initialWeight) {
        this.foodType = foodType;
        this.weightInPounds = initialWeight;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void water() {
        weightInPounds *= GROWTH_FACTOR;
    }

    public ArrayList<Food> harvest() {
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(new Food(foodType, USEFUL_FRACTION * weightInPounds));
        weightInPounds = 0;
        return foodList;
    }

    private void doThing() {} ;
}
