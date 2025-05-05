package LinkedList;

public class CircularLL {
	private IntNode last;

	public CircularLL() {
		last = null;
	}

	public IntNode getLast() {
		return last;
	}

	public void setLast(IntNode last) {
		this.last = last;
	}
	
	
   public void insert_First(int d) {
	   IntNode NN = new IntNode(d);
	   
	   if(last == null) {
		   last=NN;
		   last.setNext(NN);
		   return;
		   }
	   NN.setNext(last.getNext());
	   last.setNext(NN);
   }
   
   public void insert_Last(int d) {
	   IntNode NN = new IntNode(d);
	   
	   if(last == null) {
		  last=NN;
		  NN.setNext(NN);
	   }
	   NN.setNext(last);
	   last.setNext(NN);
	   last=NN;
	   return;  
   }
   
   public int delete_First() {
	   
	   if(last==null) {
		   System.out.println("LL is Empty()");
		   return -999;
	   }
	   if(last.getNext()==last) {
		   int d = last.getData();
		   last.setNext(null);
		   last=null;
		   return d;
	   }
	   
	   int d = last.getNext().getData();
	   last.setNext(last.getNext().getNext());
	   
	return d;
   }
   
   public int delete_Last() {
	   if(last==null) {
		   System.out.println("LL is Empty");
		   return -999;
	   }
	   if(last.getNext() == last) {
		   int d = last.getData();
		   last.setNext(null);
		   last=null;
		   return d;
		 
	   }
	   IntNode itr = last;
	   do {
		   itr=itr.getNext();
		   
	   }while(itr.getNext() != null);
	   
	   itr.setNext(null);
	   last.setNext(null);
	       int d=itr.getData();
	       last=itr;
	       return d;
   }
   
   public void display() {
	   if(last==null) {
		   System.out.println("Empty LL");
	   }
	   IntNode itr = last;
	   while(true) {
		   System.out.println(itr.getData()+" ");
		   
		   if(itr==last.getNext()) return;
		   itr=itr.getNext();
		   
	   }
   }
   
   public void insert_by_pos(int d,int pos) {
	   IntNode NN = new IntNode(d);
	   if(last==null) {
		   System.out.println("LL is Empty Inserted at Position First");
		  last=NN;
		  NN.setNext(last);
		  return;
	   }
	   if(pos==1) {
		   NN.setNext(last);
		   last=NN;
		   return;
	   }
	   IntNode itr = last.getNext();
	   
	 int i=1;
	 while(itr != last && i<pos) {
		 i++;
		 itr=itr.getNext();
	 }
	 NN.setNext(itr.getNext());
	   itr.setNext(NN);
	 if(itr==last)
	 {
		 last=NN;
	 }
	   
   }
   
   public int delete_by_pos(int pos) {
	   int d=-999;
	   if(last==null) {
		   System.out.println("Empty LL");
		   return d;
	   }
	   if(last.getNext()==null) {
		   d = last.getData();
		   last=null;
	   return d;
	   }
	   
	   IntNode itr = last.getNext();
	   
	   for(int i=1; itr!=last && i<pos; itr.getNext(), i++);
	   
	   d=itr.getData();
	   itr.setNext(itr.getNext());
	   
	   
	   
	   return d;
	   
   }
	

}
