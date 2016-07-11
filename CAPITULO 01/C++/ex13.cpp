#include <stdio.h>

int main()
{
	double pes,jarda,milha,polegada;
	// teM um bug no meu bug problema de IO solved
	printf("Iforme a medida em polegadas : ");
	scanf ("%f%*c",&polegada);
	printf("Iforme a medida em jardas :");
	scanf ("%f*c%f*c",&jarda);
	printf("Iforme a medida em milhas :");
	scanf ("%f*c%f*c",&milha);
	
	pes = 12 * polegada;
	jarda = 3*pes;
	milha = 1.760 * jarda;
	
	printf("Polegadas = %.2f ",polegada,"\nJardas = %.2", jarda,"\nMilha = %.2", milha);
	
	getchar();
	return 0;
}
