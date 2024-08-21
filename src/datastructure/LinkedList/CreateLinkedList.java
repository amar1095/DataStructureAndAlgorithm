package datastructure.LinkedList;

public class CreateLinkedList {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// create a linkedlist
		list.appendNode(3);
		list.appendNode(4);
		list.appendNode(5);
		list.appendNode(8);
		list.printLinkedList();

		// insert new node at begining
		list.insertNewNodeAtBegin(7);
		System.out.println();
		System.out.println("after insert new Node at begin");
		list.printLinkedList();

		// insert new node at end
		list.insertNewNodeAtEnd(12);
		System.out.println();
		System.out.println("after inser new Node at end");
		list.printLinkedList();

		// insert new node at middle
		list.insertNewNodeatMiddle(14);
		System.out.println();
		System.out.println("after insert new Node at middle");
		list.printLinkedList();

	}

}
