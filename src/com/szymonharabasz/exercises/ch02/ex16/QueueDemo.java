package com.szymonharabasz.exercises.ch02.ex16;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(3);
		q.add(5);
		System.out.println(q.remove());
		q.add(7);
		q.add(9);
		q.add(8);
		QueueIterator it1 = q.iterator();
		while (it1.hasNext()) {
			System.out.println(" -> " + it1.next());
		}
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.add(10);
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.add(12);
		q.add(14);
		QueueIterator it2 = q.iterator();
		while (it2.hasNext()) {
			System.out.println(" -> " + it2.next());
		}
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

	}
	
}
