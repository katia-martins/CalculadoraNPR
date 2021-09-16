package controller;

import br.edu.fateczl.katia.pilhaInt.Pilha;

public class CalculadoraNPR {

	public CalculadoraNPR() {
		super();
	}

	public void insereValor(Pilha pilha, int valor) {
		pilha.push(valor);	
	}
	
	public int npr(Pilha pilha, int opc) throws Exception {
		
		int nr1, nr2, res = 0;
		
		if (pilha.isEmpty() || pilha.size() < 2) {
			
			throw new Exception("Valores insuficientes para empilhar");
		}
		
		nr1 = pilha.pop();
		nr2 = pilha.pop();
		
		switch (opc) {
			case 0: //selecionada opcao de soma
				res = nr1 + nr2;
				break;
			case 1: //selecionada opcao de subtracao
				res = nr1 - nr2;
				break;
			case 2: //selecionada opcao de multiplicacao
				res = nr1 * nr2;
				break;
			case 3: //selecionada opcao de divisao
				res = nr1 / nr2;
				break;
			default: //selecionada outra opcao qualquer
				System.out.println("Opcao inválida!!!");
				break;
		}
		
		return res;
	}
	
}
