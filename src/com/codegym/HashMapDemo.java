package com.codegym;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Thứ hai");
        hashMap.put(3, "Thứ ba");
        hashMap.put(4, "Thứ tư");
        hashMap.put(5, "Thứ năm");
        hashMap.put(6, "Thứ sáu");
        hashMap.put(7, "Thứ bảy");
        hashMap.put(8, "Chủ nhật");

        // phương thức keySet()
        // sẽ trả về 1 Set chứa key có trong hashMap
        System.out.println("Key của các entry trong hashMap: ");
        for (int key : hashMap.keySet()) {
            System.out.println("Key = " + key);
            System.out.println("Value = " + hashMap.get(key));
        }

        // phương thức values() sẽ trả về
        // một tập hợp gồm các value có trong hashMap
        System.out.println("Các value có trong hashMap là: ");
        for (String value : hashMap.values()) {
            System.out.println("Value = " + value);
        }
    }
}
