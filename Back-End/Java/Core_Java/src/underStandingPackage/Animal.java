package underStandingPackage;

import package_external.Crow;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog shero=new Dog();
		System.out.println(shero.bark);
		Cat kitty=new Cat();
		System.out.println(kitty.bark);

		Crow cr=new Crow();
		System.out.println(cr.bark);
	}

}
class Cat{
	String bark="mewooo";
}