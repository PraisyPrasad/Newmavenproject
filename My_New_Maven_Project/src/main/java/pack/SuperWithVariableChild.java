package pack;

public class SuperWithVariableChild extends SuperWithVariableParent {
	String color="Red";
	
	public void printColor() {
		System.out.println(color);//this color is from child class
		System.out.println(super.color);//super keyword will define it is from parent class
		System.out.println(a);//in child class no integer so directly from parent class it will print
	}
	public static void main(String[] args) {
		
		SuperWithVariableChild a=new SuperWithVariableChild();
		a.printColor();
	}

}
