package desafioJava.org;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio02 {

	   public static boolean validaSenha(String senha) {

	        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6}$";

	        Pattern p = Pattern.compile(regex);

	        if (senha == null) {
	            return false;
	        }

	        Matcher m = p.matcher(senha);

	        return m.matches();
	    }

	    public static void main(String[] args) {

	        Scanner inserir = new Scanner(System.in);

	        System.out.printf("Nome: ");
	        String nome = inserir.next();
	        
	        System.out.println("\nSenha: ");
	        String senha = inserir.next();



	        System.out.println(validaSenha(senha));
	    }


}
