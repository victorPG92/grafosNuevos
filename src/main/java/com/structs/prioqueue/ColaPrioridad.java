package com.structs.prioqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public interface ColaPrioridad<T>
{

	//PriorityQueue<T> colaPrioridad= new PriorityQueue<T>();
	//List<T> lista= new LinkedList<T>();
	
	
	public void add(T elem);
	
	public T consultaPrimer();
	
	public T quitaPrimer();
	
}
