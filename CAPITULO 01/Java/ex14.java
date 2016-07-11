import java.util.*;
import java.io.*;

public class ex14{

public static void main(String[]args){
	int idade,ano_atual,ano_nasci,ano_futuro;
	Scanner dado = new Scanner (System.in);
	System.out.println("Digite o ano do seu nascimento: ");
	ano_nasci = dado.nextInt();
	System.out.println("Digite o ano atual : ");
	ano_atual = dado.nextInt();
	idade = ano_atual - ano_nasci;
	ano_futuro = (2050 - ano_atual)+idade;
	System.out.println("Idade atual "+idade+" Idade em 2050 "+ano_futuro);
	}
}