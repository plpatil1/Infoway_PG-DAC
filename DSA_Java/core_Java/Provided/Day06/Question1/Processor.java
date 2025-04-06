/*2. Create an Abstract class Processor with int member variable data and method showData to display data value.
 *  Create abstract method process() to define processing of member data.
a. Create a class Factorial using abstract class Processor to calculate and print factorial of a number by overriding the process method.
b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method
Ask user to enter choice (factorial or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism*/
package question1;

public abstract class Processor {
     protected int data;

	public Processor(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Processor [data=" + data + "]";
	}
     
	public abstract void showData();
	
	
     
}
