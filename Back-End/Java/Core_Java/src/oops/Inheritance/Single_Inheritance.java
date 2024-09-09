package oops.Inheritance;

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println("Name : " + c.name);
		System.out.println("Age : " + c.age);
	}
}
class Parent{
	String name = "Saliram";
}
class Child extends Parent{
	int age = 22;
}
