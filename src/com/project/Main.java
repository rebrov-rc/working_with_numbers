package com.project;

import stream.StreamMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> res = new ArrayList<>();
        for (Integer i: intList ) {
            if (i > 0 && i%2 == 0){
                res.add(i);
            }
        }
        res.sort((a,b) -> a - b);


        System.out.println(res.toString());

        // By Stream API
        StreamMain.main(intList);
    }
}
