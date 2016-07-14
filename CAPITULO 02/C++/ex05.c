#include <stdio.h>
int main(){
    int num1,num2,num3,num4;
    printf("Digite 3 numeros aleatorios e em ordem crescente: ");
    printf("Digite o num1");
    scanf("%d%*c",&num1);
    printf("Digite o num2");
    scanf("%d%*c",&num2);
    printf("Digite o num3");
    scanf("%d%*c",&num3);
    printf("Digite um numero qualquer:  ");
    scanf("%d%*c",&num4);
    if(num1>num2 &&  num2>num3 && num3>num4 && num2>num4)
        printf("ordem descrescente %d, %d, %d e %d",num1,num2,num3,num4);
    else if(num2>num1 && num2>num3 && num3>num4 && num1>num4 && num1>num3)
        printf("ordem descrescente %d, %d, %d e %d",num2,num1,num3,num4);
    else if(num3>num1 && num3>num2 && num3>num4 && num1>num2 && num2>num4)
        printf("ordem descrescente %d, %d, %d e %d",num3,num1,num2,num4);
    else if(num4>num3 && num4>num2 && num4>num1 && num1>num2 && num1>num3 && num2>num3)
        printf("ordem descrescente %d, %d, %d e %d",num4,num1,num2,num3);
    else if (num4>num3 && num4> num2 && num4>num1 && num2>num1 && num2>num3)
        printf("ordem descrescente %d, %d, %d e %d",num3,num2,num1,num3);
    else if(num4>num2 && num4>num3 && num4>num1 && num3>num2 && num2>num1)
        printf("ordem descrescente %d, %d, %d e %d",num4,num3,num2,num1);
    else
    printf("ordem descrescente %d, %d, %d e %d",num4,num3,num1,num2);
    return 0;
}
