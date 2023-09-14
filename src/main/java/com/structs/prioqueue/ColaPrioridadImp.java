package com.structs.prioqueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ColaPrioridadImp<T> implements ColaPrioridad<T>
{

	List<T> lista = new LinkedList<T>();
	private Comparator<? super T> comp;
	
	
	public void add(T elem)
	{
		lista.add(elem);
		lista.sort(comp);
		
	}

	public T consultaPrimer()
	{
		
		return lista.get(0);
	}

	public T quitaPrimer()
	{
		return lista.remove(0);
	}

	
}
