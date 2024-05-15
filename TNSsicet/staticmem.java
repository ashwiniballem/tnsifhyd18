package TNSsicet;

public class staticmem {
	String name="ashwini";//instance variable
	static String village="pochampally";//static variable
	static String run() {//static method
		//System.out.println(name);
		System.out.println(village);
		return("running");
		
	}

	public static void main(String[] args) {
		staticmem m1=new staticmem();//to access instance variable
		//System.out.println(staticmem.name);
		System.out.println(m1.name);
		System.out.println(staticmem.village);//to access static variable
		System.out.println(staticmem.run());//to access static member
		// TODO Auto-generated method stub

	}

}
