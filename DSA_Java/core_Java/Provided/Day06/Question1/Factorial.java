package question1;

public class Factorial extends Processor{

	public Factorial(int data)
	{
		super(data);
	}

	@Override
	public String toString() {
		return "Factorial []";
	}
	public void showData()
	{
		long fact=1;
		for(int i=1; i<=data; i++)
		{
			fact=(long) fact*i;
		}
		System.out.println("Factorial of "+data+"  is:- "+fact);
	}
	
}
