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
	
}
