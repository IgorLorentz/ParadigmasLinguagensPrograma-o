#include <stdio.h>
#include <iostream>
#include "A.h"

using namespace std;

int main() {
    A a;

    printf("\nAtributo a = %c", a.a);
    std::cout << "\n" << a.b;
    std::cout << "\n" << a.c;

    printf("\nAtributo d = %c", a.A::d);
    printf("\nAtributo d em B = %c", a.B::d);
    printf("\nAtributo d em C = %c", a.C::d);

    return (0);
}