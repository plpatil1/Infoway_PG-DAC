package LinkedList;

public class DLL {
	private int data;
	private DLL prev, next;
	
	public DLL() {
		prev=null;
		data=0;
		next=null;
	}

	public DLL(int data) {
		
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLL getPrev() {
		return prev;
	}

	public void setPrev(DLL prev) {
		this.prev = prev;
	}

	public DLL getNext() {
		return next;
	}

	public void setNext(DLL next) {
		this.next = next;
	}
	
	

}
