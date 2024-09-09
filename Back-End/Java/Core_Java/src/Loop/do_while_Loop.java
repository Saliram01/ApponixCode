package loop;

public class do_while_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"Apple","Orange","Mango","Banana"};
		int i = 0;
		do {
			System.out.println(fruits[i]);
			i++;
		}while(i < fruits.length);
	}

}
