package ninja.zilles;

import java.util.ArrayList;

/**
 * Created by zilles on 2/21/17.
 */
public class Field implements Harvestable {

    private ArrayList<Plant> plants;

    public Field() {
        this.plants = new ArrayList<>();
    }

    public void add(Plant plant) {
        plants.add(plant);
    }

    public Plant get(int index) {
        return plants.get(index);
    }

    public void water() {
        for (Plant plant : plants) {
            plant.water();
        }
    }

    public ArrayList<Food> harvest() {
        ArrayList<Food> foodList = new ArrayList<>();
        for (Plant plant : plants) {
            foodList.addAll(plant.harvest());
        }
        return foodList;
    }
}
