package oops;
abstract class Area
{
	abstract void area();
}
class Circle extends Area
{
	void area() 
	{
		double pi = 3.14 , r = 12.5 , A;
		A = pi * r * r;
		System.out.println("Area of circle is : " + A);
	}
}
class Rectangle extends Area
{
	void area()
	{
		double l = 12, w = 20, A;
		A = l * w;
		System.out.println("Area of rectangle is : " + A);
	}
}
public class AbstractionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area  A = new Circle();
		A.area();
		Area  B = new Rectangle();
		B.area();
	}

}
