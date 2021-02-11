package Desafio1;

public class Caminhao extends Veiculos {
	
	protected String capacidade;
	
	public void caminhoesDisponiveis() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cilindradas: " + this.capacidade + "\n");
		
	}
	public Caminhao() {
		super();
	}


	public Caminhao(String marca, String cor, String ano, String placa, String capacidade) {
	super();
	this.marca = marca;
	this.cor = cor;
	this.ano = ano;
	this.placa = placa;
	this.capacidade = capacidade;
	}
	
	public Caminhao(String capacidade) {
		super();
		this.capacidade = capacidade;
	}
	
	public String getCapacidade() {
		return capacidade;
	}
	

	
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	public String toString() {
		return "Caminhao [getCapacidade()=" + getCapacidade() + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getCor()=" + getCor() + ", getAno()=" + getAno() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
