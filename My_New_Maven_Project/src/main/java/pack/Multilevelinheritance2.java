package pack;

public class Multilevelinheritance2 extends Multilevelinheritance1 {
	String b="Multilevel Inheritance class2";
	 public void runB() {
		 System.out.println("Run B..!");
	 }

	public static void main(String[] args) {
		Multilevelinheritance2 m=new Multilevelinheritance2();
		m.runA();
		m.runB();
		System.out.println(m.a);
		System.out.println(m.b);

	}

}
