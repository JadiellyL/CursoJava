package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
	public static void main(String[] args) {
		int jogador, computador;

		Scanner teclado = new Scanner(System.in);
		System.out.println("--------Pedra/Papel/Tesoura--------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Escolha uma Opção:");
		jogador = teclado.nextInt();
		computador = (int) (Math.random() * 3 + 1);

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção invalida");
		}

		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}

		if (computador == jogador) {
			System.out.println("Empate");
		}
		if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
			System.out.println("Jogador é vencedor!");
		}
		if ((jogador == 1 && computador == 2) || (jogador == 2 && computador == 3) || (jogador == 3 && computador == 1)) {
			System.out.println("Computador é vencedor!");
		}
		teclado.close();

	}
}
