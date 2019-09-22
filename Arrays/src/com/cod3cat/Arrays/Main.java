package com.cod3cat.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int arraySize;

    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        arraySize = scanner.nextInt();
        int[] myArray = getIntegers(arraySize);
        printArray(myArray);
        myArray = sortIntegers(myArray);
        printArray(myArray);

        System.out.println(Arrays.toString(myArray));
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Integer at place: " +i+ " is: " +array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + "integers \r");
        int[] myArray = new int[number];
        for(int i = 0;  i < number; i++){
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }

    public static int[] sortIntegers(int[] array){
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


}
