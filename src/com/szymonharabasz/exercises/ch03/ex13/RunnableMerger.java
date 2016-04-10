package com.szymonharabasz.exercises.ch03.ex13;

public class RunnableMerger {
	Runnable merge(Runnable... runnables) {
		return () -> { 
			for (Runnable r : runnables) { 
				r.run(); 
				} 
			};
	}
}
