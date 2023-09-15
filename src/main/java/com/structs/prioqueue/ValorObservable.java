package com.structs.prioqueue;

import java.util.ArrayList;
import java.util.List;

public  class ValorObservable<T>
{

	T valor;
	List<ObserverValor<T>> observadores = new ArrayList<ObserverValor<T>>();
	
	public void setValorYNotifica(T valorModificado)
	{
		valor= valorModificado;
		notificaTodos();
	}
	
	
	
	public T getValor()
	{
		return valor;
	}



	private void setValor(T valor)
	{
		this.valor = valor;
	}



	public void addObserver(ObserverValor observer)
	{
		observadores.add(observer);
	}
	
	public void notificaTodos()
	{
		for (ObserverValor<T> observerValor : observadores) {
			observerValor.recibeNotificacion(valor);
		}
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		return valor.equals(((ValorObservable<T>)obj).valor);
	}
}
