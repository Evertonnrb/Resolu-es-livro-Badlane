#include <stdio.h>
int main ()
{
	int polegada,jarda,pes;
	float milha;
	printf ("Digite um valor em pes ");
	scanf("%d%*c",&pes);
	polegada = pes *12;
	jarda = pes /3;
	milha = (pes/3)/1760;
	printf("Valor digitado em polegadas = %d em jardas = %d em milhas = %f",polegada,jarda,milha);
	getchar();
	return 0;
}
