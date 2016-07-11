import java.io.*;
import java.util.*;
import java.text.*;
public class ex4{
	public static void main(String[]args){
	double sal,novo_sal,sal_atual;
	Scanner dado;
	dado = new Scanner (System.in);
	System.out.println("Digite o salario atual do funcionario ");
	sal = dado.nextDouble();
	novo_sal = sal*0.25;
	sal_atual = sal+novo_sal;
	DecimalFormat cs;
	cs = new DecimalFormat("0.00");
	System.out.println("O novo salario do funcionario com aumento de 25% e de "+cs.format(sal_atual));
	}
}