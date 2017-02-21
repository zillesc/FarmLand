package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/21/17.
 */
public class FieldTest {

    private Field field;

    @Before
    public void setUp() throws Exception {
        field = new Field();
        field.add(new CornPlant(.57));
        field.add(new SoybeanPlant(8.2));
    }

    @Test
    public void water() throws Exception {
        field.water();
        assertEquals(8.3, field.get(1).getWeightInPounds(), .00001);
    }

    @Test
    public void harvest() throws Exception {
        ArrayList<Food> foods = field.harvest();
        assertEquals("Soybean", foods.get(1).getTypeFood());
        assertEquals(4.1, foods.get(1).getWeightInPounds(), .00001);
    }

}