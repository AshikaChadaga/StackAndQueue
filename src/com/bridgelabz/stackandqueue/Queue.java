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
		return queueLinkedList.deleteFirst();
	}
	
	
	public boolean isEmpty() {
		if(queueLinkedList.head != null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public int size() {
		return queueLinkedList.size();
	}
	
	
	public void printQueue() {
		queueLinkedList.printLinkedList();
	}
}
