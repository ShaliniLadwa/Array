package com.kodnest.training.array;

import java.util.Scanner;

public class Players {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the person");
		int n=scan.nextInt();
		boolean []arr=new boolean[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Person is Married? "+i);
	        arr[i]=scan.nextBoolean();  
	    }
        System.out.println("person are ");
        for(int i=0;i<=arr.length-1;i++)
        {
	     System.out.println("person "+i+" married "+ arr[i]);
        }
	}
}
