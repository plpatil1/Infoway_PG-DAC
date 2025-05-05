package LinkedList;

import java.util.Scanner;

class CQLL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CircularLL cLL1 = new CircularLL();
		
		int ch; 
		
		do {
			System.out.println("Enter 0 for EXIT!!");
			System.out.println("Enter 1 for InsertFirst()");
			System.out.println("Enter 2 for InsertLast()");
			System.out.println("Enter 3 for DeleteFirst()");
			System.out.println("Enter 4 for DeleteLast()");
			System.out.println("Enter 5 for Insert_by_Position()");
			System.out.println("Enter 6 for Delete_by_Position()");
			System.out.println("Enter 7 for Display()");
			
			System.out.println("Enter Choice: ");
			ch=sc.nextInt();
			
			
			
			switch(ch) {
			case 1:  {
				System.out.println("############################################################");
				System.out.println("Enter Data Value to Insert First"); 
				int d=sc.nextInt();
				cLL1.insert_First(d);
				System.out.println("############################################################");
				break;
			}
			case 2:  {
				System.out.println("############################################################");
				System.out.println("Enter Data Value to Insert Last"); 
				int d=sc.nextInt();
				cLL1.insert_Last(d);
				System.out.println("############################################################");
				break;
			}
			case 3:  {
				System.out.println("############################################################"); 
				int d=sc.nextInt();
				System.out.println(cLL1.delete_First());
				System.out.println("############################################################");
				break;
			}
			case 4:  {
				System.out.println("############################################################"); 
				System.out.println(cLL1.delete_Last());
				System.out.println("############################################################");
				break;
			}
			case 5:  {
				System.out.println("############################################################");
				System.out.println("Enter Data Value for Insert "); 
				int d=sc.nextInt();
				System.out.println("Enter Position where Inserting data");
				int pos = sc.nextInt();
				cLL1.insert_by_pos(d, pos);
				System.out.println("############################################################");
				break;
			}
			case 6:  {
				System.out.println("############################################################");
				
				System.out.println("Enter Position where Deleting data");
				int pos = sc.nextInt();
				cLL1.delete_by_pos(pos);
				System.out.println("############################################################");
				break;
			}
			case 7 : {
				System.out.println("********************************************************");
				System.out.print("LinkedList: ");
				cLL1.display();
				System.out.println("********************************************************");
				break;
			}
			case 0 : {
				System.out.println("*********************************************************");
				System.out.println("Thanks!!!!!!!");
				System.out.println("*********************************************************");
				break;
			}
			default :{
				System.out.println("Invalid Choice");
			}
			}
			
		}while(ch!=0);
	     System.out.println("Thanks!");
	
	}
	
}
