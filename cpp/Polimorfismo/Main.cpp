#include <iostream>
#include <ClasseA.h>
#include <ClasseA1.h>
#include <ClasseA2.h>
#include <ClasseA3.h>


using namespace std;

int main()
{
    double x;
    cout << "Informe o valor de X: ";
    cin >> x;

    ClasseA* prtA[3];

    ClasseA1 a1;
    prtA[0] = &a1;

    ClasseA2 a2;
    prtA[1] = &a2;

    ClasseA3 a3;
    prtA[2] = &a3;

    for (int i = 0; i < 3; i++)
    {
        cout << i << " : " << prtA[i]->calculo(x) << endl;
    }
    
    cout << "\n\n>>> FIM DE EXECUCAO <<< \n\n";

    return 0;
}
