#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<char> Reverso(const vector<char>& palavra) {
    vector<char> reverso(palavra.size());

    for (int i = palavra.size() - 1, j = 0; i >= 0; i--, j++) {
        reverso[j] = palavra[i];
    }

    return reverso;
}

bool Anagrama(const vector<char>& palavra1, const vector<char>& palavra2) {
    if (palavra1.size() != palavra2.size()) {
        return false;
    }

    vector<char> temp1 = palavra1;
    vector<char> temp2 = palavra2;

    sort(temp1.begin(), temp1.end());
    sort(temp2.begin(), temp2.end());

    return temp1 == temp2;
}

vector<char> CopiaStrs(const vector<char>& palavra1) {
    return palavra1;
}

vector<char> Concatenar(const vector<char>& palavra1, const vector<char>& palavra2) {
    vector<char> resultado;
    resultado.reserve(palavra1.size() + palavra2.size());
    resultado.insert(resultado.end(), palavra1.begin(), palavra1.end());
    resultado.insert(resultado.end(), palavra2.begin(), palavra2.end());
    return resultado;
}

bool Palindromo(const vector<char>& palavra) {
    for (int i = 0; i < palavra.size() / 2; i++) {
        if (palavra[i] != palavra[palavra.size() - 1 - i]) {
            return false;
        }
    }
    return true;
}

void ImprimirChar(const string& titulo, const vector<char>& palavra) {
    cout << titulo;
    for (char c : palavra) {
        cout << c;
    }
    cout << endl;
}

vector<vector<int>> MatrizTransposta(const vector<vector<int>>& matriz) {
    int linhas = matriz.size();
    int colunas = matriz[0].size();

    vector<vector<int>> transposta(colunas, vector<int>(linhas));

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            transposta[j][i] = matriz[i][j];
        }
    }

    return transposta;
}

bool MatrizIdentidade(const vector<vector<int>>& matriz) {
    int linhas = matriz.size();
    int colunas = matriz[0].size();

    if (linhas != colunas) {
        return false;
    }

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            if (i == j && matriz[i][j] != 1) {
                return false;
            } else if (i != j && matriz[i][j] != 0) {
                return false;
            }
        }
    }

    return true;
}

string SomaDiagonais(const vector<vector<int>>& matriz) {
    int linhas = matriz.size();
    int colunas = matriz[0].size();

    if (linhas != colunas) {
        return "";
    }

    int diagPrinc = 0;
    int diagSec = 0;

    for (int i = 0; i < linhas; i++) {
        diagPrinc += matriz[i][i];
        diagSec += matriz[i][colunas - i - 1];
    }

    return "Diagonal Principal: " + to_string(diagPrinc) + "\nDiagonal Secundária: " + to_string(diagSec);
}

vector<vector<int>> SomaMatrizes(const vector<vector<int>>& matriz1, const vector<vector<int>>& matriz2) {
    int linhas1 = matriz1.size();
    int colunas1 = matriz1[0].size();

    int linhas2 = matriz2.size();
    int colunas2 = matriz2[0].size();

    if (linhas1 != linhas2 || colunas1 != colunas2) {
        return {};
    }

    vector<vector<int>> matrizResultado(linhas1, vector<int>(colunas1));

    for (int i = 0; i < linhas1; i++) {
        for (int j = 0; j < colunas1; j++) {
            matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }

    return matrizResultado;
}

vector<vector<int>> MultiplicaMatrizes(const vector<vector<int>>& matriz1, const vector<vector<int>>& matriz2) {
    int linhas1 = matriz1.size();
    int colunas1 = matriz1[0].size();

    int linhas2 = matriz2.size();
    int colunas2 = matriz2[0].size();

    if (colunas1 != linhas2) {
        return {};
    }

    vector<vector<int>> matrizResultado(linhas1, vector<int>(colunas2, 0));

    for (int i = 0; i < linhas1; i++) {
        for (int j = 0; j < colunas2; j++) {
            for (int k = 0; k < colunas1; k++) {
                matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
            }
        }
    }

    return matrizResultado;
}

void ImprimirMatriz(const string& titulo, const vector<vector<int>>& matriz) {
    cout << titulo << endl;

    if (matriz.empty()) {
        cout << "null" << endl;
        return;
    }

    for (const auto& linha : matriz) {
        for (int elemento : linha) {
            cout << elemento << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<char> palavra1 = {'E', 'M', 'A', 'N', 'N', 'U', 'E', 'L'};
    vector<char> palavra2 = {'I', 'G', 'O', 'R'};
    vector<char> anagrama1 = {'A', 'M', 'O', 'R'};
    vector<char> anagrama2 = {'R', 'O', 'M', 'A'};
    vector<char> copia;
    vector<char> palindromoChar = {'A', 'R', 'A', 'R', 'A'};

    auto reverso = Reverso(palavra1);
    ImprimirChar("Reverso: ", reverso);

    auto anagrama = Anagrama(anagrama1, anagrama2);
    cout << "É anagrama: " << std::boolalpha << anagrama << endl;

    copia = CopiaStrs(palavra1);
    ImprimirChar("Cópia: ", copia);

    auto concatena = Concatenar(palavra1, palavra2);
    ImprimirChar("Concatena: ", concatena);

    auto palindromo = Palindromo(palindromoChar);
    cout << "É palíndromo: " << std::boolalpha << palindromo << endl;

    vector<vector<int>> matriz1 = {{3, 5}, {7, 9}};
    vector<vector<int>> matriz2 = {{1, 0}, {0, 1}};
    vector<vector<int>> matriz3 = {{1, 5, 7}, {1, 7, 1}, {2, 4, 6}};

    auto transposta = MatrizTransposta(matriz1);
    ImprimirMatriz("Transposta: ", transposta);

    auto identidade = MatrizIdentidade(matriz2);
    cout << "É identidade: " << std::boolalpha << identidade << endl;

    auto diagonais = SomaDiagonais(matriz3);
    cout << diagonais << endl;

    auto somaMatriz = SomaMatrizes(matriz1, matriz2);
    ImprimirMatriz("Soma: ", somaMatriz);

    auto multiMatriz = MultiplicaMatrizes(matriz1, matriz2);
    ImprimirMatriz("Multiplicação: ", multiMatriz);

    return 0;
}
