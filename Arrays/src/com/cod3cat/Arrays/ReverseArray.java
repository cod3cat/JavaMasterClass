package com.cod3cat.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter array elements: ");
        int[] myArray = getIntegers(arraySize);
        System.out.println("Array looks like this: ");
        printArray(myArray);
        System.out.println("Array after reversing: ");
        reverseArray(myArray);
        printArray(myArray);
    }


    private static int[] getIntegers(int arraySize){
        int[] array = new int[arraySize];
        for(int i = 0; i< arraySize; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array [i] = array[array.length -i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
