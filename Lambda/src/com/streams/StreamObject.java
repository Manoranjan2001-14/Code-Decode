package com.streams;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        String[] names = {"Manoranjan","Deepak","Kamala"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });
    }
}
