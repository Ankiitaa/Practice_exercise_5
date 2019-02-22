package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class AscendTest {

    Ascend a=new Ascend();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ascendingOrder() {
        String[] str={"Harry","olive","Alice","Bluto","Eugene"};
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","Harry","olive"));
        assertEquals(expected,a.ascendingOrder(str));
    }
    @Test
    public void ascendingOrderFailure() {
        String[] str={"Harry","olive","Alice","Bluto","Eugene"};
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","olive","Harry"));
        assertNotEquals(expected,a.ascendingOrder(str));
    }

}