package pack;

public class ExceptionSamplePgm {

	public static void main(String[] args) {
		int a=10,b=20,sum;
		try {
		int s=10/0;//infinity
		}
		catch(Exception e) {
System.out.println("Exception Handled");	
		}
		finally {
			System.out.println("Finally Block");
		}
sum=a+b;
System.out.println(sum);

	}

}
