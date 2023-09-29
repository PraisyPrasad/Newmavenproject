package pack;

public class ExceptionPropagationEx {
	public void methodA() {
		try {
		methodB();
		}
		catch (Exception e) {
			System.out.println("Exception Handeled");
		}
	}
	public void methodB(){
		methodC();
	}
    public void methodC() {
    	int a=10/0;
    	throw new ArithmeticException();
    	
    }
	public static void main(String[] args) {//can be handled in main method also
		ExceptionPropagationEx a =new ExceptionPropagationEx();
		//try{
		a.methodA();
		//}
		//catch (Exception e) {
			//sysout("handled")
		//}

	}

}
