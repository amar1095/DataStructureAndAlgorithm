package datastructure.LinkedList;

public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public void appendNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}

	}

}
