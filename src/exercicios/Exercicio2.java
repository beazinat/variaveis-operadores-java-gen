package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float Nota1, Nota2, Nota3, Nota4, Media;
		
		System.out.printf("Digite sua primeira nota: ");
		Nota1 = leia.nextFloat();
		
		System.out.printf("Digite sua segunda nota: ");
		Nota2 = leia.nextFloat();
		
		System.out.printf("Digite sua terceira nota: ");
		Nota3 = leia.nextFloat();
		
		System.out.printf("Digite sua quarta nota: ");
		Nota4 = leia.nextFloat();
		
		leia.close();
		
		Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		
		System.out.printf("\nSua média: " + Media);

	}

}
