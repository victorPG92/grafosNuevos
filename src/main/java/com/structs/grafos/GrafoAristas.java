package com.structs.grafos;

import java.util.Map;
import java.util.Optional;

public interface GrafoAristas<A extends Arista>
{

	int V();
	
	void insertaArista(A a);

	Optional<Map<Integer, A>> getAristasOfIndex(int v);

	Optional<A> getAristaIndices(int origen, int destino);

}