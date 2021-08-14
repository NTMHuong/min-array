package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min element of array is: " + min);
    }
}
