package com.bridgelabz.ArraHandling;

import java.util.Scanner;

public class SmallestElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int limit =sc.nextInt();
        int [] arr1=new int[limit];
        System.out.println("enter elements of array");
        for(int i = 0; i < limit; i++){
            arr1[i]=sc.nextInt();
        }
        int min=arr1[0];
        for(int i=0;i<arr1.length;i++){

            if(arr1[i]<min){
                min=arr1[i];
            }

        }
        System.out.println("Largest number is " + min);

    }
}
