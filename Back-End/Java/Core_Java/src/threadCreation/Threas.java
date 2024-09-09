package threadCreation;

public class Threas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()); // access thread name.
		
		Thread.currentThread().setName("MyThread");
		System.out.println(Thread.currentThread().getName());
	}

}
