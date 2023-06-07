package model;

import java.util.List;
import java.util.Objects;

public class Carrito { //Cliente en la estrategia. 
	private List<Producto> productos; //Total + Envio. 
	private Envio envio;
	
	public Carrito(List<Producto> productos, Envio envio)
	{
		this.productos = Objects.requireNonNull(productos);
		this.envio = Objects.requireNonNull(envio);
	}
	public float calcularPrecio()
	{  Integer total = 0;
		for(Producto producto : productos)
		{
			total+=producto.obtenerPrecio();
		}
		total += envio.calcularEnvio();
		return total;
	}
}
