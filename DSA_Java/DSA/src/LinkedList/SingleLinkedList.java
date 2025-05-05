package LinkedList;

public class SingleLinkedList {
	
	private IntNode head;
	
	public SingleLinkedList()
	{
		head=null;
	}
	
	
		public void InsertFirst(int d)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head=new_node;
				return;
			}
			else
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
		}
		
		public void InsertLast(int d)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
			}
			
			IntNode iter = head;
			
			while( iter.getNext() != null)
			{
				iter = iter.getNext();
			}
			
			iter.setNext(new_node);
			return;
		}
		
		public int DeleteFirst()
		{
			int d = -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty....");
				return d;
			}
			else
			{
				d = head.getData();
				head = head.getNext();
				return d;
			}
		}
		
		public int DeleteLast()
		{
			int d = -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty....");
				return d;
			}
			
			if(head.getNext() == null)
			{
				d = head.getData();
				head = null;
				return d;
			}
			
			IntNode iter = head;
			
			while(iter.getNext().getNext() != null)
			{
				iter = iter.getNext();
			}
			
				d = iter.getNext().getData();
				IntNode  deletable = iter.getNext();
				
				iter.setNext(null);
				deletable = null;
				return d;
			
		}
		
		public void Insert_By_Pos(int d, int pos)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			if(pos == 1)
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			int i;
			for(i = 1; i < ( pos-1 ) && (iter.getNext() != null); i++ )
			{
				iter = iter.getNext();
			}
			
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			
			return;
			
			
		}
		
		public int Delete_By_Pos(int pos)
		{
			int d= -999;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty...");
				return d;
			}
			if(pos == 1)
			{
				d=head.getData();
				
				head = head.getNext();
				return d;
			}
			
			IntNode iter = head;
			int i;
			
			for(i=1; i < (pos -1) && (iter.getNext() != null); i++)
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() != null)
			{
				d = iter.getNext().getData();
				iter.setNext(iter.getNext().getNext());
			}
			return d;
			
		}
		
		public void Insert_Before_Data(int d, int key)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			if(head.getData()==key)
			{
				new_node.setNext(head);
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			
			while( (iter.getNext() != null) && (iter.getNext().getData() != key) )
			{
				iter = iter.getNext();
			}
			
			if(iter.getNext() == null)
			{
				System.out.println("Invalid key... Insertion Not Possible...");
				return;
			}
			else
			{
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
			
			
		}
		
		public void Insert_After_Data(int d, int key)
		{
			IntNode new_node = new IntNode(d);
			
			if(head == null)
			{
				head = new_node;
				return;
			}
			
			IntNode iter = head;
			
			while((iter != null) && (iter.getData() != key))
			{
				iter = iter.getNext();
				
			}
			
			if(iter == null)
			{
				System.out.println("Invalid key... Insertion Not Possible...");
				return;
			}
			else
			{
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
		}
	
	
		
		public void Display()
		{
			//int cnt = 0;
			
			IntNode iter = head;
			int i;
			
			if(head == null)
			{
				System.out.println("Singly Linked List is Empty...");
			}
			
			System.out.print("List => ");
			while(iter!= null)
			{
				System.out.print(iter.getData() + " -> ");
				
				iter = iter.getNext();
			}
		}
	
		
		
		public void insert_sorted(int d) {
			IntNode NN = new IntNode(d);
			
			if((head==null) || (head.getData()>d)) {
				NN.setNext(head);
				head=NN;
				return;
			}
			
			IntNode itr = head;
			
			while((itr.getNext() != null) && ((itr.getNext().getData())<d)) {
				itr = itr.getNext();
			}
			
			NN.setNext(itr.getNext());
			itr.setNext(NN);
			return;
			
		}
	
	
	public SingleLinkedList concatLL(SingleLinkedList ll1) {
		SingleLinkedList res = new SingleLinkedList();
		IntNode itr = head;
		while(itr.getNext() != null) {
			res.InsertFirst(itr.getData());
			itr=itr.getNext();
		}
		res.InsertFirst(itr.getData());
		
		itr = ll1.head;
		while(itr != null) {
			res.InsertLast(itr.getData());
			itr= itr.getNext();
		}
		return res;
		
	}
	
	  
	
	
	
	

}
