package com.szymonharabasz.exercises.ch02.ex16;

import java.util.Iterator;

import com.szymonharabasz.exercises.ch02.ex16.Queue.Node;

public class QueueIterator implements Iterator<Object> {

	/**
	 * 
	 */
	private final Queue queue;

	public QueueIterator(Queue queue) {
		this.queue = queue;
		next = this.queue.first;
	}
	
	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public Object next() {
		Object val = next.val;
		next = next.next;
		return val;
	}
	
	private Node next;

}