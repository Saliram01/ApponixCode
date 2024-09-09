package Conditional;

import java.util.Scanner;

public class if_else_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a button num : ");
		int button = sc.nextInt();
		
		if(button == 1) {
			System.out.println("Hello");
		}
		else if(button == 2) {
			System.out.println("Namaste");
		}
		else if(button == 3) {
			System.out.println("Bonjour");
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
