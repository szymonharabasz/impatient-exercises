package com.szymonharabasz.exercises.ch04.ex09;

public class CircularList {

	public void add(Object o) {
		Node node = new Node(o);
		if (seed == null) {
			seed = node;
		} else {
			Node n = seed;
			while (n.next != seed) {
				n = n.next;
			}
		}
		node.next = seed;
	}
	
	public void remove(Object o) {
		Node n = seed;
		while (n.next != o) {
			n = n.next;
		}
		n.next = n.next.next;
	}
	
	public CircularListIterator iterator() {
		return new CircularListIterator(this);
	}
	
	protected static class Node {
		private Node(Object val) { this.val = val; }
		Object val;
		Node next;
	}
	protected Node seed;
}
