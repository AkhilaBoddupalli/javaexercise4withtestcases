package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
   StringTranspose obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new StringTranspose();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenAStringShouldReturnTransposeOfAString() {
        //Act


        String result = obj.TransposeOfAString("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("","a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void givenAStringShouldReturnNothing() {
        //Act


        String result = obj.TransposeOfAString("");
        //Assert
        assertEquals("","",result);
    }
    @Test
    public void givenANumberShouldReturnReverseOfNumbers() {
        //Act


        String result = obj.TransposeOfAString("123 789");
        //Assert
        assertEquals("","321 987",result);
    }

}