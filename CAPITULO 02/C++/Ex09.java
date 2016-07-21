import java.io.*;
import java.util.*;
import java.time.*;

public class Ex09{
	public static void main(String[]args){
		int dia,mes,ano,hora,min;
	/*	Scanner pt = new Scanner(System.in);
		System.out.println("Digite que dia é hoje ");
		dia = pt.nextInt();
		System.out.println("Digite o mês");
		mes = pt.nextInt();
		if(mes == 1)
			System.out.println("Janeiro");
			if(mes == 2)
				System.out.println("Fevereiro");
				if(mes == 3)
					System.out.println("Março");
					if(mes ==4)
						System.out.println("abril");
						if(mes==5)
							System.out.println("Maio");
							if(mes ==6)
								System.out.println("Junho");
								if(mes==7)
									System.out.println("Julho");
									if(mes==8)
										System.out.println("Agosto");
										if(mes==9)
											System.out.println("setembro");
											if(mes==10)
												System.out.println("Outubro");
												if(mes==11)
													System.out.println("Novembro");
													if(mes==12)
														System.out.println("Dezembro");
		System.out.println("Digite o ano :");
		ano = pt.nextInt();
		System.out.println("Digite a hora" );
		hora = pt.nextInt();
		System.out.println("Digite os minutos");
		min = pt.nextInt();
		*/
			Calendar cal = Calendar.getInstance();
			Date d = new Date();
			cal.setTime(d);
			dia = cal.get(Calendar.DAY_OF_MONTH);
			mes = cal.get(Calendar.MONTH)+1;
			ano = cal.get(Calendar.YEAR);
			hora = cal.get(Calendar.HOUR);
			min = cal.get(Calendar.MINUTE);
		System.out.println(dia+"/"+mes+"/"+ano);
		System.out.println(hora+":"+min);
		
		//Utilizando a classe date para setar a hora e a data do sistema
		
	
		
	}
}