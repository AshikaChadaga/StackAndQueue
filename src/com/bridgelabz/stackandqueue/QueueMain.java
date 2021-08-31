package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.MyNode;

public class QueueMain {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome To Data Structure : Queue -----");

		Queue QueueList = new Queue();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		QueueList.enqueue(firstNode);
		QueueList.enqueue(secondNode);
		QueueList.enqueue(thirdNode);
		QueueList.printQueue();

	}

}
