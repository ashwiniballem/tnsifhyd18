package TNSsicet;

public class instancemem {
	String name="ashwini";//instance variable
	static String village="pochampally";//static variable
	void run() {//instance method
		System.out.println(name);
		System.out.println(village);
		System.out.println("running");
	}
	

	public static void main(String[] args) {
		instancemem m1=new instancemem();//to access instance variable object should be created
		//System.out.println(m1.name);
		System.out.println(instancemem.village);//to access static variavle
		m1.run();
		// TODO Auto-generated method stub

	}

}
