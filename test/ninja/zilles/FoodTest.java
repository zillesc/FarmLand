package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/21/17.
 */
public class FoodTest {

    private Food food;

    @Before
    public void setUp() throws Exception {
        food = new Food("Corn", .37);
    }

    @Test
    public void getTypeFood() throws Exception {
        assertEquals("Corn", food.getTypeFood());
    }

    @Test
    public void getWeightInPounds() throws Exception {
        assertEquals(.37, food.getWeightInPounds(), .000001);
    }

    @Test
    public void toStringTest() throws Exception {
        assertEquals("0.37 pounds of Corn", food.toString());
    }

}