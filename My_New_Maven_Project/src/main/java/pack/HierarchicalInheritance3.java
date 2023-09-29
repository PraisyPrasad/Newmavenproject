package pack;

public class HierarchicalInheritance3 extends HierarchicalInheritance1 {
	String child2="Child 2 of A";
	public void runC() {
		System.out.println("Run C..!");
	}
	public static void main(String[] args) {
		HierarchicalInheritance3 b=new HierarchicalInheritance3();
		b.runA();
		b.runC();
		System.out.println(b.parent);
		System.out.println(b.child2);
		

	}

}
