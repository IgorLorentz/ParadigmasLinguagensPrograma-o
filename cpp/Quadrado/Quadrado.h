#ifndef QUADRADO_H
#define QUADRADO_H

#include <cmath>
#include <iostream>

class Quadrado {
private:
    double lado;

    void setLado(double novoLado) {
        lado = novoLado;
    }

public:
    Quadrado() : lado(1) {}

    Quadrado(double lado) : lado(lado) {}

    Quadrado(int acao, double valor) {
        switch (acao) {
            case 0:
                setLado(valor / 4);
                std::cout << "Valor do lado para o valor do perímetro informado: " << lado << std::endl;
                break;
            case 1:
                setLado(std::sqrt(valor));
                std::cout << "Valor do lado para o valor da área informada: " << lado << std::endl;
                break;
            case 2:
                setLado(valor / std::sqrt(2));
                std::cout << "Valor do lado para o valor da diagonal informada: " << lado << std::endl;
                break;
        }
    }

    bool ladoValido() const {
        return lado > 0;
    }

    double perimetro() const {
        return 4 * lado;
    }

    double area() const {
        return std::pow(lado, 2);
    }

    double diagonal() const {
        return lado * std::sqrt(2);
    }

    double getLado() const {
        return lado;
    }
};

#endif
