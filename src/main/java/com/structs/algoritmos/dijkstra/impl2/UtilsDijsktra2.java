package com.structs.algoritmos.dijkstra.impl2;

public class UtilsDijsktra2
{

	/**
	 * Devuelve el indice dentro del vector de distancias que sea mas pequeño y
	 * que no este visitado arista y si no hay ninguna arista devuelve -1
	 * 
	 * @param D
	 *            , vector de costes
	 * @param s
	 *            , vector de nodos vistitados o no
	 * @return int, minimo coste de un nodo al resto.
	 */
	public static int minEdge(double[] D, boolean[] s, int size) {
		int minEdge = -1;
		for (int i = 0; i < size; i++) {
			if (!s[i] && (minEdge == -1 || D[i] < D[minEdge])) {
				minEdge = i;

			}

		}

		return minEdge;
	}
}
