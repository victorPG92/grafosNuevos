package com.structs.grafos.suppliers;

import java.util.function.Supplier;

import com.structs.grafos.AristaConPeso;

public class SupplierMatrizVaciaAristasValoradas<W> implements SuplierMatrizCuadradaVacia<AristaConPeso<W>>
{

	public AristaConPeso<W>[][] getMatriz(int v)
	{
		
		return new AristaConPeso[v][v];
	}



}
