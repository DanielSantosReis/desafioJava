package desafioJava.org;


public class Main {

	public static void main(String[] args) {
		
		/**
		 * Todos os <três exercicios> serão executados na Classe MAIN!
		 * 
		 * Pois todos os exercicios foram instanciados nesta Classe MAIN (por ser a Principal) 
		 * 
		 * @author Daniel dos Santos Reis
		 * @since 19/02/2022
		 */

		Exercicio01 exer01 = new Exercicio01();
		
		exer01.questaoUm();
		
		/**
		 * No exercício Um, nesta classe o usuário terá que inserir um número, e o mesmo irá retornar
		 * uma escada.
		 *                                                                                                        *
		 * Exemplo de uso:                                                                                       **
		 * @param Usuário digita um valor.                                                                      ***
		 * @return Se for um valor numérico será apresentado uma escada com o valor final do número. Ex:04  -> ****
		 */
		
		Exercicio02 exer02 = new Exercicio02();
		
		exer02.questaoDois("@1236"); // <-- Digite a Senha Aqui!!!
		
		/**
		 * No exercicio Dois, nesta classe instanciada, poderá ser digitado qualquer tipo de senha, e irá 
		 * retornar uma mensagem dizendo se a mesma é Forte ou Fraca.
		 * 
		 * Exemplo de uso:
		 * @param Escreva a senha no campo entre parentes e aspas comentado acima ↑↑↑
		 * @return Irá retornar a mensagem Forte ou Fraca.
		 * Ex:01 - ("daniel55") - Senha Fraca // Ex:02 - ("Daniel@1235") - Senha Forte.
		 */
		
		
		Exercicio03 exer03 = new Exercicio03();
		
		exer03.questaoTres("ifailuhkqq"); // <-- Digite Aqui uma Palavra
		
		/**
		 * No exercicio Três, nesta classe instanciada, poderá ser digitado qualquer tipo de palavra, e irá 
		 * retornar um número do anagrama.
		 * 
		 * Exemplo de uso:
		 * @param Escreva uma palavra no campo entre parentes e aspas comentado acima ↑↑↑
		 * @return Irá retornar a mensagem com a palavra em número.
		 * Ex: - ("ifailuhkqq") == 3
		 */
		

	}

}
