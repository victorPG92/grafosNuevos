package com.structs.algoritmos.dijkstra.utils;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PFMTest
{

	
	@Test
	public void testOrdenado() throws Exception
	{
		PathFinderMap<Integer> pfm = new PathFinderMapImpl<Integer>();
		
		Map<Integer,Integer> mapaPrueba= new HashMap<Integer, Integer>();
		mapaPrueba.put(3, 2);
		mapaPrueba.put(2, 1);
		mapaPrueba.put(1, null);
		
		List<Integer> recorrido = pfm.obtenerCamino(mapaPrueba, 3);
		
		System.out.println(recorrido);
		
	}
	
	@Test
	public void testDesordenado() throws Exception
	{
		PathFinderMap<Integer> pfm = new PathFinderMapImpl<Integer>();
		
		Map<Integer,Integer> mapaPrueba= new HashMap<Integer, Integer>();
		mapaPrueba.put(3, 2);
		mapaPrueba.put(1, null);
		mapaPrueba.put(2, 1);
		
		
		List<Integer> recorrido = pfm.obtenerCamino(mapaPrueba, 3);
		
		System.out.println(recorrido);
		
	}
}
