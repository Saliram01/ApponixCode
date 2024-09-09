package Project;

public class GussDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)Math.floor(Math.random()*7+1);
		System.out.println(num);
		switch(num) {
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tusday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("thirsday");
				break;
			case 5:
				System.out.println("friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			
		}
	}

}
