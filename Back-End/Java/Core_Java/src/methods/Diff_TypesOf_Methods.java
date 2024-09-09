package methods;

public class Diff_TypesOf_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human hm = new Human();
		System.out.println(hm.marriage());
		System.out.println(hm.marriage(200));
		hm.marriage("Bike");
	}

}
class Human {
	int legs = 2;
	void withLegs() {}
	String marriage() {
		return "Briyni";
	}
	String marriage(int gf) {
		System.out.println(gf);
		return "Briyni with gift";
	}
	
	Briyani marriage(String gift) {
		System.out.println(gift);
		return new Briyani();
	}

}
class Briyani{};
