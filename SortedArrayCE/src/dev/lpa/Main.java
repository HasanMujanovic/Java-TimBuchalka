package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getIntegers(5);
        System.out.println(Arrays.toString(firstArray));
        printArray(firstArray);
        sortIntegers(firstArray);
    }
    public static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        int broj;
        for (int i = 0;i<=len-1;i++){
            System.out.println("Unesite broj:");
           broj = scanner.nextInt();
            array[i] = broj;
        }
        return array;
    }
    private static void printArray(int[] array){
        for (int i =0;i<array.length;i++){
            System.out.printf("Element %d contents %d%n",i,array[i]);
        }
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
//                    System.out.println("------->" + Arrays.toString(sortedArray));
                }
            }
//            System.out.println("--->" + Arrays.toString(sortedArray));

        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }
}
