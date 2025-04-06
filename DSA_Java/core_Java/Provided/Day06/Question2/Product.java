/*3. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information and a product 
information from user and print income tax and sales tax respectively.*/
package question2;

public  class Product implements Taxable {

	private int pid;
	private int price;
	private int Quantity;
	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", Quantity=" + Quantity + "]";
	}
	@Override
	public void calcTax() {
		float sTax=(float) price*salesTax/100;
		System.out.println("sales Tax of this Product:- "+sTax);
		}
	
	
}
