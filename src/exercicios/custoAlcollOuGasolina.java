package exercicios;

import java.util.Scanner;

public class custoAlcollOuGasolina {

	public static void main(String[] args) {
		double valMaxAlcool, gasolina, alcool;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor da gasolina");
		gasolina = teclado.nextDouble();
		System.out.println("Valor do alcool");
		alcool = teclado.nextDouble();
		
		valMaxAlcool =(70*gasolina)/100;
		if(alcool < valMaxAlcool) {
			System.out.println("Usar alcool");
		}else {
			System.out.println("Usar gasolina");
		}
		teclado.close();
	}
	
}
