package question1;

import java.util.Scanner;

public class Xyz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Choice 1 for Circle  and   2 for  factorial: ");
	       int a=sc.nextInt();
	       if(a==1)
	       {
	    	   System.out.println("Enter the raidus of circle: ");
	    	   int r=sc.nextInt();
	    	   Processor c=new Circle(r);
	    	   c.show();
	       } else if(a==2)
	       {
	    	   System.out.println("Enter the Number to find factorial: ");
	    	   int fc=sc.nextInt();
	    	   Processor f=new Factorial(fc);
	    	   f.show();
	       } else
	       {
	    	   System.out.println("INVALID ENTRY....");
	       }
	}
}
