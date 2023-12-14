package main;

import threads.Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] res =  Util.generateArray(10000);
        System.out.println(Arrays.toString(res));
    }

}