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
		MyNode<Integer> fourthNode=new MyNode<Integer>(40);
		myLinkedList.searchAndInsert(secondNode, fourthNode);
		myLinkedList.printMyNodes();
		System.out.println("Deleted node: "+fourthNode.getKey());
		myLinkedList.deleteNode(fourthNode);
		System.out.println("Size of the linked list: "+myLinkedList.getSize());
		myLinkedList.printMyNodes();
	}
}
