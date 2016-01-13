package linkedlist;

import java.util.Stack;
import java.util.StringJoiner;

class Node {
	private char value;
	private Node right;
	
	private Node() {}
	
	public static Node getInstance() {
		return new Node();
	}
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}

public class SingleLinkedList {
	public static void main(String[] args) {
		Node head = create();
		System.out.println("Original List is -");
		print(head);
		
		System.out.println("\nAfter reverse");
		Node newHead = reverseUsingStack(head);
		print(newHead);

		// Creating the list again just for the sake of demo
		Node headAgain = create();
		System.out.println("\nOriginal List is -");
		print(headAgain);
		
		System.out.println("\nAfter reverse (Optimized)");
		Node newHeadOptimized = reverseOptimized(headAgain);
		print(newHeadOptimized);
	}

	private static Node reverseOptimized(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while (current != null) {
			next = current.getRight();
			current.setRight(prev);
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	private static Node reverseUsingStack(final Node head) {
		final Stack<Node> stack = new Stack<Node>();
		
		Node node = head;
		while(node != null)  {
			stack.push(node);
			node = node.getRight();
		}
		
		Node temp = null;
		Node newHead = null;
		Node counter = newHead;
		while (!stack.empty()) {
			temp = stack.pop();
			temp.setRight(null);
			if (newHead == null) {
				newHead = temp;
				counter = newHead;
			} else {	
				while(counter.getRight() != null) 
					counter = counter.getRight();
				counter.setRight(temp);
			}
		} 
		return newHead;
	}

	private static void print(final Node head) {
		if(null == head) 
			return;
		final StringJoiner joiner = new StringJoiner("->");
		Node node = head;
		do {
			joiner.add(""+ node.getValue());
			node = node.getRight();
		}while(node != null);
		System.out.println(joiner);
	}

	private static Node create() {
		Node n1 = Node.getInstance();
		n1.setValue('A');
		
		Node n2 = Node.getInstance();
		n2.setValue('B');
		
		Node n3 = Node.getInstance();
		n3.setValue('C');
		
		Node n4 = Node.getInstance();
		n4.setValue('D');
		
		n1.setRight(n2);
		n2.setRight(n3);
		n3.setRight(n4);
		n4.setRight(null);
		
		return n1;
	}
}
