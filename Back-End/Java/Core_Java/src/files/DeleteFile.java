package files;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter delete fileName : ");
		String file = sc.nextLine();
		try {
			File fd = new File("D:/"+file);
			if(fd.exists()) {
				fd.delete();
				System.out.println("File is deleted successfully");
			}
			else {
				System.out.println("File not found.");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
