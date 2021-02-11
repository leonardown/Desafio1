package Desafio1;

public class Onibus extends Veiculos {
	
		protected String acentos;
	
	public void OnibusDisponiveis() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Acentos: " + this.acentos + "\n");
		
	}
	public Onibus() {
		super();
	}


	public Onibus(String marca, String cor, String ano, String placa, String acentos) {
	super();
	this.marca = marca;
	this.cor = cor;
	this.ano = ano;
	this.placa = placa;
	this.acentos = acentos;
	}
	

	public String getAcentos() {
		return acentos;
	}
	public void setAcentos(String acentos) {
		this.acentos = acentos;
	}

	public String toString() {
		return "Onibus [getAcentos()=" + getAcentos() + ", getPlaca()=" + getPlaca() + ", getMarca()=" + getMarca()
				+ ", getCor()=" + getCor() + ", getAno()=" + getAno() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
