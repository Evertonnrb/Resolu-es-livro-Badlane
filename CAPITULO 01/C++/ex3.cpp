#include <stdio.h>
int main()

{
	float n1,p1,n2,p2,n3,p3,media;
	printf("Digite a nota da n1 ");
	scanf("%d%*c",&n1);
	printf("Informe o peso da n1");
	scanf("%d%*c",&p1);
	printf("Digite a nota da n2 ");
	scanf("%d%*c",&n2);
	printf("Informe o peso da n2 ");
	scanf("%d%*c",&p2);
	printf("Digite a nota da n3 :");
	scanf("%d%*c",&n3);
	printf("Informe o peso da n3 :");
	scanf("%d%*c",&p3);
	media =  (n1*p1)+(n2*p2)+(n3*p3);
	printf ("A media ponderada das notas e de %2.3f");
	return 0;
}
