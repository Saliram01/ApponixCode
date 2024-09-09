package threadCreation;

class MyThread extends Thread
{
	public void run()
    {
        try
        {
        	System.out.println("MyThread starts");
            for(int i = 0; i <= 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("MyThread ends");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

public class CreationThread {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.out.println("Main Thread start");
		MyThread m1 = new MyThread();
		m1.start();
		m1.join();
		System.out.println("Main Thread ends");
	}

}
