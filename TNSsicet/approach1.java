package TNSsicet;

public class approach1 {
	int a=20;//instance variable
	static String name="ashwini";//static variable
	void display() {//instance method 
		System.out.println("student");
	}
	static String display1() {//static method
		return("btech");
		
	}

	public static void main(String[] args) {
		approach1 a1=new approach1();//to access instance method
		System.out.println(a1.a);
		//to access static variable (class name followed by variable)
		System.out.println(approach1.name);
		a1.display();//to access instance method
		System.out.println(approach1.display1());//to print the static method
		
		// TODO Auto-generated method stub

	}

}
