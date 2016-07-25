import java.util.*;
import java.io.*;
import java.text.*;

public class ex13{
	public static void main(String[]args){
		int cod;
		double aum,sal,novo_sal;
		Scanner pt = new Scanner (System.in);
		DecimalFormat cs = new DecimalFormat("0.00");
		System.out.println("Digite o codigo do funcionario");
		System.out.println("1-Escrituário\n2-Secretária\n3-Caixa\n4-Gerente\n5-Diretor\n");
		cod = pt.nextInt();
		if (cod >= 6){
			System.out.println("Codigo inválido");
		}
		else{
			if (cod == 1){
				System.out.println("Digite o valor do seu salario atual :");
				sal = pt.nextDouble();
				aum = sal * 0.5;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cs.format(aum)+" seu novo salario e de "+cs.format(novo_sal));
			}
			else if (cod == 2){
				System.out.println("Digite o valor do seu salario atual :");
				sal = pt.nextDouble();
				aum = sal * 0.35;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cs.format(aum)+" seu novo salario e de "+cs.format(novo_sal));
			}
			else if (cod == 3){
				System.out.println("Digite o valor do seu salario atual :");
				sal = pt.nextDouble();
				aum = sal * 0.2;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cs.format(aum)+" seu novo salario e de "+cs.format(novo_sal));
			}
			else if (cod == 4){
				System.out.println("Digite o valor do seu salario atual :");
				sal = pt.nextDouble();
				aum = sal * 0.5;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cs.format(aum)+" seu novo salario e de "+cs.format(novo_sal));
			}
			else if (cod == 5){
				System.out.println("Categoria sem aumento");
			}
		}
	}
}