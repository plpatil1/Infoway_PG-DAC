package sortings;

import java.util.Scanner;

public class Sortings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,5,6,45,68,1,225,3,646,50,11};
		int d;
		do {
			System.out.println("\nEnter 1 for BubbleSort()");
			System.out.println("Enter 2 for SelectionSort()");
			System.out.println("Enter 3 for InsertionSort()");
			System.out.println("Enter 4 for MergeSort()");
			System.out.println("Enter 5 for QuickSort()");
			System.out.println("Enter 0 for EXIT!!!!!!");
			System.out.println("\nEnter Choice: ");
			d=sc.nextInt();
			
			switch(d) {
			case 1:{
				System.out.println("\n----------------------------------------------");
				Bubble bb = new Bubble();
				
				bb.bubbleSort(arr);
				System.out.println("\n----------------------------------------------");
				break;
			}
			case 2:{
				System.out.println("\n----------------------------------------------");
				Selection sb = new Selection();
				
				sb.selectionSort(arr);
				
				System.out.println("\n----------------------------------------------");
				break;
			}
			case 3: {
				System.out.println("\n----------------------------------------------");
				Insertion in = new Insertion();
				in.insertionSort(arr);
				System.out.println("\n----------------------------------------------");
				
				break;
			}
			
			case 4: {
				System.out.println("\n----------------------------------------------");
				Merge ms = new Merge();
				ms.mergeSort(arr, 0, arr.length-1);
				for(int i:arr) {
					System.out.print(i+" ");
				}
				System.out.println("\n----------------------------------------------");
				
				break;
			}
			
			default: {
				System.out.println("\n----------------------------------------------");
				System.out.println("Invalid Choice!! ");
				System.out.println("\n----------------------------------------------");
			}
			}
		}while(d!=0);
		
		
		
	}
}
