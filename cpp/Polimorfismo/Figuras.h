#include <string>
#ifndef CLASSEA_H
#define CLASSEA_H
class Figuras {
protected:
    std::string nome;
    double dim1;
    double dim2;
    double dim3;
    double aumento = 20;

public:
    virtual double area() = 0;

    virtual double volume() = 0;

    virtual void aumentar() = 0;
};
#endif