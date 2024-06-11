#include <stdio.h>
#include "A.h"

A::A() {
    printf("\nConstrutor A");
    a = 'a';
    B::d = '1';
    C::d = '1';
}