package desafioJava.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Questão numero 01 -- Escada*/

public class Exercicio01 {

	public void questaoUm() {
			
		Scanner input = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();
		
		System.out.printf("Exercício - 01");
		System.out.printf("\n\nInsira um número: ");
		int qtdDegraus = input.nextInt();
		
		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
				
			}
		
		for (String d : degraus ) {
			System.out.println(d);
		
		}

	}

}
