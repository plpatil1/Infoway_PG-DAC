package coreJava;

public class SumofFiveSub {
  
	private int math;
	private int biology;
	private int physics;
	private int chemistry;
	private int english;
	private float sum;
	private float perc;
	public void sum_cal(int m, int b, int p, int c, int e)
	{
		math=m;
		biology=b;
		physics=p;
		chemistry=c;
		english=e;
		
		sum=(math+biology+chemistry+physics+ english);
		perc=(sum/500)*100;
		
	}
	public void display()
	{
		System.out.println("Sum All Five Subject is: "+sum+"  outof 500");
		System.out.println("Percentage: "+perc+"%");
	}
	
	public static void main(String args[])
	{
		SumofFiveSub n=new SumofFiveSub();
		
		n.sum_cal(90, 90, 90, 90, 90);
		
		n.display();
	}
}
