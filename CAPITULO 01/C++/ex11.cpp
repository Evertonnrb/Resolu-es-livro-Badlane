#include <stdio.h>
#include <math.h>
int main()
{
	
	float num,quad,cubo,raiz,raiz_cub;
	printf("Digite um numero positivo real e inteiro : ");
	scanf("%f*c",&num);
	printf("\n");
	quad = num*num;
	printf("A numero %.2 ao quadrado eh %.2",num,quad);
	cubo = num*num*num;
	printf("\n");
	printf("A raiz cubica do numero %.2 eh %.2",num,cubo);
	raiz = sqrt(num);
	printf("\n");
	printf("A raiz quadrada do numero %.2f e %.2f",num,raiz);
	printf("\n");
	raiz_cub = cbrt(num);
	printf("A raiz cubica de %.2 eh = %.2",num,raiz_cub);
	getchar();s
	return 0;
}
