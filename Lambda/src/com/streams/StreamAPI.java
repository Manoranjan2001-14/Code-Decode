package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 12, 11, 34, 45, 6, 22);

//        Stream<Integer> stream = list1.stream();
//        List<Integer> sList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(sList);

        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}