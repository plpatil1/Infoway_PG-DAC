/*2. Create an Abstract class Processor with int member variable data  and method showData to display data value.
 *  Create abstract method process() to define processing of member data. 
a. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method.
b. Create a class  Circle using abstract class Processor  to calculate and print area of a circle by overriding the process method
 Ask user to enter choice (factorial or circle area).  Also ask data to work upon; Use Processor class reference to achieve this mechanism*/
package question1;

public class Factorial extends Processor {

	public Factorial(int data)
	{
		super(data);
	}

	@Override
	public void show() {
		int fact=1;
		
		for(int i=data; i>=1; i--)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	
}
