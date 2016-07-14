#include <stdio.h>
int main(){
    int a,b,c,i;
    printf("Digite um numero :");
    scanf("%d%*c",&a);
    printf("Digite um numero :");
    scanf("%d%*c",&b);
       printf("Digite um numero :");
    scanf("%d%*c",&c);
    printf("Digite um valor entre 1 e 3");
    scanf("%d%*c",&i);
   if (i==1){
    if(a>b && b>c)
    printf("Ordem decrescente %d, %d e %d",c,b,a);
    else if (b>a && b>c)
    printf("Ordem decrescente %d, %d e %d",b,c,a);
    else if(c>a && c>b && b>a)
    printf("Ordem decrescente %d, %d e %d",b,a,c);
    else
        printf("Ordem decrescente %d, %d e %d",a,b,c);
   }
   else if(i==2){
    if(a>b && b>c)
    printf("Ordem crescente %d, %d e %d",c,b,a);
    else if (b>a && b>c)
    printf("Ordem crescente %d, %d e %d",a,c,b);
    else if(c>a && c>b && b>a)
    printf("Ordem crescente %d, %d e %d",c,a,b);
    else
    printf("Ordem crescente %d, %d e %d",c,b,a);
   }
   else if(i==3){
    if(a>b && a>c)
        printf("%d, %d, %d",b,a,c);
    else if(b>a && b>c)
        printf("%d, %d, %d",a,b,c);
    else
        printf("%d, %d, %d",a,c,b);
   }
    return 0;
}
