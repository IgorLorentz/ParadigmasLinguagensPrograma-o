#include <iostream>
#include <cmath>

using namespace std;

int main() {
    const double PI = 3.14159;
    int raio;
    double perim;
    double area;

    cout << "Entre com o valor do raio:" << endl;
    cin >> raio;

    perim = 2 * PI * raio;
    area = PI * pow(raio, 2);

    cout << "O perímetro da circunferência de raio " << raio << " é " << perim << endl;
    cout << "A área é " << area << endl;

    return 0;
}
