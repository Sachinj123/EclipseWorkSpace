package com.sachin;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = rows; i >= 1; i--) {
        
            for (int j = rows; j >= i; j--) 
            { 
                System.out.print(i+" "); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i =2; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
        }
         
         
        //Closing the resources
         
        sc.close();
    }
}


