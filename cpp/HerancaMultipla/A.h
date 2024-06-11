#ifndef A_H
#define A_H

#include "B.h"
#include "C.h"

class A : public B, public C {
public:
    A();

    char a;
protected:
private:
};

#endif A_H
