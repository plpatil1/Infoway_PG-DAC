package recursion;

public class Firrst {
	
	public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
         
        System.out.print("Forward_Recursion Array: ");
        System.out.print("Array: ");
        display(arr,0);
        display_Forward(arr,0);
        
        System.out.println();
        
        System.out.print("Backward_Recursion Array: ");
        display_Backward(arr,0);
        
        System.out.println("\nSum Array Element:- "+sum_of_Array(arr,0)); 
        
        int numm=9156115;
        int ans = count_of_Digits(numm);
        System.out.println("\nCount Digits of "+numm+" :- "+ans);

        System.out.print("\n Square of Array Elements:- ");
         square_of_Element(arr,0);
         
         
         System.out.print("\nCube of Array Elements:- ");
         cube_of_Element(arr, 0);
         
         System.out.println("Patterns:- ");
        Patterns(5);
	}
	
	public static void Stars(int n) {
		
		if(n<1) return;
		
		System.out.print("*");
		Stars(n-1);
		return;
	}
	
	public static void  Patterns(int n)
	{
		if(n<1) return;
		System.out.println(" ");
		Stars(n);
		Patterns(n-1);
		System.out.println(" ");
		Stars(n);
		return;
	}
	public static void cube_of_Element(int[] a, int n) {
		if(n>9) return;
		
		System.out.print(a[n]*a[n]*a[n]+" ");
		cube_of_Element(a,n+1);
		return;
	}
	
	public static void square_of_Element(int a[], int n) {
		if(n>9) return;
		
		System.out.print(a[n]*a[n]+" ");
		square_of_Element(a,n+1);
		return;
	}
	
	public static int count_of_Digits(int num) {
		if(num/10==0) return 1;
		
		return 1+count_of_Digits(num/10);
	}
	
	public static int sum_of_Array(int[] a, int n) {
		if(n>9) return 0;
		
		return a[n] +sum_of_Array(a,n+1);
	}
	public static void display_Backward(int a[], int n) {
		if(n>9) return;
		
		display_Backward(a, n+1);
		System.out.print(a[n]+" ");
		return;
	}
	
	public static void display_Forward(int[] a, int n) {
		if(n>9) return;
		
		System.out.print(a[n]+" ");
		display_Forward(a,n+1);
		return;
	}
	
	public static void display(int[] a, int n) {
		if(n>9) {
			System.out.print("\nBackward_Recursion Array: ");
			return;
		}
		
		
		System.out.print(a[n]+" ");

       display(a,n+1);
		
		
		System.out.print(" "+a[n]+" ");
		return;
	}



}
