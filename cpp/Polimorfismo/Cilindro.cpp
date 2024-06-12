#include <cmath>
#include <iostream>
#include "Figuras.h"

class Cilindro : public Figuras {
public:
    Cilindro(std::string nome, double dim1, double dim2) : Figuras(nome, dim1, dim2) {}

    double volume() override {
        return M_PI * std::pow(dim1, 2) * dim2;
    }

    double area() override {
        return (2 * M_PI * dim1) * (dim1 + dim2);
    }

    void display() override {
        std::cout << nome << ": Raio = " << dim1 << ", Altura = " << dim2 << std::endl;
    }

    void aumentar() override {
        dim1 *= aumento;
        dim2 *= aumento;
    }
};
