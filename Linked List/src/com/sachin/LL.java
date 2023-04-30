package com.sachin;

import org.w3c.dom.Node;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	public LL () {
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
			insertFirst(val);
		}
		else {
			Node temp = head;
			while (temp.next!=null) {
				temp= temp.next;
			}
			temp.next =newNode;
		}
	}
	// Insert at any position
	public void insert (int val,int index) {
		if (head == null ) {
			insertFirst(val);
		}
		else {
		Node newNode = new Node (val);
		Node temp = head;
		for (int i=1;i<index;i++) {
			temp=temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		}
	}
	//public int deleteFirst() {
		// int val = head.value;
		// head = head.next;
		// if (head == null) {
		//	tail = null;
		//}
		 //   size --;
		//	return val;
		
		
	//}
	public void deleteFirst() {
		if(head == null) {
			throw new RuntimeException("List is empty.");
			}
		head = head.next;
		
	}
	public void deleteLast() {
		// special 1: if list is empty, throw exception
				if(head == null)
					throw new RuntimeException("List is empty.");
				// special 2: if list has single node, make head null.
				if(head.next == null)
					head = null;
				else {
					// general: delete the last node
					Node trav=null, temp=head;
					// traverse till last node (trav) and run temp behind it
					while(temp.next != null) {
						trav = temp;
						temp = temp.next;
					}
					// when last node (temp) is deleted, second last node (trav) next should be null.
					trav.next = null;
					// last node (temp) will be garbage collected.
				}	
	}
	public void reverse() {
		Node oldhead = head;
		head = null;
		while (oldhead!=null) {
			//Delete first (temp) from old Linked list
			Node temp = oldhead;
			oldhead = oldhead.next;
			// Add First in New Linked list
			temp.next = head;
			head = temp;
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
	// Finding middle element from linked list 
	public int findMid() {
		Node Fast = head, Slow = head;
		while(Fast != null && Fast.next != null) {
			Slow = Slow.next;
			Fast = Fast.next.next;
			}
		return Slow.value;
		
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
