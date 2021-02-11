package Desafio1;

public class Moto extends Veiculos {
	protected String cilindradas;
	
	public void motosDisponiveis() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cilindradas: " + this.cilindradas + "\n");
		
	}
	public Moto() {
		super();
	}


	public Moto(String marca, String cor, String ano, String placa, String cilindradas) {
	super();
	this.marca = marca;
	this.cor = cor;
	this.ano = ano;
	this.placa = placa;
	this.cilindradas = cilindradas;
	}
	
	
	public Moto(String cilindradas) {
		super();
		this.cilindradas = cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	public String getCilindradas() {
		return cilindradas;
	}
	
	public String toString() {
		return "Moto [getCilindradas()=" + getCilindradas() + ", getMarca()="
				+ getMarca() + ", getAno()=" + getAno() + ", getPlaca()=" + getPlaca() + ", getCor()=" + getCor() + "]";
	}
	
	

}
