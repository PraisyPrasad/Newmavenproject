package pack;

public class ThrowsSamplePgm {
	public void division(int n,int m) throws ArithmeticException{
		int div=n/m;
		System.out.println(div);
	}

	public static void main(String[] args) {
		ThrowsSamplePgm a=new ThrowsSamplePgm();
		try {
		a.division(40,0);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Rest Of Code");

	}

}
