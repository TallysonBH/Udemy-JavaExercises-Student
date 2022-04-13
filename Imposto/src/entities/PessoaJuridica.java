package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double imposto() {
		Double calculoImposto;
		if(numeroFuncionarios > 10) {
			calculoImposto =  getRendaAnual() * 0.14;
		}
		else {
			calculoImposto =  getRendaAnual() * 0.16;
		}
		return calculoImposto;		
	}
	
	
	
	
	
}
