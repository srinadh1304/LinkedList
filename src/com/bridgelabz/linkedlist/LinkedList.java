package com.bridgelabz.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<Integer>();
		sortedLinkedList.add(firstNode);
		sortedLinkedList.add(secondNode);
		sortedLinkedList.add(thirdNode);
		System.out.println("Created a linked list :");
		sortedLinkedList.printMyNodes();

	}
}
