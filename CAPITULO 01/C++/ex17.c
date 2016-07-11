#include <stdio.h>
int main(){
    float deposito,valor1,valor2,valor_cheque1,valor_cheque2,cpmf,saldo;
    printf("Digite o valor do deposito :");
    scanf("%f%*c",&deposito);
    printf("Digite o valor dos primeiro cheque emitidos: ");
    scanf("%f%*c",&valor1);
    printf("Digite o valor do segundo cheque emitido: ");
    scanf("%f%*c",&valor2);
    cpmf = 0.38;
    valor_cheque1 = valor1 * cpmf / 100;
    valor_cheque2 = valor2 * cpmf / 100;
    saldo = deposito-valor1-valor2-valor_cheque1-valor_cheque2;
    printf("%.2f\n",saldo);

    system("Pause");
    return 0;
}
