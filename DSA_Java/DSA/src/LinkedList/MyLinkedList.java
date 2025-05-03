package LinkedList;

import java.util.Scanner;

public class MyLinkedList {
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		SingleLinkedList sll = new SingleLinkedList();
		
		int ch;
		
		
		do {
			
			System.out.println("...Operation On Singly Linked List...");
			System.out.println("	1. -> InsertFirst()");
			System.out.println("	2. -> InsertLast()");
			System.out.println("	3. -> Insert_By_Pos()");
			System.out.println("	4. -> DeleteFirst()");
			System.out.println("	5. -> DeleteLast()");
			System.out.println("	6. -> Delete_By_Pos()");
			System.out.println("	7. -> Display()");
			System.out.println("	0. -> Exit");
			
			
			System.out.println("Enter Your Choice... ");
			
			ch = s.nextInt();
			
			
			switch(ch)
			{
			
			
				case 1:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To InsertFirst in Linked-List");
					int v = s.nextInt();
					
					sll.InsertFirst(v);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 2:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To InsertLast in Linked-List");
					int v = s.nextInt();
					
					sll.InsertLast(v);
					System.out.println("*********************************************************");
					break;
				}
				
				
				case 3:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Value To Insert in Linked-List");
					int d = s.nextInt();
					System.out.println("Enter Position To Insert Value in Linked-List");
					int p = s.nextInt();
					sll.Insert_By_Pos(d, p);
					System.out.println("*********************************************************");
					break;
				}
				
				case 4:
				{
					System.out.println("*********************************************************");
				
					int d = sll.DeleteFirst();
					
					System.out.println(d +" -> Deleted First...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 5:
				{
					System.out.println("*********************************************************");
					
					int d = sll.DeleteLast();
					
					System.out.println(d +" -> Deleted Last...");
					System.out.println("*********************************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Position To Delete Node in Linked-List");
					int p = s.nextInt();
					
					sll.Delete_By_Pos(p);
					System.out.println("*********************************************************");
					break;
					
				}
				
				case 7:
				{
					System.out.println("*********************************************************");
					sll.Display();
					System.out.println("\n*********************************************************");
					break;
				}
				
				case 0:
				{
					System.out.println("*********************************************************");
					System.out.println("Thank You [ SingleLinkedList Operation Completed ]...");
					System.out.println("*********************************************************");
					break;
				}
				
				
				default :
				{
					System.out.println("*********************************************************");
					System.out.println("Enter Valid Choice Number...");
					System.out.println("*********************************************************");
					break;
				}
			}
			
			
			
		}while(ch != 0);
		
		
		
	}

}
