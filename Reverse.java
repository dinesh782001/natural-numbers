package looping;

import java.util.Scanner;

public class Reverse {
	
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("from which number you like to start");
		int start=scanner.nextInt();
		System.out.println("which is the end number");
		int end=scanner.nextInt();
		for(;end>=start;end--)
			System.out.println(end);
		
	}

}
