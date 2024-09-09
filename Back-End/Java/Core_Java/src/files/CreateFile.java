package files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name : ");
		String file = sc.nextLine();
		try {
			File fc = new File("d:/"+file);
			if(!fc.exists()) {
				fc.createNewFile();
				System.out.println("File is created");
			}
			else {
				System.out.println("This destination already contain a folder name ' "+file+" '");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
