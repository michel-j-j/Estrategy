package model;

import java.util.Objects;

public class DistanceCalculator {
	private String destinOrigen;
	
	public DistanceCalculator(String destinOrigen)
	{
		this.destinOrigen = Objects.requireNonNull(destinOrigen);
		if(!destinoValido(destinOrigen))
			throw new RuntimeException("Destino origen invalido.");
	}
	private Boolean destinoValido(String destino)
	{
		return true;
	}
	
	public Integer calcularDistancia(String destinoFinal) //Esta funcion retorna la distancia en Km en caso de error, Exception.
	{
		if(!destinoValido(destinOrigen))
			throw new RuntimeException("Destino final invalido.");
		
		return 100;
	}
}