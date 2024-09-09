package dataTypes;

public class Java_Given {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Storage capacity of dataTypes
		 	byte 2^7  2 power 128-1 => 127 to -2 power -128 =>  -128   
		 	short 2^15 => 32767 to -32768
		 */
		byte b = 127; // 1 byte
		System.out.println(b);
		
		short a = 32767; // 2 byte
		System.out.println(a);
		
		int i = 113464; // 4 bytes
		System.out.println(i);
		
		long l = 46461316; // 8 bytes 
		System.out.println(l);
		
		float f = 12.5f; // 4 bytes
		System.out.println(f);
		
		double d = 46423135; // 8 bytes
		System.out.println(d);
		
	}

}
