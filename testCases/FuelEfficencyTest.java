package com.heber;

import com.heber.FuelEfficency;
/*import org.junit.Assert.*;
 */
import org.junit.jupiter.api.*;

public class FuelEfficencyTest {
    @Test
    void miles10gallons2 (){
        FuelEfficency f = new FuelEfficency();
        Assertions.assertEquals(5, f.calcMPG(10, 2), "Didn't Work");
    }
    @Test
    void miles20gallons5 (){
        FuelEfficency f = new FuelEfficency();
        Assertions.assertEquals(4, f.calcMPG(20, 5), "Didn't Work");
    }
    @Test
    void miles40gallons5 (){
        FuelEfficency f = new FuelEfficency();
        Assertions.assertEquals(8, f.calcMPG(40, 5), "Didn't Work");
    }
}
