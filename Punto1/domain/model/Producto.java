package model;

import java.util.Objects;

public class Producto {
	private Integer precio;
	private Integer peso;
	
	public Producto(Integer precio, Integer peso)
	{
		this.precio = Objects.requireNonNull(precio);
		this.peso = Objects.requireNonNull(peso);
	}
	
	public Integer obtenerPrecio()
	{
		return this.precio;
	}
	public Integer obtenerPeso()
	{
		return this.peso;
	}
}
