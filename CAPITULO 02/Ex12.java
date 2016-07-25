import java.util.*;
import java.io.*;
import java.text.*;

public class Ex12{
	public static void main (String[]args){
		int cod;
		double sal,sal_atual,imp,aum,valor_sal;
		Scanner pt = new Scanner (System.in);
		DecimalFormat dc= new DecimalFormat("0.00");
		System.out.println("Digite a op��o desejada\n");
		System.out.println("1-Imposto\n2-Novo Salario\n3-Classifica��o\n");
		cod = pt.nextInt();
		switch (cod){
			case 1:
				System.out.println("Digite o valor do sal�rio para o calc�lo do imposto\n");
				sal = pt.nextDouble();
				if(sal<500){
					imp = sal * 0.5;
					System.out.println("Valor do imposto sobre o salario de "+dc.format(imp));
				}
				else if(sal>=500 && sal<=850){
					imp = sal * 0.1;
					System.out.println("Valor do imposto sobre o salario de "+dc.format(imp));
				}
				else if(sal>850){
					imp = sal * 0.15;
					System.out.println("Valor do imposto sobre o salario de "+dc.format(imp));
				}
			break;
			case 2:
				System.out.println("Digite o valor do salario atual para calc�lo do novo salario\n");
				sal_atual = pt.nextDouble();
				if(sal_atual>1500){
					aum = sal_atual + 25;
					System.out.println("Salario atualizado e de "+dc.format(aum));
				}
				else if(sal_atual>=750 && sal_atual<=1500){
					aum = sal_atual + 50;
					System.out.println("Salario atualizado e de "+dc.format(aum));
				}
				else if (sal_atual>=450 && sal_atual<750){
					aum = sal_atual + 75;
					System.out.println("Salario atualizado e de "+dc.format(aum));
				}
				else if(sal_atual<450){
					aum = sal_atual + 75;
					System.out.println("Salario atualizado e de "+dc.format(aum));
				}
			break;
			case 3:
				System.out.println("Digite o valor do seu salario para calculo de classific��o:\n ");
				valor_sal = pt.nextDouble();
				if(valor_sal<=700)
					System.out.println("Classifica��o mal renumerado\n");
				else
					System.out.println("Classifica��o bem renumerado");
			break;
			default:
				System.out.println("Op��o inv�lida");
			break;
		}
	}
}