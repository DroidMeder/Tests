package kg.geekteck.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomMathTest {
    private CustomMath math;

    @Before
    public void setup(){
        math = new CustomMath();
        System.out.println("Before...");
    }

    @After
    public void tearDown(){
        math=null;
        System.out.println("After...");
    }

    @Test
    public void simpleAddCase(){
        assertEquals("4", math.add(2,2));
        System.out.println("simpleAddCase");
    }

    @Test
    public void divByZero(){
        assertEquals("Нельзя делить на ноль", math.division(4, 0));
        System.out.println("divByZero");
    }
    @Test
    public void simpleSubCase(){
        assertEquals("-7", math.sub(2, 9));
        System.out.println("-7");
    }
    @Test
    public void simpleMultiply(){
        assertEquals("0", math.multiply(4, 0));
        System.out.println("0");
    }

}
