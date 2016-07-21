#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
int main(){
int hr_ini,min_ini,hr_fim,min_fim,total,hr_min,min,convert;
    printf("Digite a hora do ínicio do jogo\n",setlocale(LC_ALL,""));//usando caracteres especiais
    printf("Informe a hora e os minutos do início do jogo: ");
    scanf("%d%*c%d%*c",&hr_ini,&min_ini);
    printf("Informe a hora e os minutos do termino do jogo :");
    scanf("%d%*c%d%*c",&hr_fim,min_fim);
    //theres a bug on my bug
    hr_min = ((hr_ini*60)-(hr_fim*60));
    min = min_ini - min_fim;
    convert = hr_min/60;
    total = convert+min;
    printf(" ",total);
    system("pause");
    return 0;
}
