#include <cmath>
#include <iostream>
#include "Figuras.h"

class Cone : public Figuras {
public:
    Cone(std::string nome, double dim1, double dim2, double dim3) : Figuras(nome, dim1, dim2, dim3) {}

    double volume() override {
        return (1.0 / 3) * M_PI * std::pow(dim1, 2) * dim3;
    }

    double area() override {
        return M_PI * std::pow(dim1, 2) + M_PI * dim1 * dim2;
    }

    void display() override {
        std::cout << nome << ": Raio = " << dim1 << ", Altura = " << dim2 << ", Geratriz = " << dim3 << std::endl;
    }

    void aumentar() override {
        dim1 *= aumento;
        dim2 *= aumento;
        dim3 *= aumento;
    }
};