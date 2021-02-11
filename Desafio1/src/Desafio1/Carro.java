package Desafio1;

public class Carro extends Veiculos {

	private String portas;
	private String arCondicionado;
	private String cambio;
	private String direcao;

	public void carrosDisponiveis() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Portas: " + this.portas);
		System.out.println("Ar Condicionado: " + this.arCondicionado);
		System.out.println("Câmbio : " + this.cambio);
		System.out.println("Direção : " + this.direcao + "\n");

	}

	public Carro() {
		// super();
	}

	public Carro(String portas, String arCondicionado, String cambio, String direcao, String marca, String cor,
			String ano, String placa) {
		super();
		this.portas = portas;
		this.arCondicionado = arCondicionado;
		this.cambio = cambio;
		this.direcao = direcao;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;

	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	
	public String toString() {
		return "Carro [getPortas()=" + getPortas() + ", getArCondicionado()=" + getArCondicionado() + ", getCambio()="
				+ getCambio() + ", getDirecao()=" + getDirecao() + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getCor()=" + getCor() + ", getAno()=" + getAno() + "]";
	}
	
	

}
