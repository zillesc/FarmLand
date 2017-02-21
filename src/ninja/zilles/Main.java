package ninja.zilles;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Harvestable> harvestables = new ArrayList<>();
        harvestables.add(new CornPlant(.34));
        harvestables.add(new SoybeanPlant(.75));

        Field field = new Field();
        field.add(new CornPlant(.33));
        harvestables.add(field);

        for (Harvestable harvestable : harvestables) {
            ArrayList<Food> foodList = harvestable.harvest();
            for (Food food : foodList) {
                System.out.println(food);
            }
        }
    }
}
