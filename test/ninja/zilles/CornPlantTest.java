package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/21/17.
 */
public class CornPlantTest {

    private static final double INITIAL_WEIGHT = 3.28;
    private CornPlant cornPlant;

    @Before
    public void setUp() throws Exception {
        cornPlant = new CornPlant(INITIAL_WEIGHT);
    }

    @Test
    public void testWater() throws Exception {
        cornPlant.water();
        cornPlant.water();
        assertEquals(INITIAL_WEIGHT * 1.1 * 1.1, cornPlant.getWeightInPounds(), .001);
    }

    @Test
    public void testHarvest() throws Exception {
        ArrayList<Food> foods = cornPlant.harvest();
        assertEquals("1.64 pounds of Corn", foods.get(0).toString());
    }
}