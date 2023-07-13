package com.kodnest.training.array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String []arr=new String[10];
		System.out.println("Enter the employee name ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("enter the employee " +i);
	arr[i]=scan.next();
	
	}
System.out.println("employee are");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i] +" ");
}
	}
}
