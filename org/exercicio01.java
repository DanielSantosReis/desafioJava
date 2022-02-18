package desafioJava.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Questão numero 01 -- Escada*/

public class exercicio01 {

	public static void main(String[] args) {

		// Scanner -> Para fazer a leitura dos números digitados pelo usuário
			
		Scanner input = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();
				
		// Local onde o usuário irá digitar o valor desejado
		
		System.out.printf("Insira um número: ");
		int qtdDegraus = input.nextInt();

		// Contagem crescente após o usuário digitar um numero.
		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
				
			}
		
		for (String d : degraus ) {
			System.out.println(d);
		
		}

	}

}
