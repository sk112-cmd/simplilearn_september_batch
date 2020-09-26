package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int r1=2,c1=3;
		int r2=3,c2=2;
		int firstMatrix[][]= {{3,-2,5},{3,0,4}};
		int secondMatrix[][]= {{2,3},{-9,0},{0,4}};
		BusinessLogic bl=new BusinessLogic();
		System.out.println("Welcome to Array Multidimensional Matricess example");
		do {
			System.out.println("Array Menu");
			System.out.println("------------");
			System.out.println("1)Add Matrices");
			System.out.println("2)Subtract Matrices");
			System.out.println("3)Delete Matrices");
			System.out.println("4)EXIT");
			System.out.println("Please enter your appropriate choice(1-4)");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:System.out.println("Performing addition of 2 matrices");
			     int[][]results=bl.addMatrices(firstMatrix, secondMatrix, r1, c1, r2, c2);
			     printResultMatrice(results);

				break;
			case 2:System.out.println("This option is under construction thankq for your interest here.....");

				break;
			case 3:System.out.println("This option is under construction thankq for your interest here.....");

				break;
			case 4:System.out.println("Thankq for using our app......");

				break;
			default:System.out.println("Invalid Choice... Choice should and must be between 1-4 only");
				break;
			}
		} while (ch != 4);

	}
	
	public static void printResultMatrice(int[][]results) {
		for(int[]row :results) {
			for(int column:row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}
