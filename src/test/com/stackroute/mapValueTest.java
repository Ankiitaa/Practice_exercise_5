package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class mapValueTest {

    mapValue mv;
    @Before
    public void setUp() throws Exception {
        mv=new mapValue();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mapValueModify() {
        Map value=new LinkedHashMap();
        value.put("val1","Java");
        value.put("val2","C++");

        Map modify=new LinkedHashMap();
        modify.put("val1","");
        modify.put("val2","Java");

        assertEquals(modify,mv.mapValueModify(value));

        value.clear();
        modify.clear();

        value.put("val1","Java");
        value.put("val2","C++");


        modify.put("1","");
        modify.put("2","Java");

        assertNotEquals(modify,mv.mapValueModify(value));





    }
}