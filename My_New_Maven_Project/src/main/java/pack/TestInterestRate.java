package pack;

public class TestInterestRate {

	public static void main(String[] args) {
		//Bank b=new Bank()-- we cwn't give like this
		
		/*Bank b=new SBI();
		int interest_sbi=b.getRateOfInterest();
		System.out.println(interest_sbi);
		
		Bank b1=new HDFC();
		int interest_hdfc=b1.getRateOfInterest();
		System.out.println(interest_hdfc);*/
		
		Bank b;//we can also declare it globally
		b=new SBI();
		int interest_sbi=b.getRateOfInterest();
		System.out.println(interest_sbi);
		
		b=new HDFC();
		int interest_hdfc=b.getRateOfInterest();
		System.out.println(interest_hdfc);

	}

}
