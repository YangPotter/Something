package com.JavaLearning.JavaSELearning.Container;

import java.util.*;

public class Test_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new TreeMap();

        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);
        m2.put("A", 1);
        m2.put("B", 2);

        System.out.println(m1.size());
        System.out.println(m1.get("two"));
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(3));
        if (m1.containsKey("three")) {
            int i = (Integer) m1.get("three");
            System.out.println(i);
        }
        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);

    }
}