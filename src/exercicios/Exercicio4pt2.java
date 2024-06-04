package exercicios;

import java.util.Scanner;

public class Exercicio4pt2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.printf("Digite um número: ");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite um segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.printf("Digite um terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.printf("Digite um quarto número: ");
		n4 = leia.nextFloat();
		
		leia.close();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença entre os produtos obtidos é: " + dif);

	}

}
