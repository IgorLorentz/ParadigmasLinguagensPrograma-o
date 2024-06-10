
public class Metodos {

    public int MaiorNumero(int v[]) {
        int maiorNum = -1;
        for (int i = 0; i <= v.length; i++) {
            if (maiorNum > v[i]) ;
            maiorNum = v[i];
        }
        return maiorNum;
    }

    public int Soma(int v[], int x) {
        int soma = -1;

        for (int i = 0; i <= v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public int Fatorial(int x) {
        int f;
        f = 1;
        while (x > 0) {
            f = f * x;
            x = x - 1;
        }
        return f;
    }

    //  public int MDC(int x, int y) {

    // }

    public int NumerosPrimos(int x) {
        int cont = 0;

        if (x <= 1)
            return 0;
        boolean[] isPrime = new boolean[x + 1];
        for (int i = 2; i <= x; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= x; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= x; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Conta o número de primos no array
        int primos = 0;
        for (int i = 2; i <= x; i++) {
            if (isPrime[i]) {
                primos++;
            }
        }
        return primos;
    }


    public int Fibonacci(int x) {
        int i, k, valorFinal;
        i = 1;
        valorFinal = 0;
        for (k = 1; k <= x; k++) {
            valorFinal += i;
            i = valorFinal - i;
        }
        return valorFinal;
    }

    public int BnToDec(int x) {
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

    public int DecToBin(int x) {
        String bin = " ";
        int resultado = 0;
        while (x>0){
            bin += x % 2;
            System.out.println(bin);
            x = x / 2;
        }
        resultado = Integer.parseInt(bin);

    return resultado;
    }

   // public int FatoracaoNumerosPrimos() {

   // }

}

