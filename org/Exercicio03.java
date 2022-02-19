package desafioJava.org;

import java.util.ArrayList;
import java.util.List;

/*Questão 03 - Desenvolver um anagrama*/

public class Exercicio03 {
	
	public void questaoTres(String palavra) {
		System.out.println("\n/////////////////////*////////////*/////////");
		System.out.printf("\nExercício - 03");
		System.out.printf("\n\n");
        System.out.println(contarAnagramas(palavra));
    }

	
    private Integer contarAnagramas(String palavra) {
        List<Integer[]> index = verificarLetrasRepetidas(palavra);
        return contarSubString(index);
    }

    private List<Integer[]> verificarLetrasRepetidas(String palavra) {
        List<Integer[]> index = new ArrayList<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    Integer[] aux = new Integer[2];
                    aux[0] = i;
                    aux[1] = j;
                    index.add(aux);
                }
            }
        }
        return index;
    }

    private Integer contarSubString(List<Integer[]> index) {

        int cont = 0;

        if (index.size() == 1) {
            return 3;
        }
        for (int i = 0; i < index.size(); i++) {
            if (index.get(i)[1] - index.get(i)[0] > 1) {
                cont += 2;
            } else {
                cont++;
            }
        }
        return cont;

    }


}
