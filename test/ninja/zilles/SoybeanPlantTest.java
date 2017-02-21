package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/21/17.
 */
public class SoybeanPlantTest {

    private static final double INITIAL_WEIGHT = 0.78;
    private SoybeanPlant soybeanPlant;

    @Before
    public void setUp() throws Exception {
        soybeanPlant = new SoybeanPlant(INITIAL_WEIGHT);
    }

    @Test
    public void testWater() throws Exception {
        soybeanPlant.water();
        soybeanPlant.water();
        assertEquals(INITIAL_WEIGHT + 0.1 + 0.1, soybeanPlant.getWeightInPounds(), .001);
    }

    @Test
    public void testHarvest() throws Exception {
        ArrayList<Food> foods = soybeanPlant.harvest();
        assertEquals("0.39 pounds of Soybean", foods.get(0).toString());
    }

}