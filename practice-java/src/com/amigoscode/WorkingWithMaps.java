package com.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hannah");
        map.put(2, "Jamil");
        map.put(3, "Alice");
        map.put(3, "Carla");

        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.keySet());
    }
}
