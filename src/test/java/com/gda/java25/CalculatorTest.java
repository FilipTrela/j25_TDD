package com.gda.java25;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.sda.gdajava25.Calculator;

@RunWith(JUnit4.class)
public class CalculatorTest {



    @Test
    public void calculatorShouldReturn10WhenAdding5And5(){
        Calculator calculator = new Calculator();

       int sumReasult =  calculator.sum(5,5);
        Assert.assertEquals(10,sumReasult);

    }
}
