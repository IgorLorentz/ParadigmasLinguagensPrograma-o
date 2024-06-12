#include <iostream>
#include "Figuras.h"

class Paralelepipedo : public Figuras {
public:
    Paralelepipedo(std::string nome, double dim1, double dim2, double dim3) : Figuras(nome, dim1, dim2, dim3) {}

    double volume() override {
        return dim1 * dim2 * dim3;
    }

    double area() override {
        return 2 * (dim1 * dim2 + dim1 * dim3 + dim2 * dim3);
    }

    void display() override {
        std::cout << nome << ": Comprimento = " << dim1 << ", Largura = " << dim2 << ", Altura = " << dim3 << std::endl;
    }

    void aumentar() override {
        dim1 *= aumento;
        dim2 *= aumento;
        dim3 *= aumento;
    }
};
