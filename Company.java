package Basics;

public class Company{
	public static void main(String[] args) {
		Employee e1 = new Employee(01, "Raju", 20);

		System.out.println();
		System.out.println(e1.getName());
		System.out.println(e1.getAge());

		e1.setContactNo("8267191710");
		System.out.println(e1.getContactNo());


		Employee e2 = new Employee(02, "Ravi", 21);

		System.out.println();
		
		System.out.println(e2.getName());
		System.out.println(e2.getAge());

		e2.setContactNo("9087657897");
		System.out.println(e2.getContactNo());
	}

}       

