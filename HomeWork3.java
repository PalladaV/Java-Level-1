/**
 *Java 1. Home Work #2
 *
 *@author Yana
 *@version 16/02/2022
 */
 import java.util.Arrays;
 
public class HomeWork3 {
    public static void main(String[] args) {
    invertArray();
    fillArray();
    changeArray();
    fillDiagonal();
    int[] arr = initArray(10, 5);
    System.out.println("Result array: " + Arrays.toString(arr));
    }    
    
    static void invertArray() {
        System.out.println("--- Exercise 1 ---");
         int[] arr = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Before inversion: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println("After inversion: " + Arrays.toString(arr));
    }
    
    static void fillArray() {
        System.out.println("--- Exercise 2 ---");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Filled array: " + Arrays.toString(arr));
    }
    
    static void changeArray() {
        System.out.println("--- Exercise 3 ---");
        int[] arr = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Initial array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
        }
        System.out.println("Result array: " + Arrays.toString(arr));
    }
    
    static void fillDiagonal() {
        System.out.println("--- Exercise 4 ---");
        int[][] arr = new int[5][5];
        System.out.println("Initial array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.println("Result array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    
    static int[] initArray(int len, int initialValue) {
        System.out.println("--- Exercise 5 ---");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}