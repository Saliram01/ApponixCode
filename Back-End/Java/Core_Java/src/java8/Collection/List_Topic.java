package java8.Collection;

import java.util.ArrayList;
import java.util.List;

public class List_Topic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] num= {10,20,30};
		System.out.println(num); //mewmeory
		
		List abc=new ArrayList();
		abc.add(10);
		abc.add(20);
		abc.add(30);
		System.out.println(abc.get(0));
		
		abc.forEach((a)->{

			System.out.println((int)a+10);
		});
		
		
		
		
		//List data=new ArrayList();
		//data.add("apple");
		//data.add("boll");
		//data.add("cat");
		//System.out.println(data);
		////System.out.println(data.get(0));
		////System.out.println(data.get(1));
		////System.out.println(data.get(2));
		//data.forEach((i)->{System.out.println(i);});
	}

}
