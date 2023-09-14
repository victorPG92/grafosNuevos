package com.structs.algoritmos.dijkstra;

import java.util.Optional;

import com.structs.algoritmos.dijkstra.impl2.UtilsDijsktra2;
import com.structs.grafos.GrafoEtiquetado;
import com.structs.grafos.aristas.AristaConPeso;

public class AlgoritmoDijkstra2<T>
{
	GrafoEtiquetado<T, AristaConPeso<Double>> grafo;

	/**
	 * Algoritmo de Dijkstra para encontrar el camino de coste minimo desde nodo
	 * hasta el resto de nodos
	 * 
	 * @param nodo El nodo por el que se quiere empezar el recorrido en profundidad
	 * @return double[], lista con los pesos minimos entre el nodo pasado como
	 *         parametro y los demas nodos.
	 */
	public double[] djikstra(T source)
	{
		if (!grafo.existV(source))
			return null;

		int v = grafo.indexOfV(source).get();
		boolean[] s = new boolean[grafo.V()];

		s[v] = true;
		double[] D = intilializeDjikstraD(v);
		int[] P = intilializeDjikstraP(v);

		djisktra(s, D, P);

		return D;

	}

	/**
	 * Método auxiliar que genera la matriz de costes en el algoritmo de Djikstra
	 * 
	 * @param node , nodo origen por donde empieza el algoritmo
	 * @return costes, matriz de costes por los que puede ir el nodo origen
	 */
	private double[] intilializeDjikstraD(int nodePosition)
	{
		double[] costes = new double[grafo.V()];
		for (int i = 0; i < grafo.V(); i++)
		{
			if (nodePosition == i)
				costes[i] = 0;
			else
			{
				Optional<AristaConPeso<Double>> optArista = grafo.getAristaIndices(nodePosition, i);
				if (optArista.isPresent())
				{
					costes[i] = optArista.get().getPeso();
				} else
					costes[i] = Double.POSITIVE_INFINITY;
			}
		}
		return costes;

	}

	/**
	 * Método auxiliar para inicializar la matriz de nodos por los que hay union
	 * directa con el nodo origen en Djikstra
	 * 
	 * @param node , nodo de origen del algoritmo
	 * @return p, matriz de nodos por los que se puede acceder desde el nodo Origen
	 */
	private int[] intilializeDjikstraP(int nodePosition)
	{

		int[] p = new int[grafo.V()];
		for (int i = 0; i < grafo.V(); i++)
		{
			if (grafo.getAristaIndices(nodePosition, i).isPresent() || nodePosition == i)
				p[i] = nodePosition;
		}
		return p;
	}

	/**
	 * método recursivo de djisktra que va escogiendo el arco de coste minimo
	 * posible en cada accion recursiva
	 * 
	 * @param s array de nodos visitados
	 * @param D array de costes
	 * @param P array de nodos del grafo
	 */
	public void djisktra(boolean[] s, double[] D, int[] P)
	{
		int minEdgeNode = UtilsDijsktra2.minEdge(D, s, grafo.V());
		if (minEdgeNode != -1)
		{
			s[minEdgeNode] = true;
			for (int i = 0; i < grafo.V(); i++)
			{
				Optional<AristaConPeso<Double>> optarista = grafo.getAristaIndices(minEdgeNode, i);
				if (optarista.isPresent() && (D[minEdgeNode] + optarista.get().getPeso()) < D[i])
				{
					D[i] = D[minEdgeNode] + optarista.get().getPeso();
					P[i] = minEdgeNode;
				}
			}

			djisktra(s, D, P);
		}

	}

}
