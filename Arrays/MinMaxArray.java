package com.arrays;

public class MinMaxArray {

    public static void main(String[] args) {
        int arr[] = {7,1,5,6,2,0};
        System.out.println("The Maximum element is :: "+maxElement(arr));
        System.out.println("The Minimum element is :: "+minElement(arr));
    }


    private static int minElement(int arr[]){
       int min = arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }
       return min;
    }

    private static int maxElement(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
