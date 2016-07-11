import java.io.*;
import java.util.*;
import java.text.*;
public class ex7{
	public static void main(String[]args){
		double sal_base, grat, desc, sal_receber;
		Scanner dado;
		dado =  new Scanner (System.in);
		System.out.println("Digite o valor do salario base do funcionario :");
		sal_base = dado.nextDouble();
		grat = 50;
		desc = sal_base * 0.10;
		sal_receber = sal_base + grat + desc;
		DecimalFormat cs;
		cs = new DecimalFormat("0.00");
		System.out.println("O valor do salario do funcionario e de "+cs.format(sal_receber));
	}
}