

public class QueueCheck {
	private Node head;
	// private Node tail;
	private int size;
	
	public QueueCheck () {
		this.size=0;
	}
	
	
	// PUSH OPERATION (In Queue PUSH = ADDLAST operation of Linked List )
	
	public void PUSH(int val) {
		// create new node & init it
		Node newNode = new Node (val);
		if (head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while (temp.next!=null) {
				temp= temp.next;
			}
			temp.next =newNode;
			
		}
	}
		
		// POP OPERATION (In Queue POP = DeleteFirst operation of Linked List)
	
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
