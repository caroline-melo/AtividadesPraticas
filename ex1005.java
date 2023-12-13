package exerc10;

import java.util.Scanner;

public class ex1005 {

	public static void main(String[] args) {
		// ler inteiros até que "0" seja digitado
		//mostrar soma de todos os numeros > 0

		Scanner leia = new Scanner(System.in);
		int num, soma = 0;
		
		
		do {
		
		System.out.println("Digite um número ");
		num = leia.nextInt();
		
		if (num > 0) {
			soma = soma + num;} 
		
		}while (num != 0);
				
		System.out.println("Total da soma dos números positivos é: "+soma);
		
	}

}

	