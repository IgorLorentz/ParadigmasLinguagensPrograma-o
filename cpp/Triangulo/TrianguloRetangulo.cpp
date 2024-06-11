#include <cmath>
#include "TrianguloRetangulo.h"

TrianguloRetangulo::TrianguloRetangulo(float lado1, float lado2, float lado3) {
        this->lado1 = lado1;
        this->lado2 = lado2;
        this->lado3 = lado3;
    };

bool toleranciaOK(double v1, double v2) 
{
    return ((v1 >= v2 * 0.999) && (v1 <= v2 * 1.001));
}

bool TrianguloRetangulo::trianguloValido2()
{
    double hip = pow(getLado3(), 2);
    double cat = pow(getLado1(), 2) + pow(getLado2(), 2);
    return(toleranciaOK(hip, cat));
}

float TrianguloRetangulo::area2()
{
    return(getLado1() * getLado2() / 2);
}

float TrianguloRetangulo::hipotenusa()
{   
    double lado1Quad = pow(getLado1(), 2);
    double lado2Quad = pow(getLado2(), 2);
    double hipot = sqrt(lado1Quad + lado2Quad);
    return((float) hipot);
}

float TrianguloRetangulo::cateto(float hipot)
{
    return(hipot / sqrt(2));
}