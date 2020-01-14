package com.codegym;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Apple", "Táo");
        hashMap.put("Banana", "Chuối");
        hashMap.put("Orange", "Cam");

        // sử dụng Iterator để lấy toàn bộ entry của hashMap
        // vì 1 entry bao gồm key và value
        // nên kiểu dữ liệu của Iterator sẽ bao gồm
        // kiểu dữ liệu của cả key và value
        Iterator<Map.Entry<String, String>> iteratorEntry = hashMap.entrySet().iterator();

        System.out.println("Các entry có trong hashMap là: ");
        while (iteratorEntry.hasNext()) {
            System.out.println(iteratorEntry.next());
        }


        // sử dụng Iterator để lấy toàn bộ key của hashMap
        // thông qua phương thức keySet()
        // vì các key có kiểu là String
        // nên iterator cũng có kiểu là String
        Iterator<String> iteratorKey = hashMap.keySet().iterator();

        System.out.println("Key có trong hashMap là: ");
        while (iteratorKey.hasNext()) {
            System.out.println(iteratorKey.next());
        }

        // sử dụng Iterator để lấy toàn bộ value của HashMap
        // thông qua phương thức values()
        // vì các value có kiểu là String
        // nên iterator cũng có kiểu là String
        Iterator<String> iteratorValue = hashMap.values().iterator();

        System.out.println("Value có trong hashMap là: ");
        while (iteratorValue.hasNext()) {
            System.out.println(iteratorValue.next());
        }

    }
}
