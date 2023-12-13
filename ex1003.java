package exerc10;

import java.util.Scanner;

public class ex1003 {

	public static void main(String[] args) {
		/* ler idades (inteiros) ()
		 * apresentar no console o total de pessoas com -21 ()
		 * apresentar no console o total de pessoas com +50 ()
		 * terminar programa quando inserido via teclado idade < 0
			*/
		
		int idade = 0 , cont21 = 0, cont50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 0 ){
				break;}
				
			if (idade < 21) {
				cont21++;
				//idade = 0;
				
			}else if (idade >50) {
				cont50++;
				//idade = 0;
	
			}else {
				//idade = 0;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+cont21);
		System.out.println("Total de pessoas maiores de 50 anos: "+cont50);
			
		

	}

}
