package model;

public enum CorreoEnum{
	CapitalFederal(500), Default(800);
	private Integer precio;
	private CorreoEnum(Integer precio)
	{
		this.precio = precio;
	}
	public Integer precio()
	{
		return this.precio;
	}
	public Boolean equals(String destino)
	{
		return this.name().equals(destino);
	}
}
