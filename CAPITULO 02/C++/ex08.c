#include<stdio.h>
#include <math.h>
int main(){
int opc,sum,num1,num2;
float raiz,num3;
printf("Selecione uma opcao \n1-Para somar dois numeros:  \n2-Para radiciacao: ");
scanf("%d%*c",&opc);
switch (opc){
case 1:
    printf("Digite um numero :");
    scanf("%d%*c",&num1);
    printf("Digite um numero :");
    scanf("%d%*c",&num2);
    sum = num1+num2;
    printf("A soma dos numeros e %d",sum);
    break;
case 2:
    printf("Digite um numero :");
    scanf("%f%*c",&num3);
    raiz = sqrt(num3);
    printf("A raiz e %f",raiz);
    break;
default:
    printf("Opcao invalida");
    break;
    return 0;
}
}
