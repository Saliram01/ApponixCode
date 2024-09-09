package constructorConcept_this_super;

public class Human {
	int hands=2;
	int eyes=2;
	int nose=1;
	
	 Human(int eyes){
		 this.eyes=eyes;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human viraj=new  Human(2);

		 System.out.println(viraj.eyes);
		 Human oneEye=new  Human(1);
		 System.out.println(oneEye.eyes);
	}

}
