import java.io.*;
import java.util.*;
import java.text.*;
public class ex5{
	public static void main(String[]args){
		double sal_atual,percent,sal_novo;
		Scanner dado;
		dado = new Scanner (System.in);
		System.out.println("Informe o valor do salario do funcionario :");
		sal_atual = dado.nextDouble();
		System.out.println("Digite o percentual de aumento ");
		percent = dado.nextDouble();
		sal_novo = sal_atual + (sal_atual*(percent/100));
		DecimalFormat cs;
		cs = new DecimalFormat("0.00");
		System.out.println("Valor do salario atualizado e de "+cs.format(sal_novo));
		
	}
}