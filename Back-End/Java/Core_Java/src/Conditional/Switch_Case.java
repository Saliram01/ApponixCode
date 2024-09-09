package Conditional;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("Hello");
				break;
		case 2: System.out.println("Namaste");
				break;
		case 3: System.out.println("Bunjor");
				break;
		default: System.out.println("Invalid number.");
		}
		sc.close();
	}

}
