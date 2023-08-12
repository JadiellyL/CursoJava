package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularValorHora {

	public static void main(String[] args) {
		double remuneracao, custoOp, chMensal, hora;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Remuneração Mensal:");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo Operacional:");
		custoOp = teclado.nextDouble();
		System.out.println("Carga Horária mensal:");
		chMensal = teclado.nextDouble();
		//impostos = remuneracao - ((30*remuneracao)/100);
		//investimentos = remuneracao - ((20*remuneracao)/100);
		hora = (remuneracao + (remuneracao * 0.3) + custoOp + (remuneracao * 0.2))/chMensal;
		System.out.println("O valor da hora " + formatador.format(hora));
		teclado.close();
	}

}
