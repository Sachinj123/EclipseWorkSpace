package com.sachin;

import org.w3c.dom.Node;

public class LL1 {
	private Node head;
	private int size;
	
	public LL1() {
		this.size=0;
	}
	
	
	// INSERT FIRST IN LL
	public void insertFirst(int val) {
		// NEW NODE CREATION
		Node newNode = new Node (val);
		// NEW NODE POINTED TO HEAD
		newNode.next = head;
		// HEAD SHOULD POINTED TO NEW NODE
		head = newNode;
	}
	
	public void insertLast(int val) {
		if (head == null) {
			insertFirst(val);
		}
		else {
			// NEW NODE CREATION
			Node newNode = new Node (val);
			// TRAVERSE TILL LAST NODE
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void insertAtIndex(int val,int index) {
		if( head == null)
		{
			insertFirst(val);
		}
		else {
			// NEW NODE CREATION 
			Node newNode = new Node (val);
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void deleteFirst(int val) {
		if(head==null)
			throw new RuntimeException("List is empty.");
		head = head.next;
	}
	
	public void deleteLast() {
		if (head ==null) {
			throw new RuntimeException("List is empty.");
		}
		if(head.next == null)
			head = null;
		else {
			Node trav = null;
			Node temp = head;
			while(temp.next!=null) {
				trav = temp;
				temp=temp.next;
			
		}
			trav.next=null;
		
		}
	}
	
	public void display() {
		Node temp =head;
		while(temp!=null)
		{
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
			
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
}
	


