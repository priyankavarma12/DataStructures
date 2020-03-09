package com.arrays;

import java.util.Arrays;

public class RotationArrays {
    
    private static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};

        System.out.println("Array before rotation :: ");
        System.out.println(Arrays.toString(arr));

        rotateArray(arr, 3);

        System.out.println("Array after rotation :: ");
        System.out.println(Arrays.toString(arr));

    }

}
