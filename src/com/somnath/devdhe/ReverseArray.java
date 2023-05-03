package com.somnath.devdhe;

import java.util.Arrays;

public class ReverseArray {

public static void main(String[] args) {
        
        int array [] ={4,2,8,6,5};
        
        for(int i=0; i<array.length/2;i++){
            
            int j= array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=j;
            
        }
        
        System.out.println("Hello, World!"+Arrays.toString(array));
    }
}
