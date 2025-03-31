package coreJava;

public class MyDate {
	
	private int dd;
	private int mm;
	private int yy;
	 
	public void dateInit(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public static void main(String args[])
	{
		MyDate j=new MyDate();
		j.dateInit(12, 12, 2012);
		j.displayDate();
	}

}
