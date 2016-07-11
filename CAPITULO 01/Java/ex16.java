import java.util.*;
import java.*;
import java.text.*;
public class ex16{
	public static void main(String[]args){
		int horas;
		double sal_min,sal_receber,hora_tra,sal_bruto,imp;
		
		Scanner dado = new Scanner (System.in);
		DecimalFormat cs = new DecimalFormat("0.00");
		System.out.println("Digote o numero de horas trabalhadas ");
		horas = dado.nextInt();
		System.out.println("Digite o valor do salario minímo :");
		sal_min = dado.nextDouble();
		hora_tra = sal_min /2;
		sal_bruto = horas*hora_tra;
		imp = sal_bruto*0.3;
		sal_receber = sal_bruto - imp;
		System.out.println("Salario total "+sal_receber);
	}
}