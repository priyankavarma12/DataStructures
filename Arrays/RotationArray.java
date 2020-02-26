package com.arrays;

import java.util.Arrays;

public class RotationArray {

    private static int rotationArray(int num[], int rotation){
        int temp = 0;
        for(int i=0;i<rotation;i++){
            temp = num[num.length-1];
            for(int j = num.length-1; j >0; j--){
                num[j] = num[j-1];
            }
            num[0] = temp;
        }

        return temp;
    }

    public static void main(String[] args) {
        int num[] = new int[]{1,2,3,4,5,6,7};
        System.out.print("Input Array Before Rotation :: ");
        System.out.println(Arrays.toString(num));
        rotationArray(num, 3);
        System.out.print("Input Array After rotation :: ");
        System.out.println(Arrays.toString(num));
    }
}
