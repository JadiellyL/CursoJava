package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int tabuada, resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da Tabuada:");
		tabuada = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			resultado = tabuada * i;
			System.out.println(tabuada + " x " + i + " = " + resultado);
		}

		teclado.close();
	}

}
