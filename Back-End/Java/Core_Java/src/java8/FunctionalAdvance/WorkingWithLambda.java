package java8.FunctionalAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WorkingWithLambda {
	static Consumer fun=(num)->{
		
		System.out.println((int )num+10);
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.forEach(fun);

		List mem2=Arrays.asList(1,2,3,4,5);
		mem2.add(50);
		System.out.println(mem2);
	}

}
