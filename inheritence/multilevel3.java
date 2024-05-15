package inheritence;

public class multilevel3 extends multilevel1{
	public void btech() {
		System.out.println("surviving");
	}
public static void main(String[] args) {
	multilevel1 m1=new multilevel1();
	//multilevel2 m2=new multilevel2();
	multilevel3 m3=new multilevel3();
	m1.school();
	//m2.intermediate();
	m3.btech();
	
	
}
}
