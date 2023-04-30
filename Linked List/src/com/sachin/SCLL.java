 package com.sachin;

public class SCLL {
	private Node head;
	private Node tail;
	private int size;
	public SCLL() 
	{
		this.size=0;
		
	}
	public void insertFirst(int val) {
		// create new node 
		Node newNode = new Node (val);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		}
		// traverse till last node
		else {
		Node temp = head;
		while (temp.next != head) {
			temp=temp.next;
		}
		// new nodes next pointed to head
		newNode.next = head;
		// Last nodes next part pointed to newnode
		temp.next = newNode;
		// make head pointed to new node
		head = newNode;
		}
	}
	
	public void insertLast(int val) {
		// create new node 
		Node newNode = new Node (val);
		if (head == null) {
			//head = newNode;
			//newNode.next = head;
			insertFirst(val);
		}
		// traverse till last node
		else {
		Node temp = head;
		while (temp.next != head) {
			temp=temp.next;
		}
		// new nodes next pointed to head
		newNode.next = head;
		// Last nodes next part pointed to newnode
		temp.next = newNode;
		}
	}
	
	public void display() {
		System.out.println("List :");
		if (head == null)
			return ;
		Node temp = head;
		do {
			System.out.print(temp.value +"->");
			temp = temp.next;
		}while (temp!=head);
		
		
	}
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		public Node(int value ,Node next) {
			this.value=value;
			this.next = next;
		}
		
	}
}
