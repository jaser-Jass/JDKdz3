package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(59, 5.7));
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + ArrayUtils.compareArrays(array1, array2));

        Pair<String, Integer> pair = new Pair<>("salary", 100);
        System.out.println(pair);
        System.out.println(pair.getSecond());
    }
}