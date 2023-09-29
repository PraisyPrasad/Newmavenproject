package pack;

public class MethodOverridingPgm2 extends MethodOverridingPgm1 {
	@Override
	public void run() {
		System.out.println("Child class run");
		
	}
	public void display() {
	run();
	super.run();
	}

	public static void main(String[] args) {
		MethodOverridingPgm2 a=new MethodOverridingPgm2();
		a.display();
		
	}

}
