package Desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu2 {

	static int opcoes;

	public static int getOpcoes() {
		return opcoes;
	}

	public static void setOpcoes(int opcoes) {
		Menu2.opcoes = opcoes;
	}

	private static int selecionaOpcao() {
		Scanner sc = new Scanner(System.in);
		opcoes = sc.nextInt();
		System.out.println(opcoes);
		setOpcoes(opcoes);
		return opcoes;
	}

	// ArrayList
	public static void iniciaVeiculos(ArrayList<Veiculos> veiculozinho) {
		Carro c1 = new Carro("2", "sim", "mecânico", "manual", "Chevrolet", "azul", "1996", "EEE123");
		veiculozinho.add(c1);
		Carro c2 = new Carro("4", "não", "Mecânico", "Manual", "VW", "Branco", "1976", "ABC2121");
		veiculozinho.add(c2);
		Carro c3 = new Carro("4", "sim", "Hidráulica", "Manual", "BMW", "Vermelho", "2020", "UTI5756");
		veiculozinho.add(c3);
		Carro c4 = new Carro("4", "sim", "Hidráulica", "Manual", "Ford", "Cinza", "2020", "UTI5756");
		veiculozinho.add(c4);
		Carro c5 = new Carro("2", "não", "hidráulica", "automático", "Nissan", "Verde", "2015", "LPI2525");
		veiculozinho.add(c5);
		Moto m1 = new Moto("Honda", "azul", "2000", "ASD123", "750");
		veiculozinho.add(m1);    		
   	  	Moto m2 = new Moto( "Suzuki", "Roxo", "2009", "QQQ5858", "249");
   	  	veiculozinho.add(m2);
   	 	Moto m3 = new Moto( "KTM", "Prata", "2005", "ERT5656", "399");
   	 	veiculozinho.add(m3);
   	 	Moto m4 = new Moto( "BMW", "Azul", "2020", "EFD5858", "150");
   	 	veiculozinho.add(m4);   		
   	 	Moto m5 = new Moto( "Toyota", "Azul", "2005", "UTY5958", "750");
   	    veiculozinho.add(m5);
		// adicionar na lista

		for(Veiculos v : veiculozinho) {
			System.out.println(v);
		}
	}
		
		//return veiculozinho;
//	}

	public static void main(String[] args) {
		do {
			// Entrada de dados pelo Scanner
			// Scanner entrada = new Scanner(System.in);
			
			System.out.println("------------------------------------------- ");
			System.out.println("Bem-vinda(o) a locacao da ViaFlow!!");
			System.out.println("------------------------------------------- ");
			System.out.println("1 - Cadastrar veiculo");
			System.out.println("2 - Quero locar um veiculo");
			System.out.println("3 - Sair");
			System.out.println("------------------------------------------- ");
			System.out.print("Selecione uma das opcoes: ");
			selecionaOpcao();
			System.out.println(" ");

			switch (opcoes) {
			case 1:
				// TODO Sistema de Cadastro de veiculos

				CadastroVeiculo cadastro = new CadastroVeiculo();
				cadastro.mostrarTelaCadastro();
				break;
			case 2:
				// TODO Sistema de Locacao de veiculos
				LocacaoVeiculos locacao = new LocacaoVeiculos();
				ArrayList<Veiculos> v = new ArrayList<Veiculos>();
				iniciaVeiculos(v);
				locacao.mostraTelaLocacao();
				
				 {
					 
					System.out.println(v);
				}
				//return veiculozinho;
				break;
			case 3:
				System.out.println("Obrigada(o) por usar nosso servico!");
				break;
			default:
				System.out.println("Por favor, digite uma opcao valida!");
			}

		} while (opcoes != 3);

	}

}
