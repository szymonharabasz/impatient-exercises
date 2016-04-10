package com.szymonharabasz.exercises.ch02.ex16;

public class Queue {
	
	public void add(Object o) {
		Node node = new Node(o);
		if (last != null) {
			last.next = node;
		}
		else { // queue is empty
			first = node;
		}
		last = node;
	}
	
	public Object remove() {
		if (first == null) { return null; }
		Object value = first.val;
		first = first.next;
		if (first == null) { last = null; }
		return value;
	}
	
	public QueueIterator iterator() {
		return new QueueIterator(this);
	}
	
	protected static class Node {
		private Node(Object val) { this.val = val; }
		Object val;
		Node next;
	}
	protected Node first;
	protected Node last;
}
