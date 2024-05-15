package TNSsicet;

public class overload1 {
	int sub(int a,int b) {
		return(a-b);
	}
	int mult(int a,int b,int c) {
		return(a*b*c);
	}
	int div(int a,int b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
		overload1 a1=new overload1();
		System.out.println(a1.sub(24,17));
		overload1 b1=new overload1();
		System.out.println(b1.mult(2,4,6));
		overload1 c1=new overload1();
		System.out.println(c1.div(100,4));
		// TODO Auto-generated method stub

	}

}
