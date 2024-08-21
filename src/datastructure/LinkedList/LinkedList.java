package datastructure.LinkedList;

public class LinkedList {
	Node head;
	int length;

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

	// append node
	public void appendNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			length++;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			length++;
		}

	}

	// print linkedList
	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("  legth of linkedList " + length);

	}

	// insert new node at begining
	public void insertNewNodeAtBegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		length++;

	}

	// insert new node at end
	public void insertNewNodeAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			length++;
		}
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		length++;

	}

	// insert new Node at Middle
	public void insertNewNodeatMiddle(int data) {
		Node newNode = new Node(data);
		int middle = length / 2;
		Node temp = head;
		int startIndex = 1;
		while (temp != null && startIndex < middle) {
			startIndex++;
			temp = temp.next;
		}
		Node after = temp.next;

		temp.next = newNode;
		newNode.next = after;
		length++;

	}

}
