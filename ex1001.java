package exerc10;

import java.util.Scanner;

public class ex1001 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numA, numB;

        System.out.println("Digite o primeiro número do intervalo: ");

        numA = leia.nextInt();

        System.out.println("Digite o último número do intervalo: ");

        numB = leia.nextInt();

        if (numA < numB) {

            for (int i = numA; i < numB; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5.");
                }
            }

        } else {
            System.out.println("Intervalo inválido!");}
	}

}
