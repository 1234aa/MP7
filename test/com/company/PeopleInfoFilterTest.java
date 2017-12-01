package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleInfoFilterTest {
    PeopleInfoFilter peopleInfoFilter = new PeopleInfoFilter();

    /*****************************HARD CODING FOR THIS TEST******************************/
    @Test
    public void sameName() throws Exception {
        assertEquals("French", peopleInfoFilter.sameName("Ben").get(0).getNationality());
        assertEquals(1.80, peopleInfoFilter.sameName("Ben").get(0).getHeight(),0.01);
        assertEquals(68, peopleInfoFilter.sameName("Ben").get(0).getWeight(),0);
        assertEquals("Singapore", peopleInfoFilter.sameName("Ben").get(1).getNationality());
        assertEquals(1.78, peopleInfoFilter.sameName("Ben").get(1).getHeight(),0.01);
        assertEquals(60, peopleInfoFilter.sameName("Ben").get(1).getWeight(),0);
        assertEquals("India", peopleInfoFilter.sameName("Ben").get(2).getNationality());
        assertEquals(1.92, peopleInfoFilter.sameName("Ben").get(2).getHeight(),0.01);
        assertEquals(64, peopleInfoFilter.sameName("Ben").get(2).getWeight(),0);

    }

}