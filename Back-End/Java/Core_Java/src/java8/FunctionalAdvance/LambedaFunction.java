package java8.FunctionalAdvance;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambedaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Human{
	int ag=20;
	Function abc=(a)->{return "hh";};
	Consumer abcNoreturn=(a)->{};
	Predicate abcBoolean=(a)->{return true;};
	
	
	int getAge(){
		return ag;
	}
}
