package desafioJava.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Quest�o numero 01 -- Escada*/

public class exercicio01 {

	public static void main(String[] args) {

		// Scanner -> Para fazer a leitura dos n�meros digitados pelo usu�rio
			
		Scanner input = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();
				
		// Local onde o usu�rio ir� digitar o valor desejado
		
		System.out.printf("Insira um n�mero: ");
		int qtdDegraus = input.nextInt();

		// Contagem crescente ap�s o usu�rio digitar um numero.
		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
				
			}
		
		for (String d : degraus ) {
			System.out.println(d);
		
		}

	}

}
