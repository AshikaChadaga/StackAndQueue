package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class Queue<K> {
	
	private final LinkedList queueLinkedList;
	
	public Queue() {
		queueLinkedList = new LinkedList();
	}
	
	
	public void enqueue(INode element) {
		queueLinkedList.append(element);
	}
	
	
	public INode dequeue() {
		return queueLinkedList.deleteLastNode();
	}
	
	
	public void printQueue() {
		queueLinkedList.printLinkedList();
	}
}
