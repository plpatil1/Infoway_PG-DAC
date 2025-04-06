/*3. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information and a product 
information from user and print income tax and sales tax respectively.*/
package question2;

import java.util.Scanner;

public class XYZ  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice 1 for Enter the Both(employee & Product) Details At Time ");
		System.out.println("Choice 2 for Enter the Employee Details ");
		System.out.println("Choice 3 for Enter the Product Details ");
		System.out.println("Enter Your Choice here :- ");
		int o=sc.nextInt();
		if(o==1)
		{
			System.out.println();
			System.out.println("Enter Employee Details First: ");
			System.out.println("**********************************************************************************************************************************************************");
			System.out.println("Enter the Employee id:- ");
			int id=sc.nextInt();
			System.out.println("Enter the Employee Name:- ");
			String name=sc.next();
			System.out.println("Enter the Employee Salary:- ");
			int sal=sc.nextInt();
			
			
			System.out.println();
			
			
			System.out.println("Enter Product Details Now: ");
			System.out.println("**********************************************************************************************************************************************************");
			System.out.println("Enter the Product Id:- ");
            int pid=sc.nextInt();
            System.out.println("Enter the Product Price:- ");
            int price=sc.nextInt();
            System.out.println("Enter the Product Quantity:- ");
            int qnt=sc.nextInt();
			System.out.println("**********************************************************************************************************************************************************");
			
			
			Taxable e=new Employee(id,name,sal);
			System.out.println(e);
			e.calcTax();
			
			System.out.println("**********************************************************************************************************************************************************");
			
			Taxable p=new Product(pid,price,qnt);
			System.out.println(p);
			p.calcTax();
			
			
			
			
		} else if(o==2)
		{
			System.out.println();
			System.out.println("Enter Employee Details First: ");
			System.out.println("**********************************************************************************************************************************************************");
			
			System.out.println("Enter the Employee id:- ");
			int id=sc.nextInt();
			System.out.println("Enter the Employee Name:- ");
			String name=sc.next();
			System.out.println("Enter the Employee Salary:- ");
			int sal=sc.nextInt();
			
			System.out.println();
			System.out.println("**********************************************************************************************************************************************************");
			
			
			Taxable e=new Employee(id,name,sal);
			System.out.println(e);
			e.calcTax();
			
		} 
		else if(o==3)
		{
			System.out.println("Enter Product Details Now: ");
			System.out.println("**********************************************************************************************************************************************************");
			
			System.out.println("Enter the Product Id:- ");
            int pid=sc.nextInt();
            System.out.println("Enter the Product Price:- ");
            int price=sc.nextInt();
            System.out.println("Enter the Product Quantity:- ");
            int qnt=sc.nextInt();
            
            System.out.println();
			System.out.println("**********************************************************************************************************************************************************");
			
			
			Taxable p=new Product(pid,price,qnt);
			System.out.println(p);
			p.calcTax();
		} else
		{
			System.out.println("INVALID ENTRY!!!!!!....");
		}
		
	}

}
