package funcionarios;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Funcionario {
	public static void main(String[] args) {
		//recupere string enviada pelo usuario
		Scanner sc = new Scanner(System.in); System.out.print("Entre o sal‡rio:");
		String salario = sc.nextLine(); //inicia Scanner
		
		//consulte o padr‹o e extraia os decimais da string
		Pattern padrao;
        padrao = Pattern.compile("\\d+");
        Matcher pesquisa = padrao.matcher(salario);
        
        //fatore os decimais para obter o salario
        int soma = 0;
        while(pesquisa.find()) {
            soma += Integer.parseInt(pesquisa.group());
        }
		
		//Mostre o resultado
		System.out.println("seu salario Ž :" + soma);
		sc.close(); //finalizar Scanner
	}
}
