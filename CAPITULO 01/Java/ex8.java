import java.io.*;
import java.util.*;
import java.text.*;
public class ex8{
	public static void main (String[]args){
		double valor_dep,taxa,valor_rend,valor_acumulado;
		int periodo;
		Scanner dado;
		dado = new Scanner (System.in);
		System.out.println("Digite o valor do deposito :");
		valor_dep = dado.nextDouble();
		System.out.println("Informe a taxa de juros ao mês :");
		taxa = dado.nextDouble();
		System.out.println("Informe o perido em meses a aplicação :");
		periodo = dado.nextInt();
		valor_rend = valor_dep * (taxa*periodo);
		valor_acumulado = valor_dep + valor_rend; 
		DecimalFormat cs;
		cs = new DecimalFormat("0.00");
		System.out.println("Valor do rendimento do investimento ao mês: "+cs.format(valor_rend));
		System.out.println("Valor total do rendimento após "+periodo+" meses e de "+ cs.format(valor_acumulado));
	}
}