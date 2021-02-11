package Desafio1;


	import java.util.ArrayList;	
	import java.util.Scanner;

	public class CadastroVeiculo {
		
		static int opcoes;
		public ArrayList<Veiculos> listaVeiculos = new ArrayList<Veiculos>();
		
		public CadastroVeiculo() {
	
		}
		
		
		private static int selecionaCadastro() {
			Scanner sc = new Scanner(System.in);
			opcoes = sc.nextInt();
			setOpcoes(opcoes);
			return opcoes;
		}
		
		public void mostrarTelaCadastro() {
			do {
				System.out.println("------------------------------- ");
				System.out.println("Sistema de cadastro de veiculos, digite a op��o desejada: ");
				System.out.println("------------------------------- ");
				System.out.println("1 - Cadastrar moto");
				System.out.println("2 - Cadastrar carro");
				System.out.println("3 - Cadastrar onibus");
				System.out.println("4 - Cadastrar caminhao");
				System.out.println("5 - Voltar para tela anterior");
				System.out.println("---------------------------------- ");
				System.out.print("Selecione uma das opcoes de cadastro: ");
				selecionaCadastro();
				System.out.println(" ");

				switch(opcoes) {
				case 1:
					cadastroMoto();
					imprimeListaVeiculos(listaVeiculos);
					break;
				case 2:
					cadastroCarro();
					imprimeListaVeiculos(listaVeiculos);
					//System.out.println("Cadastro Carro");
					break;
				case 3:
					cadastroOnibus();
					imprimeListaVeiculos(listaVeiculos);
					break;
				case 4:
					cadastroCaminhao();
					imprimeListaVeiculos(listaVeiculos);
					break;
				default:
					System.out.println("Por favor, digite uma opcao valida!");
				}
			} while (opcoes != 5);
		}
		
		public static int getOpcoes() {
			return opcoes;
		}

		public static void setOpcoes(int opcoes) {
			Menu2.opcoes = opcoes;
		}
		
		

		public ArrayList<Veiculos> getListaVeiculos() {
			return listaVeiculos;
		}


		public void setListaVeiculos(ArrayList<Veiculos> listaVeiculos) {
			this.listaVeiculos = listaVeiculos;
		}


		private Moto cadastroMoto() {
			System.out.println("Voc� selecionou: Moto");
			System.out.println("Quantas cilindradas ela possui? ");
			Moto m = new Moto();
			Scanner ent = new Scanner(System.in);
			m.setCilindradas(ent.nextLine());
			System.out.println("Digite a marca do ve�culo: ");
			m.setMarca(ent.nextLine());
			System.out.println("Digite a cor do ve�culo: ");
			m.setCor(ent.nextLine());
			System.out.println("Digite o ano do ve�culo: ");
			m.setAno(ent.nextLine());
			System.out.println("Digite a placa do ve�culo: ");
			m.setPlaca(ent.nextLine());			
			listaVeiculos.add(m);
			setListaVeiculos(listaVeiculos);
			System.out.println(listaVeiculos.size()+" veiculo registrados com sucesso!");
			return m;
		}
		private Carro cadastroCarro() {
			System.out.println("Voc� selecionou: Carro");			
			System.out.println("Quantas portas ele possui? ");
			Carro c = new Carro();
			Scanner ent = new Scanner(System.in);
			c.setPortas(ent.nextLine());
			System.out.println("Possui Ar Condicionado? (sim/n�o) ");
			c.setArCondicionado(ent.nextLine());
			System.out.println("Qual o tipo de c�mbio? (manual/autom�tico) ");
			c.setCambio(ent.nextLine());
			System.out.println("Qual o tipo de dire��o? (mec�nica, hidr�ulica ou el�trica) ");
			c.setDirecao(ent.nextLine());
			System.out.println("Digite a marca do ve�culo: ");
			c.setMarca(ent.nextLine());
			System.out.println("Digite a cor do ve�culo: ");
			c.setCor(ent.nextLine());
			System.out.println("Digite o ano do ve�culo: ");
			c.setAno(ent.nextLine());
			System.out.println("Digite a placa do ve�culo: ");
			c.setPlaca(ent.nextLine());			
			listaVeiculos.add(c);
			setListaVeiculos(listaVeiculos);
			System.out.println(listaVeiculos.size()+" ve�culo registrados com sucesso!");
			return c;
			
		}			
		private Onibus cadastroOnibus() {			
			System.out.println("Voc� selecionou: �nibus");			
			System.out.println("Qual a quantidade de acentos? ");
			Onibus o = new Onibus();
			Scanner ent = new Scanner(System.in);
			o.setAcentos(ent.nextLine());
			System.out.println("Digite a marca do ve�culo: ");
			o.setMarca(ent.nextLine());
			System.out.println("Digite a cor do ve�culo: ");
			o.setCor(ent.nextLine());
			System.out.println("Digite o ano do ve�culo: ");
			o.setAno(ent.nextLine());
			System.out.println("Digite a placa do ve�culo: ");
			o.setPlaca(ent.nextLine());
			listaVeiculos.add(o);
			setListaVeiculos(listaVeiculos);
			System.out.println(listaVeiculos.size()+" ve�culo registrados com sucesso!");
			return o;
		}
		
		private Caminhao cadastroCaminhao() {
			System.out.println("Voc� selecionou: Caminh�o");			
			System.out.println("Qual a capacidade em toneladas? ");
			Caminhao cm = new Caminhao();
			Scanner ent = new Scanner(System.in);
			cm.setCapacidade(ent.nextLine());
			System.out.println("Digite a marca do ve�culo: ");
			cm.setMarca(ent.nextLine());
			System.out.println("Digite a cor do ve�culo: ");
			cm.setCor(ent.nextLine());
			System.out.println("Digite o ano do ve�culo: ");
			cm.setAno(ent.nextLine());
			System.out.println("Digite a placa do ve�culo: ");
			cm.setPlaca(ent.nextLine());
			setListaVeiculos(listaVeiculos);
			listaVeiculos.add(cm);
			
			System.out.println(listaVeiculos.size()+" ve�culo registrados com sucesso!");
			return cm;
		}
		
		
		public void imprimeListaVeiculos(ArrayList<Veiculos> veic) {
			for(Veiculos v : veic) {
				System.out.println(v);
			}
		}
		



}
