#include<stdio.h>
#include <math.h>
int main()
{
	float base,area,altura;
	printf ("Digite a base e a altura do triangulo: ");
	scanf ("%f%f",&base,&altura);
	area = (base*altura)/2;
	printf ("Area do triangulo e de %f",area);
	getchar ();
	return 0;
}
