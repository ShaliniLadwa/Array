package com.kodnest.training.Players;
import java.util.Scanner;
public class PlayersHeight {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
     System.out.println("enter row and column");
		float [][]arr = new float[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Height of game "+i+" player is "+j);
				arr[i][j]=scan.nextFloat();
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
