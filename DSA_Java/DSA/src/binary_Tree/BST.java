package binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	private BTNode root;

	public BST() {
		root=null;
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	
	public void insert_bst(int d) {
		BTNode NN = new BTNode(d);
		BTNode itr = root;
		
		if(root==null) {
			root=NN;
			return;
		}
		
		while(true) {
			if(d<itr.getData()) {
				if(itr.getLeft()==null) {
					itr.setLast(NN);
				} else itr=itr.getLeft();
			} else if(d>itr.getData()) {
				if(itr.getRight()==null) {
					itr.setRight(NN);
				} else itr=itr.getRight();
			}else {
				System.out.println("Duplicate Values......");
				return;
			}
		}
	}
	
	public void display() {
		if(root==null) {
			System.out.println("Empty Tree!!!!");
			return;
		}
		BTNode itr;
		
		Queue<BTNode>  q = new LinkedList<BTNode>();
		q.add(root);
	     
		while(!q.isEmpty()) {
			itr=q.remove();
			System.out.print(itr.getData()+" ");
			
			if(itr.getLeft()!=null) 	q.add(itr.getLeft());
			
			if(itr.getRight()!=null) 	q.add(itr.getRight());
			
			
		}
	}
	

}
