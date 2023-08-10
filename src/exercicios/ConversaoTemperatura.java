package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		double c,f;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("Conversão de Temperatura");
		System.out.println("Digite a temperatura em farenheit:");
		f = teclado.nextDouble();
		c = (5*(f-32))/9;
		System.out.println("A temperatura em Celsius: " + formatador.format(c) + " C");
		teclado.close();
	}

}
