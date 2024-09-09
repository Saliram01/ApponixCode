package oops.Inheritance;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a = new animal();
		System.out.println(a.name);
		System.out.println(a.speak);
	}

}

class cat{
	String name = "mew";
}
class dog extends cat{
	String speak = "bark";
}
class bird extends dog{
	String tell = "swing";
}
class animal extends bird{
	int val = 2;
}

