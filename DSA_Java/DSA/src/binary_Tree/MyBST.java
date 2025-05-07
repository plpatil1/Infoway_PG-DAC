package binary_Tree;

import java.util.Scanner;

public class MyBST {
	public static void main(String[] args) {
		BST bst = new BST();
		
		Scanner sc =  new Scanner(System.in);
		int cd;
		
		do {
			System.out.println("Enter 1 for Insert()");
			System.out.println("Enter 9 for Display()");
			System.out.println("Enter 0 for EXIT!!!!!");
			
			cd=sc.nextInt();
			
			switch(cd) {
			case 1 :{
				System.out.println("\n---------------------------------------------------------------");
				
				System.out.println("Enter Value: ");
				int d = sc.nextInt();
				
				bst.insert_bst(d);
				
				System.out.println("Inserted Sucessfully!!!");
				System.out.println("\n---------------------------------------------------------------");
				break;
			}
			
			case 9 :{
				System.out.println("\n---------------------------------------------------------------");
				bst.display();
				System.out.println("\n---------------------------------------------------------------");
			break;
			}
			}
		}while(cd!=0);
	}

}
