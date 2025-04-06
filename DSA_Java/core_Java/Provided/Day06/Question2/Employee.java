/*3. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information and a product 
information from user and print income tax and sales tax respectively.*/
package question2;

public class Employee implements Taxable{

	private int empId;
	private String name;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void calcTax() {
		float res= (float)salary*incomeTax/100;
		System.out.println("Income Tax:-  "+res);
	}

	
	
	
	
}
