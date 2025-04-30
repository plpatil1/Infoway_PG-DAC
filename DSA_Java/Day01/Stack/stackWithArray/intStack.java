package DsaStack;

public class intStack {
 private int arr[];
 private int top;
 
 public intStack() {
	 arr=new int[10];
	 top=-1;	 
 }
 public intStack(int size) {
	 arr=new int[size];
	 top=-1;
 }
 
 public void push(int d) {
	 if(top==arr.length-1) {
		 System.out.println("Overflow");
		 return;
	 }
		 top++;
		 arr[top]=d;
	      return;
 }
 
 public int pop() {
	 int d=-9999;
	 if(top==-1) {
		 System.out.println("Underflow");
		 return d;
	 }
	
	  d = arr[top];
	 top--;
	 return d;
 }
 
 public int peek() {
	 return arr[top];
 }
 public boolean isFull() {
	 boolean d=false;
	 if(top==arr.length-1) {
		 d =  true;
	 } else {
		 d=false;
	 }
	 return d;
 }
 
 public boolean isEmpty() {
	 boolean d=false;
	 if(top==-1) {
		 d=true;
	 } else {
		 d=false;
	 }
	 return d;
 }
 public int size() {
	 return top;
 }
}
