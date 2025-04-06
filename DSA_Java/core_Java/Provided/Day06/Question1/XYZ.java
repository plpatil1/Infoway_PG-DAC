package question1;

import java.util.Scanner;

public class XYZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Choice   1.  for Facotrial ");
		System.out.println(" Choice   2.  for Circle ");
		System.out.println("Enter choice here:-  ");
		int i=sc.nextInt();
		if(i==1)
		{
			System.out.println("Enter the  value for find out Factorial:- ");
			int n=sc.nextInt();
			Processor f=new Factorial(n);
			f.showData();
		}
		else if(i==2)
		{
			System.out.println("Enter the  Radius for Calculate the Area of Circle:- ");
			int r=sc.nextInt();
			Processor c=new Circle(r);
			c.showData();
		}
		else
		{
			System.out.println("Invalid Entry!!!!!");
		}
	}

}
