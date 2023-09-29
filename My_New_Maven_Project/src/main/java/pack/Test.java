package pack;

public class Test implements Printable,Showable{
	

	public void printA() {
		System.out.println("Printingggggggggggggggggg");
		
	}
	public void show() {
		System.out.println("SHOW");
		
	}

	public static void main(String[] args) {
		//Printable p=new Print(); we can't instantiate an interface

		Printable p=new Test();
		p.printA();
		Showable s=new Test();
		s.show();
		//or
		Test t=new Test();
		t.printA();
		t.show();
	}

	

	
	

}
