package com.amigoscode;

import java.awt.*;
import java.util.*;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);
        numbers.add("hello");
        numbers.add(new Point(10,10));

        numbers.remove(1);
        numbers.add(0, -1);

        System.out.println(numbers);
        System.out.println(numbers.contains(9000));

        numbers.clear();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());

        for (Object number : numbers){
            System.out.println(number);
        }

        System.out.println();
        numbers.forEach(System.out::println);

    }
}
