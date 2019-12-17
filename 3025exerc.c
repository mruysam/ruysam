#include <stdio.h>

int main (){

int a;
int b;
int c;
int resultado, i;

    for (;;) {
    //for (i=0;i>100;i++){
        scanf ("%d",&a);
        b = a/100;
        c = a%100;
        resultado = b + c;

        if (a < 1000 || a > 9999)
            break;

        else if (resultado*resultado == a)
            printf ("propriedade do 3025!\n");

        else
            printf ("numero comum\n");

        }
        return 0;
}
