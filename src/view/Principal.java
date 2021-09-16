package view;

import br.edu.fateczl.katia.pilhaInt.Pilha;
import controller.CalculadoraNPR;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		CalculadoraNPR control = new CalculadoraNPR();

		int opc = 0;
		int res = 0;

		String[] botao = { "- Incluir numero -", "- Operacao -", "- Sair -" };
		
		String[] operacao = { "Soma", "Subtracao", "Multiplicacao", "Divisao", "Sair" };
		
		
		
		do { // Executa caixa enquanto estiver inserindo numeros
			
			
			opc = JOptionPane.showOptionDialog(null, "\n Escolha uma opcao \n\n", " >>> MENU <<< ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botao, botao[0]);
			
			if (opc == 0) {
				
				int num = Integer.parseInt(JOptionPane.showInputDialog(null, "\n Digite um numero: \n\n"));
				control.insereValor(pilha, num);
			}
			
		} while ((opc != 1) && (opc != 2));

		
		if (opc == 1) { //Selecionou Botao Operacao
			
			 do {
				 
			 
				int opcao = JOptionPane.showOptionDialog(null, "\n Escolha a Operacao \n\n ", ">> OPERACOES <<<", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, operacao, operacao[2]);
				
				if (opcao == 4) { //Clicou em Sair
					
					System.out.println(">>> ATE A PROXIMA <<<");
					System.exit(0);
				}
					
				else {
				
					try {
						
					res = control.npr(pilha, opcao);
					control.insereValor(pilha, res);
					
					
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"Resultado: " + res);
					e.printStackTrace();
					System.exit(0);
					}
				}
				
} while (!pilha.isEmpty());
			 
			 
		}

	}

}
