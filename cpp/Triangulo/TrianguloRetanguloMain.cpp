#include <iostream>
#include <stdio.h>
#include "TrianguloRetangulo.h"

using namespace std;

float *entraLados();

void imprimeTriangulo(Triangulo *t);

TrianguloRetangulo *trisRet;

int main() {
    float *lados = entraLados();
    trisRet = new TrianguloRetangulo(lados[0], lados[1], lados[2]);
    imprimeTriangulo(trisRet);
    cout << "Triângulo válido: " << trisRet->trianguloValido2() << endl;
    double hipot = trisRet->hipotenusa();
    cout << "Hipotenusa: " << hipot << endl;
    double cateto = trisRet->cateto(hipot);
    cout << "Catetos: " << cateto << endl;
    cout << "Área: " << trisRet->area2() << endl;
    delete trisRet;

    cout << "\n\n>>> FIM DE EXECUÇÃO\n\n";
    return (0);
}

float *entraLados() {
    float *lados = new float[3];
    cout << "Lado 1 = ";
    cin >> lados[0];
    cout << "Lado 2 = ";
    cin >> lados[1];
    cout << "Lado 3 = ";
    cin >> lados[2];
    return lados;
}

void imprimeTriangulo(Triangulo *t) {
    if (t == NULL) {
        cout << "\n >>> ERRO: OBJETO NULO!";
        return;
    }
    cout << "\nLado1 = " << t->getLado1();
    cout << "\nLado2 = " << t->getLado2();
    cout << "\nLado3 = " << t->getLado3();
    cout << "\nPerimetro = " << t->perimetro();
    cout << "\nArea = " << t->area() << endl;
}