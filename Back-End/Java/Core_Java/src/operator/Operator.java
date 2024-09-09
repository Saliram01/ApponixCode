package operator;

public class Operator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Logical &&
		System.out.println(50 > 10 && 30 > 10);  // True =>>  Both true
		System.out.println(50 > 10 && 30 < 10); // False =>> One false
		
		
		// Logical ||
		System.out.println(50 < 10 || 30 < 20);  // False =>> Both false
		System.out.println(20 > 10 || 10 < 5);  // True =>> One is true
		
		// Logical !
		System.out.println(!(5 < 2));  // If Condtion is False then output is True
		System.out.println(!(5 > 2));  // if Condition is True then output is False
		
		// Boolean 
		int a = 50, b = 20;
		System.out.println(5 > 1 & 6 > 4); 
		System.out.println(a++ < 20  | ++b > 10);

		
		// Ternary operator
		String s;
		s = a > b ? "Hello" : "Bye";
		System.out.println(s);
		
		// increment and decrement
//		int a = 5, b;
		b = --a; // a = a-1  b=a
		b= a--; // b = a   a = a-1
		b = ++a + a++;
		System.out.println(a);
		System.out.println(b);
	}

}
