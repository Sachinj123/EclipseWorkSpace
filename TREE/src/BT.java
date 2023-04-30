import org.w3c.dom.Node;

public class BT {
	
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		
		 Node(int d) {
			data =d;
			left = null;
			right = null;
			
		}
	}
	
	public BT(int d) {
		root = new Node(d);
	}
	
	// GENERATE PREORDER METHOD
	// ROOT->LC->RC
	void  printPreOrder(Node n) {
		if (n == null)
			return;
		System.out.println(n.data);
		printPreOrder(n.left);
		printPreOrder(n.right);
	}
	
	// APPLY INORDER
	// LC->ROOT->RC
	void  printInOrder(Node n) {
		if (n == null)
			return;
		printInOrder(n.left);
		System.out.println(n.data);
		printInOrder(n.right);
		
	}
	// APPLY POSTORDER
	// LC->RC->ROOT
	void printPostOrder(Node n) {
		if (n == null)
			return;
		printPostOrder(n.left);
		printPostOrder(n.right);
		System.out.println(n.data);
		
	}
	
	void preorder() {
		printPreOrder(root);
	}
	void inorder() {
		printInOrder(root);
	}
	void postorder() {
		printPostOrder(root);
	}


    public static void main(String[] args) {
    	BT b2= new BT(10);
    	b2.root = new Node(10);
    	b2.root.left= new Node(20);
    	b2.root.right = new Node (30);
    	b2.root.left.left= new Node(40);
    	b2.root.left.right = new Node (50);
    	b2.root.right.right = new Node (60);
    	b2.root.right.left = new Node (70);
    	b2.root.left.right.left = new Node(80);
    	System.out.println("PREORDER :->");
    	b2.preorder();
    	System.out.println("INORDER :->");
    	b2.inorder();
    	System.out.println("POSTORDER :->");
    	b2.postorder();
		

	}

}
