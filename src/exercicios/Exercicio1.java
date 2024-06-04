package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salario, abono, novoSalario;

		System.out.printf("Digite seu salário: ");
		salario = leia.nextFloat();

		System.out.printf("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario + abono;

		System.out.printf("\nNovo salário: %.2f" , novoSalario);

	}

}
