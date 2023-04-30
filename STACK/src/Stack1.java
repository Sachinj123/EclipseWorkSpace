
public class Stack1 {
	private Node head;
	private Node tail;
	private int size;
	//public Node top;
	
	public Stack1 () {
		this.size=0;
		//this.top=null;
	}
	//PUSH OPERATION IN STACK IS ADDFIRST OPERATION OF LINKED LIST
	
	public void PUSH(int val) {
		// NEW NODE CREATION
		Node newNode = new Node (val);
		// NEW NODE SHOULD POINTED TO HEAD
		newNode.next = head;
		// HEAD SHOULD POINTED TO NEW NODE
		head = newNode;
		
	}
	
// POP OPERATION IS DELETEFIRST OPERATION OF LINKED LIST
	
	public void POP () {
		// if list is empty
		if (head == null)
		{
			throw new RuntimeException("list is Empty");
		}
		// HEAD SHOULD PONTED TO NEXT NODE 
		head = head.next;
	}
	
	// isEMPTY OPERATION IS PERFORMED TO CHECK THE LINKED LIST IS EMPTY
	/*public void isEmpty() {
		if (head == null) {
			throw new RuntimeException("list is Empty");
		}
	}*/
	
	 public boolean isEmpty() { return head == null; }
	
	public int PEEK () {
		if (head == null) {
			throw new RuntimeException("list is Empty");
		}
		else {
		return head.value;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value +"->");
			temp = temp.next;
		}
		System.out.println("END");
		
	}
	
	private class Node {
		private int value;
		private Node next;
	
	
	public Node(int value) {
		this.value = value;
	}
	public Node (int value,Node next) {
		this.value=value;
		this.next = next;
	}
		
	}
}
	


