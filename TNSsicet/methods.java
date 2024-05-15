package TNSsicet;

public class methods {
	String name="ashwini";//instance variable
	static String village="pochampally";//static variable
void section() {//instance method
	System.out.println("ece");
}
static String sectiona() {//static method
return("a");
}
	public static void main(String[] args) {		
		int age=20;//local variable
		methods m1=new methods();
		System.out.println(m1.name);
		System.out.println(age);
		System.out.println(methods.village);
		m1.section();
		System.out.println(methods.sectiona());
		//System.out.println(age);
		// TODO Auto-generated method stub

	}

}
