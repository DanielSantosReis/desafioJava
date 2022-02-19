package desafioJava.org;

/*Questão 02 - Fazer Senha*/
public class Exercicio02 {
	
	public void questaoDois(String senha) {

        final int TAMANHO_MINIMO = 6;

        if (isValido(senha)) {
            System.out.println("\nSenha forte!");
        } else {
            int aux = TAMANHO_MINIMO - senha.length();
            if (aux >= 0) {
                System.out.println(aux);
            } else {
                System.out.println("\nSenha fraca!");
            }
        }
    }


    private boolean isValido(String senha) {

        if (senha.length() < 6) return false;

        boolean minusculo = false;
        boolean maiusculo = false;
        boolean numero = false;
        boolean simbolo = false;

        for (char aux : senha.toCharArray()) {
            if (aux >= '0' && aux <= '9') {
                numero = true;
            } else if (aux >= 'A' && aux <= 'Z') {
                maiusculo = true;
            } else if (aux >= 'a' && aux <= 'z') {
                minusculo = true;
            } else {
                simbolo = true;
            }
        }
        return numero && maiusculo && minusculo && simbolo;
    }

}
