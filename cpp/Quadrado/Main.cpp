#include <iostream>
#include <limits>
#include "Quadrado.h"

using namespace std;

int main() 
{
    int opcao = -1;
    double valor = 0;
    Quadrado* quadrado = nullptr;

    while (opcao != 0) 
    {
        cout << "Selecione a opção desejada:"
             << "\n1- Criar um quadrado"
             << "\n2- Criar um quadrado informando o lado"
             << "\n3- Criar um quadrado informando o perímetro"
             << "\n4- Criar um quadrado informando a área"
             << "\n5- Criar um quadrado informando a diagonal"
             << "\n6- Imprimir valores"
             << "\n0- Sair" << endl;

        cin >> opcao;

        switch (opcao) {
            case 1:
                quadrado = new Quadrado();
                cout << "Quadrado criado com sucesso!" << endl;
                break;

            case 2:
                cout << "Informe o lado do quadrado: ";
                cin >> valor;
                quadrado = new Quadrado(valor);
                cout << "Quadrado criado com sucesso!" << endl;
                break;

            case 3:
                cout << "Informe o perímetro do quadrado: ";
                cin >> valor;
                quadrado = new Quadrado(0, valor);
                cout << "Quadrado criado com sucesso!" << endl;
                break;

            case 4:
                cout << "Informe a área do quadrado: ";
                cin >> valor;
                quadrado = new Quadrado(1, valor);
                cout << "Quadrado criado com sucesso!" << endl;
                break;

            case 5:
                cout << "Informe a diagonal do quadrado: ";
                cin >> valor;
                quadrado = new Quadrado(2, valor);
                cout << "Quadrado criado com sucesso!" << endl;
                break;

            case 6:
                if (quadrado != nullptr) 
                {
                    cout << "Lado: " << quadrado->getLado()
                         << "\nPerímetro: " << quadrado->perimetro()
                         << "\nÁrea: " << quadrado->area()
                         << "\nDiagonal: " << quadrado->diagonal() << endl;
                } else 
                {
                    cout << "Quadrado não foi criado!" << endl;
                }
                break;
        }
    }

    return 0;
}
