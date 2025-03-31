package coreJava;

public class SimpleIntrest {
   
	private int principle;
	private int rate;
	private int time;
	private float intrest;
	private float totalAmount;
	
	public void Cal_SI(int p,int r, int t)
	{
		principle=p;
		rate=r;
		time=t;
		intrest=(principle*rate*time)/100;
	    totalAmount=principle+intrest;
	}
	
	public void display()
	{
		System.out.println("Simple intrest is "+intrest);
	}
	
	public static void main(String args[])
	{
		SimpleIntrest si= new SimpleIntrest();
		si.Cal_SI(50000, 2, 5);
		si.display();
		
		System.out.println("You Have to Pay Total Amount Including Interest: "+si.totalAmount);
	}
	
}
