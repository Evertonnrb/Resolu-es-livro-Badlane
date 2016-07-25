import java.io.*;
import java.util.*;
import java.text.*;

public class Ex13B{
	public static void main(String[]args){
		int cod;
		double aum,sal,novo_sal;
		Scanner pt = new Scanner (System.in);
		DecimalFormat cd = new DecimalFormat("0.00");
		System.out.println("Digite o codigo do funcionario");
		System.out.println("1-Escrituário\n2-Secretário\n3-Caixa\n4-Gerente\n5-Diretor\n");
		cod = pt.nextInt();
		switch (cod){
			case 1:
				System.out.println("Digite o valor do seu salário atual: ");
				sal = pt.nextDouble();
				aum = sal * 0.5;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cd.format(aum)+" novo salario de "+cd.format(novo_sal));
				break;
			case 2:
				System.out.println("Digite o valor do seu salário atual: ");
				sal = pt.nextDouble();
				aum = sal * 0.35;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cd.format(aum)+" novo salario de "+cd.format(novo_sal));
				break;
			case 3:
				System.out.println("Digite o valor do seu salário atual: ");
				sal = pt.nextDouble();
				aum = sal * 0.2;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cd.format(aum)+" novo salario de "+cd.format(novo_sal));
				break;
			case 4:
				System.out.println("Digite o valor do seu salário atual: ");
				sal = pt.nextDouble();
				aum = sal * 0.5;
				novo_sal = sal + aum;
				System.out.println("Aumento de "+cd.format(aum)+" novo salario de "+cd.format(novo_sal));
				break;
			case 5:
				System.out.println("Categoria sem renumeração");
				break;
			default:
				System.out.println("Código invalido");
			break;						
		}
	}
}