package LinkedList;

import java.util.Scanner;

public class MyDLL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DoublyLL DL1 = new DoublyLL();
		
		int cd = sc.nextInt();
		do {
			System.out.println("Enter 0 for EXIT!!!!");
			System.out.println("Enter 1 for InsertFirst()");
			System.out.println("Enter 2 for InsertLast()");
			System.out.println("Enter 3 for DeleteFirst()");
			System.out.println("Enter 4 for DeleteLast()");
			System.out.println("Enter 9 for Display()");
			System.out.println("Enter Choice: ");
			cd = sc.nextInt();
			
			switch(cd) {
			case 1 : {
				System.out.println("*****************************************");
				
				System.out.println("Enter Data Value for Insert First");
				int d = sc.nextInt();
				
				DL1.insert_First(d);
				
				System.out.println("*****************************************");
				break;
			}
			case 2 : {
				System.out.println("*****************************************");
				
				System.out.println("Enter Data Value for Insert Last");
				int d = sc.nextInt();
				
				DL1.insert_Last(d);
				
				System.out.println("*****************************************");
				break;
			}
			case 3 : {
				System.out.println("*****************************************");
				
				System.out.println("Deleted Successfully Last Node "+DL1.delete_First());
				
				
				System.out.println("*****************************************");
				break;
			}
			case 4 : {
				System.out.println("*****************************************");
				
				System.out.println("Deleted Successfully Last Node "+DL1.delete_Last());
				DL1.delete_First();
				
				System.out.println("*****************************************");
				break;
			}
			
			
			case 9 : {
System.out.println("*****************************************");
				
				System.out.println("Enter Data Value for Insert First");
				DL1.display();
				System.out.println("\n*****************************************");
				break;
			}
			}
		} while(cd != 0);
		System.out.println("Thanks!!!!!!!!");
		
	}
	

}
