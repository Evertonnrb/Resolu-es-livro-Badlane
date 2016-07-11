import java.util.*;
import java.io.*;
import java.text.*;
public class ex17{
	public static void main (String[]args){
	
		double deposito,cheque1,cheque2,saldo,cpmf,cpmf1,cpmf2,cpmfTotal;
		Scanner dado = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Digite o valor do deposito :");
		deposito = dado.nextDouble();
		System.out.println("Digite o valor do primeiro cheque emitido :");
		cheque1 = dado.nextDouble();
		System.out.println("Digite o valor do segundo cheque emitido :");
		cheque2 = dado.nextDouble();
		cpmf = 0.38;
		cpmf1 = cheque1 * cpmf / 100;
		cpmf2 = cheque2 * cpmf /100;
		cpmfTotal = cpmf1 + cpmf2;
		saldo = deposito - cheque1 - cheque2 - cpmfTotal;
		System.out.println(" "+df.format(saldo));
		
	}
}