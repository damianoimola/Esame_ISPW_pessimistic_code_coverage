package test;

import logic.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestMain {
    @Test
    public void testStrangeDivisionIsDifferentFromZero1(){
        int a = 3;
        int b = 2;
        assertEquals(Main.divisionIsZero(a, b), false);
    }

    @Test
    public void testStrangeDivisionIsDifferentFromZero2(){
        int a = 3;
        int b = 0;
        assertEquals(Main.divisionIsZero(a, b), true);
    }

    @Test
    public void testStrangeDivisionIsDifferentFromZero3(){
        int a = 0;
        int b = 3;
        assertEquals(Main.divisionIsZero(a, b), true);
    }
}
