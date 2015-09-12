package com.fr_soft.demos;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testPlus() {
        Calculator calculator = new Calculator();

        int result = calculator.plus(1, 2);
        
        assertThat(result, is(3));
    }

}
