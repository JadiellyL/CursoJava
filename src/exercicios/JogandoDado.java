package exercicios;

import java.util.Scanner;

public class JogandoDado {

	public static void main(String[] args) {
		int dado;
		char resposta = 's';
		Scanner teclado = new Scanner(System.in);
		
		while(resposta == 's') {
			dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face do dado:" + dado);
			System.out.print("Deseja jogar mais uma vez?");
			resposta = teclado.next().charAt(0);
		}
		teclado.close();
	}

}
