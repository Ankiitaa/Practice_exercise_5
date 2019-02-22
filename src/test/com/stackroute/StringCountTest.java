package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount sc=new StringCount();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringCount() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",3);
        expectedResult.put("two",2);

        assertEquals(expectedResult,sc.stringCount("one one+two/two-one"));
    }
    @Test
    public void stringCountFailure() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",3);
        expectedResult.put("two",2);

        assertNotEquals(expectedResult,sc.stringCount("one++two/two-one"));
    }
    @Test
    public void stringCountNotNull() {
        Map<String,Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("one",3);
        expectedResult.put("two",2);

        assertNotNull(sc.stringCount("one+two/two-one"));
    }

}