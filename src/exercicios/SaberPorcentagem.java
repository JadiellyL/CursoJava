package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SaberPorcentagem {
	public static void main(String[] args) {
		double v1, v2, x;
		
		Scanner teclado1 = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("o primeiro valor:");
		v1 = teclado1.nextDouble();
		System.out.println("o segundo valor:");
		v2 = teclado1.nextDouble();
		x = (v1*v2)/100;
		
		System.out.println(v1 + "% de " + v2 + " = " + formatador.format(x));
		teclado1.close();
	}

}
