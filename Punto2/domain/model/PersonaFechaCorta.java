package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class PersonaFechaCorta implements Persona{
	private LocalDate fecha;
	private static final String FORMATO_CORTO = "dd-MM-yyyy";
	
	public PersonaFechaCorta(LocalDate fecha)
	{
		this.fecha = Objects.requireNonNull(fecha);
	}
	@Override
	public String fechaNacimiento() {
		return formatearFecha();
	}
	
	private String formatearFecha()
	{
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(FORMATO_CORTO);
        return fecha.format(formateador);
	}

}
