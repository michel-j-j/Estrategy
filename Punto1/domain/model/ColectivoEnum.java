package model;

public enum ColectivoEnum{
	CapitalFederal(1000),BuenosAires(1500),Default(3000);
	private Integer precio;
	private ColectivoEnum(Integer precio)
	{
		this.precio = precio;
	}
	public Integer precio()
	{
		return this.precio;
	}
}
