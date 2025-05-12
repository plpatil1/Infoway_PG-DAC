package practiceSet1;

public class BookLL {
private Book head;

public BookLL() {
	head=null;
}

public void setHead(Book b) {
	head=b;
}
public Book getHead() {
	return head;
}

public void insertFirst(int rn, String bn, String An, int pr, String pn) {
	Book NN = new Book(rn,bn,An, pr, pn);
	if(head==null) {
		head=NN;
		return;
	}
	NN.setNext(head);
	head=NN;
	return;
}
public void insertLast(int rn, String bn, String An, int pr, String pn) {
	Book NN = new Book(rn,bn,An, pr, pn);
	if(head==null) {
		head=NN;
		return;
	}
	Book itr = head;
	
	while(itr.getNext()!=null) {
		itr=itr.getNext();
	}
	itr.setNext(NN);
	return;
}
public int deleteFirst() {
	if(head==null) {
		System.out.println("LL is Empty");
		return -1;
	}
	Book ans = head;
	head=null;
	head=ans.getNext();
	return ans.getSrno();
}

public int deleteLast() {
	if(head==null) {
		System.out.println("LL is Empty");
		return -1;
	}
	Book itr = head;
	while(itr.getNext().getNext()!=null) {
		itr=itr.getNext();
	}
	int d = itr.getNext().getSrno();
	itr.setNext(null);
	return d;
}
 
 public void display() {
	 if(head==null) {
		 System.out.println("Empty LL");
		 return;
	 }
	 Book itr=head;
	 while(itr!=null) {
		 System.out.println(itr);
		 itr=itr.getNext();
	 }
	 return;
	 
 }
 public void displayr() {
	 display_Rec(head);
	 return;
 }
 public static void display_Rec(Book head) {
	 if(head==null) {
		 return;
	 }
	 System.out.println(head);
	 display_Rec(head.getNext());
	 return;
	 
 }

}
