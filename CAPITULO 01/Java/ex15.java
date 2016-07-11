import java.util.*;
import java.io.*;
import java.text.*;

public class ex15{
	public static void main(String[]args){
		double pr_fabrica,perc_lucro,perc_imp,vr_final;
		Scanner dado = new Scanner (System.in);
		System.out.println("Digite o valor do preço de fabrica do veiculo :");
		pr_fabrica = dado.nextDouble();
		System.out.println("Digite o valor do percentual de lucro do distribuidor; ");
		perc_lucro = dado.nextDouble();
		System.out.println("Digite o valor do percentual de impostos :");
		DecimalFormat cs;
		cs = new DecimalFormat("0.00");
		perc_imp = dado.nextDouble();
		vr_final = pr_fabrica+perc_imp+perc_lucro;
		System.out.println("Valor final do veiculo será de "+cs.format(vr_final));
	}
}