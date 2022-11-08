package com.dharshan.array;
import java.util.Arrays; 
public class Exercise9 {
 
public static void main(String[] args) {

   int[] arr = {25, 14, 56, 15, 36, 56};

    // Insert an element in 3rd position of the array (index->2, value->5)
   
   int Index_position = 2;
   int newValue    = 5;

    
  for(int i=arr.length-1; i > Index_position; i--){
    arr[i] = arr[i-1];
   }
   arr[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(arr));
 }
 }