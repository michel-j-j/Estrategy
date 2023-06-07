package model;

import java.util.Objects;

public class CorreoArgentino implements Envio {
	private DistanceCalculator calculador;
	private String destino;
	
	private static final Integer precioKM = 5;
	private static final CorreoEnum destinoOrigen = CorreoEnum.CapitalFederal;

	public CorreoArgentino(String destino) {
		this.destino = Objects.requireNonNull(destino);
		if(!destinoValido())
			throw new RuntimeException("Destino Invalido. ");
		this.calculador = new DistanceCalculator(destinoOrigen.name());
	}

	@Override
	public Integer calcularEnvio() {
		Integer total = precioKM * calculador.calcularDistancia(destino);
		total += impuestoAgregado(destino);
		return total;
	}

	private Integer impuestoAgregado(String destino)
	{
		if(destino.equals(destinoOrigen.name()))
			return destinoOrigen.precio();
		return CorreoEnum.Default.precio();
	}
	private Boolean destinoValido() {
		for (CorreoEnum des : CorreoEnum.values()) {
			if (des.equals(destinoOrigen))
				return true;
		}
		return false;
	}
}