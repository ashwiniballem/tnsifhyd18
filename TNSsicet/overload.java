package TNSsicet;

public class overload {
	static int add(int a,int b) {
		return(a+b);
		
	}
static int add(int a,int b,int c) {
	return(a+b+c);
	
}
public static void main(String[] args) {
	System.out.println(overload.add(25,25));
	System.out.println(overload.add(25,25,25));
}
}
