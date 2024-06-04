package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.printf("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.printf("Descontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("\nSalário Líquido: %.2f", salarioLiquido);
	}
}
