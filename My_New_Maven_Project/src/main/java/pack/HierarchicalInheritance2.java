package pack;

public class HierarchicalInheritance2 extends HierarchicalInheritance1 {
	String child1="Child 1 of A";
	public void runB() {
		System.out.println("Run B..!");
	}
	public static void main(String[] args) {
		HierarchicalInheritance2 a=new HierarchicalInheritance2();
		a.runA();
		a.runB();
		System.out.println(a.parent);
		System.out.println(a.child1);
		

	}

}
