package com.arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int temp =0;
        int start = 0;
        int end = n-1;
        System.out.println("Printing the arrays before reversal ::");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
         System.out.println();
        while(start <  end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Printing the arrays after reversal :: ");
        for(int j =0;j<n;j++){
            System.out.print(arr[j] +" ");

        }

    }

}
