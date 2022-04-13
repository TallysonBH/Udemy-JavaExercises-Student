package entities;

public abstract class Contribuinte {
	
	private String name;
	private Double RendaAnual;
	
	
	public Contribuinte() {
	}


	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		RendaAnual = rendaAnual;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getRendaAnual() {
		return RendaAnual;
	}

	
	public abstract Double imposto();
	
}
