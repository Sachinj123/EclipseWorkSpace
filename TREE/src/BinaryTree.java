
public class BinaryTree {
	Node root;
	 static class Node{
		int data;
		Node left;
		Node right;
	
	Node (int d){
		data = d;
		left = null;
		right = null;
	  }
	
	}
	BinaryTree (int d){
		root = new Node (d);
	}
	void printInOrder (Node n) {
		if (n == null)
			return;
		printInOrder (n.left);
		System.out.println(n.data);
		printInOrder (n.right);
		
	}
	
	void printPreOrder (Node n) {
		if (n == null)
			return;
		System.out.println(n.data);
		printPreOrder (n.left);
		printPreOrder (n.right);
		
	}
	
	void printPostOrder (Node n) {
		if (n == null)
			return;
		printPostOrder (n.left);
		printPostOrder (n.right);
		System.out.println(n.data);
		
	}
	
	void preorder() {
		printPreOrder(root) ;
	}
	
	void inorder() {
		printInOrder(root);
	}
	
	void postorder() {
		printPostOrder(root);
	}

	public static void main(String[] args) {
		
		BinaryTree b1 = new BinaryTree(11);
		b1.root=new Node (11);
		b1.root.left=new Node (22);
		b1.root.right=new Node (33);
		b1.root.left.left=new Node (44);
		b1.root.left.right=new Node (55);
		b1.root.right.right=new Node (66);
		System.out.println("PreOrder :");
		b1.preorder();
		System.out.println("InOrder :");
		b1.inorder();
		System.out.println("PostOrder :");
		b1.postorder();
		
		}
}



