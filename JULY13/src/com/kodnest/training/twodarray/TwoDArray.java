package com.kodnest.training.twodarray;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [][]arr = new int[2][5];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Players "+i+" height is "+j);
			arr[i][j]=scan.nextInt();
		}
	}
	System.out.println("Array contents are....");
	for(int i=0;i<=arr.length-1;i++)
	{
		
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+ " ");
	}
		System.out.println();
}
}
}
