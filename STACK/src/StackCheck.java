

public class StackCheck {
	private Node head;
	private int size;
	
	public StackCheck () {
		this.size=0;
	}
	// PUSH OPERATION (In Stack PUSH means AddFirst Operation of Linked List)
	public void PUSH(int val) {
		// create new node
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		
	}
	
	// POP OPERATION (In Stack POP means Delete First Operation of Linked List)
	public void POP() {
		if(head == null) {
			throw new RuntimeException("List is empty.");
			}
		head = head.next;
		
	}
	public void isEmpty() {
		if(head == null) {
			throw new RuntimeException("List is empty.");
			}

	}
	// PEEK OPERATION RETURNS HEAD VALUE 
	public int PEEK() {
		return head.value;
		
	}
	public void display ()
	{
		Node temp = head;
		while (temp!=null)
		{
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node (int value) {
			this.value=value;
		}
		public Node (int value,Node next)
		{
			this.value=value;
			this.next =next;
		}
	}
	


}
