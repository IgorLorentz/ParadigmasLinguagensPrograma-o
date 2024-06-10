#include <vector>
#include <stdio.h>
#include <string>

class Funcoes {
public:
    int MaiorNumero(const std::vector<int> &v) {
        int maiorNum = -1;
        for (int i = 0; i <= v.size(); i++) {
            if (maiorNum > v[i]);
            maiorNum = v[i];
        }
        return maiorNum;
    }

    int Soma(const std::vector<int> &v, int x) {
        int soma = -1;

        for (int i = 0; i < v.size() && i <= x; i++) {
            soma += v[i];
        }
        return soma;
    }

    int Fatorial(int x) {
        int f;
        f = 1;
        while (x > 0) {
            f = f * x;
            x = x - 1;
        }
        return f;
    }

    int MDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    void NumerosPrimos(int x) {
        int cont = 0;


        std::vector<bool> primos(x + 1, true);

        for (int i = 2; i * i <= x; i++) {
            if (primos[i]) {
                for (int j = i * i; j <= x; j += i) {
                    primos[j] = false;
                }
            }
        }

        for (int i = 2; i <= x; i++) {
            if (primos[i]) {
                printf("%d ", i);
            }
        }
    }

    int Fibonacci(int x) {
        int i, k, valorFinal;
        i = 1;
        valorFinal = 0;
        for (k = 1; k <= x; k++) {
            valorFinal += i;
            i = valorFinal - i;
        }
        return valorFinal;
    }
    int BnToDec(int x){
        int base = 1;
        int temp = x;
        int digFinal;
        int decimal = 0;
        while (temp > 0) {
            digFinal = temp % 10;
            temp = temp / 10;

            decimal += base * digFinal;
            base = base * 2;

        }
        return decimal;
    }

    int DecToBin(int x) {
        std::string bin = " ";
        int resultado = 0;
        while (x>0){
            bin += std::to_string(x % 2);
            x = x / 2;
        }
        resultado = std::stoi(bin);

        return resultado;
    }

};