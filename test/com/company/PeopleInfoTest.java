package com.company;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleInfoTest {
    public static final String testString = "{ \"Name\": \"Aaron\", \"Gender\": \"male\", \"Nationality\": \"United States\"" +
            ", \"Height\": 1.88, \"Weight\": 80}";
    private PeopleInfo peopleInfo;
    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        peopleInfo = gson.fromJson(testString, PeopleInfo.class);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Aaron", peopleInfo.getName());
    }

    @Test
    public void getGender() throws Exception {
        assertEquals("male", peopleInfo.getGender());
    }

    @Test
    public void getNationality() throws Exception {
        assertEquals("United States", peopleInfo.getNationality());
    }

    @Test
    public void getHeight() throws Exception {
        assertEquals(1.88, peopleInfo.getHeight(),0.01);
    }

    @Test
    public void getWeight() throws Exception {
        assertEquals(80, peopleInfo.getWeight());
    }

}