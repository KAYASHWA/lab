package Basics;

public class Employee {

	 int empId; 
     String name;
	 int age;
	 String contactNo;
	
	
	
	public Employee() {}

	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		
}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



}