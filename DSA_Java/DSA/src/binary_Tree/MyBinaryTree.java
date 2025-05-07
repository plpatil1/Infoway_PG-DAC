package binary_Tree;

import java.util.Scanner;

public class MyBinaryTree {
public static void main(String[] args) {
	BinaryTree bt = new BinaryTree();
	BinaryTree bt1 = new BinaryTree();
	
	Scanner sc= new Scanner(System.in);
	int ch;
	do {
		System.out.println("Enter 1 for Insert1()");
		System.out.println("Enter 2 for Insert2()");
		System.out.println("Enter 3 for CalHeight1()");
		System.out.println("Enter 4 for CalHeight2()");
		System.out.println("Enter 5 for Checking Identical()");
		System.out.println("Enter 8 for Display1()");
		System.out.println("Enter 9 for Display2()");
		System.out.println("Enter 0 for EXIT!!");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1: {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Enter Value: ");
			int cd = sc.nextInt();
			bt.insert_Levelwise(cd);
			System.out.println("Inserted SucessFully!!");
			System.out.println("---------------------------------------------------------------");
			
			break;
		}
		case 2: {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Enter Value: ");
			int cd = sc.nextInt();
			bt1.insert_Levelwise(cd);
			System.out.println("Inserted SucessFully!!");
			System.out.println("---------------------------------------------------------------");
			
			break;
		}
		case 3: {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Enter Value: ");
			int cd =  bt.calHeight();
			
			System.out.println("Total Level present in Tree: "+cd);
			System.out.println("---------------------------------------------------------------");
			
			break;
		}
		case 4: {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Enter Value: ");
			int cd =  bt1.calHeight();
			
			System.out.println("Total Level present in Tree: "+cd);
			System.out.println("---------------------------------------------------------------");
			
			break;
		}
		case 5: {
			System.out.println("---------------------------------------------------------------");
			
			boolean cd = bt.isIdentical(bt, bt1);
			
			System.out.println(cd);
			System.out.println("---------------------------------------------------------------");
			
			break;
		}
		case 8:{
			System.out.println("---------------------------------------------------------------");
			bt1.display();
			System.out.println("\n---------------------------------------------------------------");
		    break;
		}
		
		case 9:{
			System.out.println("---------------------------------------------------------------");
			bt.display();
			System.out.println("\n---------------------------------------------------------------");
		    
		}
		}
	}while(ch!=0);
}
}
