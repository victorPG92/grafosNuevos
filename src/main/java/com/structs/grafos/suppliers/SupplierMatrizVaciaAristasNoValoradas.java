package com.structs.grafos.suppliers;

import com.structs.grafos.aristas.AristaConPeso;

/**
 * Provee una matriz cuadrada de tipo AristaConPeso
 * @author vpenit
 *
 * @param <W>
 */
public class SupplierMatrizVaciaAristasNoValoradas<W> implements SuplierMatrizCuadradaVacia<AristaConPeso<W>>
{

	public AristaConPeso<W>[][] getMatriz(int v)
	{
		
		return new AristaConPeso[v][v];
	}



}
