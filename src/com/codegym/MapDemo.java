package com.codegym;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> testMap=new HashMap<>();
        //insert
        testMap.put("Hello","Xin chao");
        testMap.put("Thanks","Cam on");
        testMap.put("Goodbye","Tam biet");
        testMap.put("Hello","Xin chao cac ban");

        //display
        for(String key:testMap.keySet()){
            System.out.println("Key: "+key);
            System.out.println("Value: "+testMap.get(key));
        }
        System.out.println("------");
        for(String value:testMap.values()){
            System.out.println(value);
        }
        System.out.println("-------");
        System.out.println(testMap);
        System.out.println("-------");
        for(Map.Entry<String,String> entryValue: testMap.entrySet()){
            System.out.println(entryValue.getKey()+"->"+entryValue.getValue());
        }
        System.out.println("------");
        Iterator iterator= testMap.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Tim kiem
        String keyword="Hello";
        if(testMap.containsKey(keyword)){
            System.out.println(testMap.get(keyword));
        }else{
            System.out.println("Not found");
        }
    }
}
