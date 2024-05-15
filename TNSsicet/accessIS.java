package TNSsicet;

public class accessIS {
	int a=10;//instance variable
	static int b=20;//static variable

	public static void main(String[] args) {
		int c=30;//local variable
		accessIS a1=new accessIS();//to access instance variable
		System.out.println(a1.a);
		//to access static variable accessIS.b
		System.out.println(accessIS.b);
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
