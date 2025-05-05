package LinkedList;

public class DoublyLL {
  private DLL head;

  public DoublyLL() {
		this.head = null;
	}

public DLL getHead() {
	return head;
}

public void setHead(DLL head) {
	this.head = head;
}

public void display() {
	
	if(head == null) {
		System.out.println("Empty LL");
		return;
	}
	
	
	DLL itr = head;
	
	do {
		 
			System.out.print("-- > "+itr.getData()+" ");
			itr=itr.getNext();
		
	}while(itr!=null);
	return;
}

public void insert_First(int d) {
	DLL NN = new DLL(d);
	if(head==null) {
		head=NN;
		return;
	}
	
	NN.setNext(head);
	head.setPrev(NN);
	head=NN;
	return;
	
}

public void insert_Last(int d) {
	DLL NN = new DLL(d);
	if(head==null) {
		head=NN;
		return;
	}
	DLL itr = head;
	
	while(itr.getNext()!=null) {
		itr=itr.getNext();
	}
	itr.setNext(NN);
	NN.setPrev(itr);
	return;
	
	
}

public int delete_Last() {
	int d = -999;
	if(head==null) {
		System.out.println("Empty LL");
		return d;
	}
	if(head.getNext()==null) {
		d=head.getData();
		head=null;
		return d;
	}
	
	DLL itr = head;
	while(itr.getNext()!=null) {
		itr=itr.getNext();
	}
	d=itr.getData();
	itr=itr.getPrev();
	itr.setPrev(null);
	itr.setNext(null);
	return d;
}

public int delete_First() {
	int d = -999;
	if(head==null) {
		System.out.println("Empty LL");
		return d;
	}
	
	d=head.getData();
	head=head.getNext();
	head.getPrev().setNext(null);
	head.setPrev(null);
	head.getPrev();
	return d;
	
}

public void insert_by_pos(int d, int pos) {
	DLL NN = new DLL(d);
	if(head==null) {
		System.out.println("LL is Empty Inserted at First Position");
		head=NN;
		return;
	}
	
	if(pos==1) {
		head.setPrev(NN);
		NN.setNext(head);
	      head=NN;
	      return;
	}
	
	DLL itr = head;
	
	while(itr!=null && i<pos) {
		
	}
}
  
}
