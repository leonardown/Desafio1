package Desafio1;



	import java.util.Scanner;

	public class LocacaoVeiculos {
		
		static int opcoes;
		static Scanner ent = new Scanner(System.in);
		private CadastroVeiculo cv;
		
		
		public LocacaoVeiculos() {
			cv = new CadastroVeiculo();
		}
		
		public static int getOpcoes() {
			return opcoes;
		}

		public static void setOpcoes(int opcoes) {
			LocacaoVeiculos.opcoes = opcoes;
		}
		
		private static int selecionaLocacao() {
			Scanner sc = new Scanner(System.in);
			opcoes = sc.nextInt();
			setOpcoes(opcoes);
			return opcoes;
		}
		
		public void mostraTelaLocacao() {
//			mostraLocacaoCadastrados();
			cv.imprimeListaVeiculos(cv.getListaVeiculos());
		}
			
		public void mostraLocacaoCadastrado() {
			
		}


			
			
		}
		

