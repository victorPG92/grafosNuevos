package com.structs.grafos.suppliers;

import com.structs.grafos.aristas.Arista;

/**
 * Provee una matriz cuadrada de tipo Arista sin peso
 * @author vpenit
 *
 * @param <W>
 */
public class SupplierMatrizVaciaAristasValoradas implements SuplierMatrizCuadradaVacia<Arista>
{

	public Arista[][] getMatriz(int v)
	{
		
		return new Arista[v][v];
	}



}
