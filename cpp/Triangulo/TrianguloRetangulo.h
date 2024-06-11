#ifndef TRIANGULO_RETANGULO_H
#define TRIANGULO_RETANGULO_H

#include <cmath>
#include "Triangulo.h"

class TrianguloRetangulo : public Triangulo
{
    private:
        float lado1;
        float lado2;
        float lado3;

    protected:

    public:
        TrianguloRetangulo(float, float, float);
        bool trianguloValido2();
        float area2();
        float hipotenusa();
        float cateto(float);
};

#endif