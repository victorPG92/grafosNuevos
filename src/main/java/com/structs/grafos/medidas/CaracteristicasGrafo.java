package com.structs.grafos.medidas;

public interface CaracteristicasGrafo<T>
{

	
	public double excentricidad(T nodo);

	public double centroDelGrafo() ;

	public boolean nodoFuertementeConexo(T nodo);
	public boolean grafoFuertementeConexo();

	public boolean isNodoAislado(T nodo);

	public boolean isNodoSumidero(T nodo);

	public boolean isNodoFuente(T nodo) ;
	
}
