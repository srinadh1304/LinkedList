package com.bridgelabz.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode,secondNode);

		System.out.println("Created a linked list :");
		myLinkedList.printMyNodes();
		if(myLinkedList.search(secondNode)!=-1)
			System.out.println("Element found at position: "+myLinkedList.search(secondNode));
		else
			System.out.println("Element not found");
	}
}
