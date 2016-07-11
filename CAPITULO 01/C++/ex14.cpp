#include <stdio.h>
int main ()
{
	int idade,ano_atual,ano_nasci,idade_fut;
	printf("Digite o ano de nascimento :");
	scanf ("%d%*c",&ano_nasci);
	printf("Digite a ano atual: ");
	scanf("%d%*c",&ano_atual);
	idade = ano_atual - ano_nasci;
	idade_fut = (2050 - ano_atual) + idade;
	printf("Idade atual = %d idade em 2050 = %d ",idade,idade_fut);
	getchar();
	return 0;
}
