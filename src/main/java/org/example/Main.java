package org.example;

import java.util.Arrays;

public class Main {

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 8, 1, 9};

        Double[] doubleArray = {3.14, 2.71, 1.41, 4.67};

        Character[] charArray = {'z', 'a', 'r', 'm'};

        String[] stringArray = {"banana", "apple", "cherry", "dismember"};


        sortArray(intArray);
        sortArray(doubleArray);
        sortArray(charArray);
        sortArray(stringArray);


        System.out.println("Целые числа: " + Arrays.toString(intArray));
        System.out.println("Вещественные числа: " + Arrays.toString(doubleArray));
        System.out.println("Символы: " + Arrays.toString(charArray));
        System.out.println("Строки: " + Arrays.toString(stringArray));
    }
}