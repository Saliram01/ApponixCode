package files;

import java.io.File;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter fileName which you want to read : ");
		String file = sn.nextLine();
		try {
			File readFile =new File("d:/"+file);
			Scanner sc = new Scanner(readFile);
			while(sc.hasNext()) {
				String read =sc.nextLine();
				System.out.println(read);
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sn.close();
	}

}
