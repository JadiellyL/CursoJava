package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		double peso, altura, imc;

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("Digite o Peso:");
		peso = teclado.nextDouble();
		System.out.println("Digite a Altura:");
		altura = teclado.nextDouble();
		imc = peso / (altura * altura);
		if (imc < 18.5) {
			System.out.println("A baico do peso! " + formatador.format(imc));
		}
		if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso ideal! " + formatador.format(imc));
		}
		if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Levemente acima do Peso! " + formatador.format(imc));
		}
		if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade grau I! " + formatador.format(imc));
		}
		if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade grau II (severa)! " + formatador.format(imc));
		}
		if (imc >40) {
			System.out.println("Obesidade Mórbida! " + formatador.format(imc));
		}
		
		teclado.close();
	}
}
