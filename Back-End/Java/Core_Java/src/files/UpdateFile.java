package files;

import java.io.FileWriter;
import java.util.Scanner;

public class UpdateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter update fileName : ");
		String updateFile = sc.nextLine();
		try {
			String fileAddress = "d:/"+updateFile;
			FileWriter fw = new  FileWriter(fileAddress,true);
			Scanner u = new Scanner(System.in);
			System.out.print("Write add text in file => ");
			String text = u.nextLine();
			fw.append(text);
			System.out.println("File Update Successfully");
			fw.close();
			u.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
