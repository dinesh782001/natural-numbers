package looping;

import java.util.Scanner;
//Write a program to print all natural numbers from 1 to n

public class NaturalNumbers {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("from which number you like to start");
		int start=scanner.nextInt();
		System.out.println("which is the end number");
		int end=scanner.nextInt();
		for(;start<=end;start++)
			System.out.println(start);
		
	}

}
