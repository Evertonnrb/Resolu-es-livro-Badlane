import java.util.*;
import java.io.*;

public class ex13b{
	public static void main(String[]args){
		int jarda,pes,polegadas;
		float milha;
		Scanner dado = new Scanner (System.in);
		System.out.println("Digite uma medida em pes");
		pes = dado.nextInt();
		polegadas = pes * 12;
		jarda = pes / 3;
		milha = (pes / 3)/1760; 
		System.out.println("Valor digitado em polegadas "+polegadas+"\nEm Jardas: "+jarda+" e em milhas " +milha);
	}
}