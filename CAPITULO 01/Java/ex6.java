import java.io.*;
import java.util.*;
import java.text.*;
public class ex6{
	public static void main(String[]args){
		double sal_base,sal_grat,sal_desc,sal_receber;
		Scanner dado;
		dado = new Scanner (System.in);
		System.out.println("Digite o salario base do funcionario :");
		sal_base = dado.nextDouble();
		sal_grat = sal_base * 0.5;
		sal_desc = sal_base * 0.7;
		sal_receber = sal_base+sal_grat-sal_desc;
		DecimalFormat cs;
		cs = new DecimalFormat ("0.00");
		System.out.println("Salario a receber e de "+cs.format(sal_receber));
	}
}