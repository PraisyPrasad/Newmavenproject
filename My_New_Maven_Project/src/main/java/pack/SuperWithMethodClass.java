package pack;

public class SuperWithMethodClass extends SuperWithMethodParent{
	public void run() {
		System.out.println("Run Method Child");
	}
	public void printMethod() {
		run();//method name because calling instance method from other instance method
		super.run();
	}

	public static void main(String[] args) {
		SuperWithMethodClass b=new SuperWithMethodClass();
		b.printMethod();

	}

}
