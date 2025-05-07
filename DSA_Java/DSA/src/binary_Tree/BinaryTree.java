package binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
private BTNode root;

public BinaryTree() {
	root=null;
}


public void setRoot(BTNode r) {
	root=r;
}
public BTNode getRoot() {
	return root;
}
public void preOrder() {
	visit_preOrder(root);
}
private void visit_preOrder(BTNode root) {
	if(root==null) {
		return;
		
	}
	System.out.println(root.getData());
	visit_preOrder(root.getLeft());
	visit_preOrder(root.getRight());
	return;
}

public void inOrder() {
	visit_inOrder(root);
}
private void visit_inOrder(BTNode root) {
	if(root==null) {
		return;
	}
	
	visit_inOrder(root.getLeft());
	System.out.println(root.getData());
	visit_inOrder(root.getRight());
	return;
}

public void post_Order() {
	visit_postOrder(root);
	return;
}
private void visit_postOrder(BTNode root) {
	if(root==null) {
		return;
	}
	
	visit_postOrder(root.getLeft());
	visit_postOrder(root.getRight());
	System.out.println(root.getRight());
	return;
}

public void insert_Levelwise(int d) {
	BTNode NN = new BTNode(d);
	
	if(root==null) { root=NN; return;  }
	
	BTNode itr;
	Queue<BTNode> q = new LinkedList<BTNode>();
	q.add(root);
	while(true) {
		itr=q.remove();
		if(itr.getLeft()==null) {
			itr.setLast(NN);
			return;
			} else 
				{
				q.add(itr.getLeft());
				}
		
		if(itr.getRight()==null) {
		 	itr.setRight(NN);
		 	return;
		        } else {
		            	q.add(itr.getRight());
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

public int calHeight() {
	if(root==null) {
		return 0;
	}
	BTNode d=new BTNode(-987);
	BTNode itr;
	int cnt=0;
	
	Queue<BTNode> q = new LinkedList<BTNode>();
	
	q.add(root);
	q.add(d);
	
	while(!q.isEmpty()) {
		itr = q.remove();
		if(itr==d) {
			cnt=cnt+1;
			q.add(d);
			itr=q.remove();
			
		}
		if(itr.getLeft() != null) {
			q.add(itr.getLeft());
		}
		if(itr.getRight()!= null) {
			q.add(itr.getRight());
		}
	}
	
	return cnt;
}



	
public static boolean isIdentical(BinaryTree bt1, BinaryTree bt2) {
	
	
	
	if(bt1.getRoot()==null || bt2.getRoot()==null) {
		return false;
	}
	Queue<BTNode> q1 = new LinkedList<BTNode>();
	Queue<BTNode> q2 = new LinkedList<BTNode>();
	BTNode itr1,itr2;
	q1.add(bt1.getRoot());
	q2.add(bt2.getRoot());
	
	while((!q1.isEmpty())&&(!q2.isEmpty())) {
		itr1=q1.remove();
		itr2=q2.remove();
		
		if(itr1.getData() != itr2.getData()) {
			return false;
		}
		
		if(itr1.getLeft()!=null) {
			q1.add(itr1.getLeft());
		}
		if(itr1.getRight() != null) {
			q1.add(itr1.getRight());
		}
		if(itr2.getLeft() != null) {
			q2.add(itr2.getLeft());
		}
		if(itr2.getRight() != null) {
			q2.add(itr2.getRight());
		}
		
	}
	if(q1.isEmpty() && q2.isEmpty()) {
		return true;
	}
	else {
		return false;
	}
}

Here's your modified mirrorImage() method with TreeNode replaced by BTNode as per your requirement:

public void mirrorImage() 
{
    if (root == null) 
    {
        return;
    }

    Queue<BTNode> q = new LinkedList<BTNode>();
    q.add(root);

    while (!q.isEmpty()) 
    {
        BTNode curr = q.remove();

        // Swap left and right children
        BTNode temp = curr.getLeft();
        curr.setLeft(curr.getRight());
        curr.setRight(temp);

        if (curr.getLeft() != null) 
        {
            q.add(curr.getLeft());
        }

        if (curr.getRight() != null) 
        {
            q.add(curr.getRight());
        }
    }
}

	
public void mirrorImage() 
{
    if (root == null) 
    {
        return;
    }

    Queue<BTNode> q = new LinkedList<BTNode>();
    q.add(root);

    while (!q.isEmpty()) 
    {
        BTNode curr = q.remove();

        // Swap left and right children
        BTNode temp = curr.getLeft();
        curr.setLeft(curr.getRight());
        curr.setRight(temp);

        if (curr.getLeft() != null) 
        {
            q.add(curr.getLeft());
        }

        if (curr.getRight() != null) 
        {
            q.add(curr.getRight());
        }
    }
}	

}
