#include <stdio.h>
#include <time.h>
int main(){
    time_t t;
    struct tm *data_hora;
    int dia,mes,ano,hora,min,seg;
    //Pega a data atual do sistema
    //Muitos erros
    t = time (null);
    data_hora = localtime(&t);
    dia = data_hora _> tm_mday;
    mes = data_hora _>tm_mon+1;
    ano = data_hora _> tmyear+1900;
    hora = data_hora _> tm_hour;
    min = data_hora _> tm_min;
    return 0;

}
