#include <stdio.h>
#include <locale.h>
int main(){
int dia1,mes1,ano1,dia2,mes2,ano2;
printf("Digite duas datas distintas quaisquer\n");
printf("Digite primeiro o dia :");
scanf("%d%*c",&dia1);
printf("Digite o mes :");
scanf("%d%*c",&mes1);
printf("Digite o ano :");
scanf("%d%*c",&ano1);
printf("Digite outra data\n");
printf("Digite primeiro o dia :");
scanf("%d%*c",&dia2);
printf("Digite o mes :");
scanf("%d%*c",&mes2);
printf("Digite o ano ");
scanf("%d%*c",&ano2);
if(dia1>dia2 || mes1>mes2 || ano1>ano2)
    printf("Primeira data digitada maior");
else
    printf("Segunda data digita maior");
    system("pause");
return 0;
}
