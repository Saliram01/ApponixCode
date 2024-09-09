package files;

import java.io.FileWriter;
import java.util.Scanner;

public class WritingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name where you write : ");
		String file = sc.nextLine();
		try {
			FileWriter fw = new FileWriter("d:/"+file);
			Scanner s = new Scanner(System.in);
			System.out.print("Write in file => ");
			String w = s.nextLine();
			fw.write(w);
			System.out.println("File is written successfully");
			
			fw.close();
			s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
		
	}

}
