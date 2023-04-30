package com.sachin;
public class RecReverse {

		private Node head;
		private Node tail;
		private int size;
		
		public RecReverse () {
			this.size=0;
		}
		// Add First
		public void insertFirst(int val) {
			// create new node
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
			if (tail == null)
			{
				tail = head;
			}
		}
		//Add Last 
		public void insertLast(int val) {
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
		// Reverse Linked List Using Recursion  
		public Node recReverse(Node h) {
			if (h.next == null)
			{
				head = h;
				return h;
			}
			Node t = recReverse (h.next);
			t.next=h;
			h.next=null;
			return h;
		}
		public void recReverse () {
			recReverse (head);
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

