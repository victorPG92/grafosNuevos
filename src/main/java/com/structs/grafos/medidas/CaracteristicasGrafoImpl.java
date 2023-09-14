package com.structs.grafos.medidas;

import java.util.Map;
import java.util.Optional;

import com.structs.grafos.GrafoAristas;
import com.structs.grafos.aristas.AristaConPeso;

public class CaracteristicasGrafoImpl
{

	GrafoAristas<AristaConPeso<Double>> grafo;

	/**
	 * public double excentricidad(T nodo) { if (!existNode(nodo)) return -1;
	 * double[][] A = floyd(); int posicion = getNode(nodo); double max = 0; for
	 * (int i = 0; i < size; i++) { if (A[i][posicion] > max) max = A[i][posicion];
	 * } return max; }
	 * 
	 * public double centroDelGrafo() { List<Double> excentricidades = new
	 * ArrayList<Double>(); for (int i = 0; i < size; i++) {
	 * excentricidades.add(excentricidad(nodes[i])); } double min =
	 * Double.POSITIVE_INFINITY; for (int i = 0; i < excentricidades.size(); i++) {
	 * if (excentricidades.get(i) < min) min = excentricidades.get(i); } return min;
	 * }
	 * 
	 * public boolean nodoFuertementeConexo(int i) { if (!existNode(nodo)) return
	 * false; if (recorridoProfundidad(nodo) == 0) return true; return false;
	 * 
	 * }
	 * 
	 * public boolean grafoFuertementeConexo() { for (int i = 0; i < grafo.V(); i++)
	 * if (nodoFuertementeConexo(i)) return true;
	 * 
	 * return false; }
	 * 
	 */
	public boolean isNodoAislado(int i)
	{
		int Gsalida = grafo.gradoSalida(i);
		int GEntrada = grafo.gradoEntrada(i);

		return (Gsalida == 0 && GEntrada == 0);
	}

	public boolean isNodoSumidero(int i)
	{
		int Gsalida = grafo.gradoSalida(i);
		int GEntrada = grafo.gradoEntrada(i);
		
		return (Gsalida == 0 && GEntrada > 0);

	}

	public boolean isNodoFuente(int i)
	{
		int Gsalida = grafo.gradoSalida(i);
		int GEntrada = grafo.gradoEntrada(i);

		return  (Gsalida > 0 && GEntrada == 0);

	}
}
