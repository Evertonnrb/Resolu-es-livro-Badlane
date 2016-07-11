import java.io.*;
import java.util.*;

public class ex9{
	public static void main(String[]args){
		float base,altura,area;
		Scanner io;
		io = new Scanner(System.in);
		System.out.println("Informe o valor da base do triangulo ");
		base = io.nextFloat();
		System.out.println("Informe a altura do triangulo: ");
		altura = io.nextFloat();
		area = (base*altura)/2;
		System.out.println("O valor da area do triangulo e de "+area);
	}
}