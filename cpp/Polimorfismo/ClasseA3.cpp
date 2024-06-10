#include <iostream>
#include <math.h>
#include <ClasseA3.h>
#include <ClasseA.h>

double ClasseA3::calculo(double x)
{
    std::cout << "\nCalculo da ClasseA (via ClasseA3): " << ClasseA::calculo(x);
    return (x * 4);
}