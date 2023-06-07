package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class PersonaFechaLarga implements Persona{

	private LocalDate fecha;
	private static final String FORMATO_LARGO = "d 'de' MMMM 'de' yyyy";
	
	public PersonaFechaLarga(LocalDate fecha)
	{
		this.fecha = Objects.requireNonNull(fecha);
	}
	@Override
	public String fechaNacimiento() {
		return formatearFecha();
	}
	private String formatearFecha()
	{
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(FORMATO_LARGO);
        return fecha.format(formateador);
	}


}
