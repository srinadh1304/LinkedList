package com.bridgelabz.linkedlist;
public class SortedLinkedList<K extends Comparable<K>>{
	INode<K> head;
	INode<K> tail;
	public SortedLinkedList() {
		head = null;
		tail = null;
	}


	public void add(INode<K> newNode) {
		K newNodeKey = newNode.getKey();
		if(head == null) {
			head = newNode;
		}
		else if(head.getKey().compareTo(newNodeKey)>=0) {
			newNode.setNext(head);
			head = newNode;
		}
		else {
			INode<K> previousNode = head;
			INode<K> currentNode = head.getNext();
			while((currentNode != tail) && (currentNode.getKey().compareTo(newNodeKey)<=0)) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(newNode);

		}
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