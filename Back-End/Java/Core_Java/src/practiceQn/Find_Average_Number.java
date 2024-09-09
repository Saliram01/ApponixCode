package practiceQn;

import java.util.Scanner;

public class Find_Average_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1st num : ");
		int first = sc.nextInt();
		System.out.print("2nd num :");
		int second = sc.nextInt();
		System.out.print("3rd num : ");
		int third = sc.nextInt();
		
		int sum = first + second +third;
		int avg = sum / 3;
		System.out.println("Avg num is : "+ avg);
			
		sc.close();
	}

}
