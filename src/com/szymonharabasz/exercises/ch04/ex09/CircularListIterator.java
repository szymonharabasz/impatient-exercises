package com.szymonharabasz.exercises.ch04.ex09;

import java.util.Iterator;

import com.szymonharabasz.exercises.ch04.ex09.CircularList.Node;

public class CircularListIterator implements Iterator<Object> {

	/**
	 * 
	 */
	private final CircularList list;

	public CircularListIterator(CircularList list) {
		this.list = list;
		next = this.list.seed;
	}
	
	@Override
	public boolean hasNext() {
		return next != list.seed;
	}

	@Override
	public Object next() {
		Object val = next.val;
		next = next.next;
		return val;
	}
	
	private Node next;

}