package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		double np1;
		double np2;
		double exame;
		double pim;
	
		
		
		System.out.println("Digite a nota np1:");
		np1 = sc.nextDouble();
		System.out.println("Digite a nota np2:");
		np2 = sc.nextDouble();
		
		
		double resultado = ((np1 + np2) /2 );
		double nota = (resultado * 0.80);
		
		System.out.printf("resultado = %.2f%n", nota);
		System.out.println("Digite sua nota do pim:");
		pim = sc.nextDouble();
		
		double notaPim = (pim * 0.2);
		double nota_final = (notaPim + nota);
		
		System.out.printf("sua nota final é:%.1f%n%n", nota_final);
		

		if (nota_final < 7) {
			System.out.println("Digite a nota do exame:");
			exame = sc.nextDouble();
			
			double resultadoexame = ((nota + exame) / 2);
			System.out.printf("Sua nota foi: %.2f", resultadoexame);
			
		} else {
			System.out.print("Parabens! Você está na média!");
		}
		sc.close();
	}

}
 