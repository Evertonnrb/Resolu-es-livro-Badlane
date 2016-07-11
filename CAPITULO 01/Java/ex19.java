import java.util.*;
import java.io.*;
public class ex19{
	public static void main(String[]args){
		int x,y,z;
		float k;
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite a altura do degrau (em centimetros):");
		x = dado.nextInt();
		System.out.println("Digite a altura que deseja alcançar (em metros): ");
		y = dado.nextInt();
		z = y * 1000;
		k =  z/x;
		System.out.println(" "+k);
	}
}