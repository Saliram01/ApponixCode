package static_keyword;
class Keyword{
	String name; // it is a instance variable and it create memory according to number of calling object. 
	// it is also caled class variable and memory creation only one time.
	static int num = 5; // when we declear variable with static keyword and it will be accessed globally in program.
	
	static void Something() { // static method it directly call with class name and does't call with object
		System.out.println("Static method");
	}
	static{ // static block is a set of instructions that is runs only once when a class is loaded into memory.
		System.out.println("Static block");
	}
}
public class Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyword.Something();
	}

}
