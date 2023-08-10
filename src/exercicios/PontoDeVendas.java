package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PontoDeVendas {

	public static void main(String[] args) {
		double valorTotal, desconto, descontoTotal, valorPago, troco;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Valor total da compra foi R$");
		valorTotal = teclado.nextDouble();
		System.out.println("Desconto de ");
		desconto = teclado.nextDouble();
		descontoTotal = valorTotal - ((desconto*valorTotal)/100);
		System.out.println("Com desconto de " + desconto + "% fica R$" + formatador.format(descontoTotal));
		System.out.println("Valor pago R$");
		valorPago = teclado.nextDouble();
		troco = valorPago - descontoTotal;
		System.out.println("O troco foi de R$" + formatador.format(troco));
		teclado.close();
	}

}
