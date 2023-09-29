package pack;

public class Employee {
	int id;
	String name;
	Address address;//Address is a class
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println("ID IS: "+id+"\n"+"NAME: "+name);
		System.out.println("CITY: "+address.city+"\n"+"STATE: "+address.state+"\n"+"COUNTRY: "+address.country);
	}

	public static void main(String[] args) {
		Address ad=new Address("TVM","Kerala","India");
		Employee e=new Employee(25,"Praisy",ad);
		e.display();
		
		Address ad1=new Address("EKM","Kerala","India");
		Employee e1=new Employee(25,"Praisy",ad1);
		e1.display();
		
	}
	

}
