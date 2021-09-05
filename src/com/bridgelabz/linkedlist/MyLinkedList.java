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
	
	public INode pop(){
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}
	public INode popLast(){
		INode tempNode = this.tail;
		this.tail = null;
		return tempNode;
	}
	
	public INode search(INode key) {
		int position = 0;
		INode tempNode = this.head;
		while(tempNode != null) {
			if(tempNode.getKey() == key.getKey()) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	public void searchAndInsert(INode previousNode, INode nodeToBeInserted) {
		INode tempNode = search(previousNode);
		insert(tempNode, nodeToBeInserted);
	}
	
	public int getSize() {
		int count = 0;
		INode tempNode = this.head;
		while(tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}
	
	public INode deleteNode(INode nodeToBeDeleted)
	{
		INode tempNode=this.head;
		while(tempNode.getNext() != null) {
			if(tempNode.getNext().getKey() == nodeToBeDeleted.getKey()) {
				INode deletedNode = tempNode.getNext();
				tempNode.setNext(deletedNode.getNext());
				return deletedNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
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
