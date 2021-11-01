package com.example.simpleparadox.listcity;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("edmonton","AB"));
        assertEquals(listSize+1,list.getCount());
    }
    @Test
    void testHasCity(){

        City city = new City("Edmonton", "AV");
        list.add(city);
        assertTrue(list.hasCity(city));
    }

}
