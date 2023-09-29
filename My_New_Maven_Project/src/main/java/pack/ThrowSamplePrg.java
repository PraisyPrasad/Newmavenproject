package pack;

public class ThrowSamplePrg {
	public void checkNum(int num) {
		if(num<-1) {
			throw new ArithmeticException("Negative Number");
		}
		else {
			System.out.println("Positive Number");
		}
	}

	public static void main(String[] args) {
		ThrowSamplePrg obj=new ThrowSamplePrg();
		try {
		obj.checkNum(-4);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		

	}

}
