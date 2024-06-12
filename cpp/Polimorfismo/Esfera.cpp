#include <cmath>
#include <iostream>
#include "Figuras.h"

class Esfera : public Figuras {
public:
    Esfera(std::string nome, double dim1) : Figuras(nome, dim1) {}

    double area() override {
        return 4 * M_PI * std::pow(dim1, 2);
    }

    double volume() override {
        return (4.0 / 3) * M_PI * std::pow(dim1, 3);
    }

    void display() override {
        std::cout << nome << ": Raio = " << dim1 << std::endl;
    }

    void aumentar() override {
        dim1 *= aumento;
    }
};
