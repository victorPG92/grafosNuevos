package com.structs.daos;

import java.util.Map;

import com.structs.grafos.aristas.Arista;

public interface MapperArista2MapDB<A extends Arista>
{

	public Map<String,Object> arista2Map();
}
