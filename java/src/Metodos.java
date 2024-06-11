import java.util.ArrayList;
import java.util.List;

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

    public int MDC(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public List<Integer> NumerosPrimos(int x) {
        List<Integer> primos = new ArrayList<>();
        
        boolean[] ePrimo = new boolean[x + 1];
        for (int i = 2; i <= x; i++) {
            ePrimo[i] = true;
        }

        for (int i = 2; i * i <= x; i++) {
            if (ePrimo[i]) {
                for (int j = i * i; j <= x; j += i) {
                    ePrimo[j] = false;
                }
            }
        }

        for (int i = 2; i <= x; i++) {
            if (ePrimo[i]) {
                primos.add(i);
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
        while (x > 0) {
            bin += x % 2;
            System.out.println(bin);
            x = x / 2;
        }
        resultado = Integer.parseInt(bin);

        return resultado;
    }

    public List<Integer> FatoracaoNumerosPrimos(int x) {
        List<Integer> fatores = new ArrayList<>();

        if (x <= 1) {
            System.out.println("O número deve ser maior que 1.");
            return fatores;
        }

        // Testa os fatores de 2 em diante
        for (int i = 2; i <= x; i++) {
            while (x % i == 0) {
                fatores.add(i);
                x /= i;
            }
        }

        return fatores;
    }

}

