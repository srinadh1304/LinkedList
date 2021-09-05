package com.bridgelabz.linkedlist;

public class MyLinkedList {
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
		
	}
	public void add(INode newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}

		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
			
		}
	}
	
	public void append(INode newNode)
	{
		
		if(this.head==null)
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}

		else
		{
			this.tail.setNext(newNode);
			this.tail = newNode;
			
			
		}
	}
	public void insert(INode prevNode , INode newNode) {
		INode tempNode = prevNode.getNext();
		prevNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public void printMyNodes() {
		INode tempNode = this.head;
		while(tempNode != null) {
			System.out.print(tempNode.getKey()+" -> ");
			tempNode = tempNode.getNext();
		}
		System.out.println("null");
	}

}
