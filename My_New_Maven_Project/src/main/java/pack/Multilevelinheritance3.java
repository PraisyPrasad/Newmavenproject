package pack;

public class Multilevelinheritance3 extends Multilevelinheritance2 {
	String c="Multilevel Inheritance class3";
	 public void runC() {
		 System.out.println("Run C..!");
	 }


	public static void main(String[] args) {
		Multilevelinheritance3 a=new Multilevelinheritance3();
		a.runA();
		a.runB();
		a.runC();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);

	}

}
