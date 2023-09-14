package com.structs.grafos.suppliers;

/**
 * Provee una matriz cuadrada de un tipo T dado una dimension
 * @author vpenit
 *
 * @param <T>
 */
public interface SuplierMatrizCuadradaVacia<T>
{

	/**
	 *  Provee una matriz cuadrada de un tipo T dado una dimension

	 * @param v
	 * @return
	 */
	public T[][] getMatriz(int v);
}
