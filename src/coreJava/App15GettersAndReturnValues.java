package coreJava;

import java.text.NumberFormat;
import java.util.Locale;

public class App15GettersAndReturnValues {
	
	public static void main(String[] args) {
		
		// Instanciação do objeto da classe.
		App13_2ClassPessoa pessoa = new App13_2ClassPessoa();
		
		// Atribuição de valores às variáveis.
		pessoa.nome = "Rafael";
		pessoa.corDosOlhos = "Azuis";
		pessoa.idade = 32;
		String olhos = pessoa.getCorDosOlhos();
		pessoa.salarioMinimo = 788.00;
		pessoa.salarioMensal = 2404.72;
		
		// Uso dos métodos da classe.
		pessoa.apresentacao();
		System.out.println("Tenho olhos " + olhos + "! Não que isso seja relevante...");
		pessoa.calculaAnosAteAposentadoria();
		pessoa.calculasalarioIdeal();
		double aumentoSalario = pessoa.calculaQuantoFaltaSalario();
		
		// Definição de localização para melhor formatação da saída de valores de moedas.
		Locale ptBr = new Locale("pt", "BR");
		
		// Exibição do retorno do método "calculaQuantoFaltaSalario".
		System.out.println("Preciso de um aumento de " + NumberFormat.getCurrencyInstance(ptBr).format(aumentoSalario) + " para ter uma vida dígna!");
	}

}
