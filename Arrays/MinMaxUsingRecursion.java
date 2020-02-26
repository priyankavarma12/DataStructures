package com.arrays;

public class MinMaxUsingRecursion {

    public static void main(String[] args) {
        int arr[] = {7,1,5,6,2,0};
        int n = arr.length;
        System.out.println("Maximum element :: "+findMaximum(arr, n));
        System.out.println("Minimum element :: "+findMinimum(arr, n));
    }

    private static int findMinimum(int arr[], int n){
        if(n == 1)
            return arr[0];
         return Math.min(arr[n-1], findMinimum(arr,n-1));
    }

    private static int findMaximum(int arr[], int n){
        if(n == 1)
            return arr[0];
        return Math.max(arr[n-1], findMaximum(arr, n-1));
    }
}
