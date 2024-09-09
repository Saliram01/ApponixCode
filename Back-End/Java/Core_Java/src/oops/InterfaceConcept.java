package oops;

interface Animal
{
	void eat();
	void sleep();
}

interface Pet
{
	void play();
}

class Dog implements Animal, Pet
{
	public void eat() {
		System.out.println("Dog eats");
	}
	public void sleep() {
		System.out.println("Dogs are sleep");
	}
	public void play() {
		System.out.println("Dogs are play");
	}
}

public class InterfaceConcept{
	public static void main(String args[]) {
		Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.play();
	}
}