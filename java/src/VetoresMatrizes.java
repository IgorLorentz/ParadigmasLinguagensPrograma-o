import java.util.Arrays;

public class VetoresMatrizes 
{
    static char[] Reverso(char palavra[])
    {
        char[] reverso = new char[palavra.length];
        int cont = 0;

        for(int i = palavra.length - 1; i >= 0; i--) 
        {
            reverso[cont] = palavra[i];
            cont++;
        }

        return reverso;
    }

    static boolean Anagrama(char palavra1[], char palavra2[])
    {
        if (palavra1.length != palavra2.length) 
        {
            return false;
        }

        Arrays.sort(palavra1);
        Arrays.sort(palavra2);


        for(int i = 0; i < palavra1.length; i++) 
        {
            if (palavra1[i] != palavra2[i]) 
            {
                return false;
            }
        }

        return true;
    }

    static char[] CopiaStrs(char palavra1[], char palavra2[])
    {
        char[] copia = new char[palavra1.length];

        for(int i = 0; i < palavra1.length; i++) 
        {
            copia[i] = palavra1[i];    
        }

        return copia;
    }

    static char[] Concatenar(char palavra1[], char palavra2[])
    {
        int tamanhoFinal = palavra1.length + palavra2.length;
        char[] resultado = new char[tamanhoFinal];

        for(int i = 0; i < resultado.length; i++) 
        {
            if(i < palavra1.length)
            {
                resultado[i] = palavra1[i];
            }
            else
            {
                resultado[i] = palavra2[i - palavra1.length];
            }
        }

        return resultado;
    }

    static boolean Palindromo(char palavra[])
    {
        for(int i = 0; i < palavra.length; i++) 
        {
            if(palavra[i] != palavra[(palavra.length - 1) - i])
            {
                return false;
            }    
        }

        return true;
    }

    static void ImprimirChar(String titulo, char palavra[])
    {
        System.out.print(titulo);
        for (char c : palavra) 
        {
            System.out.print(c);
        }
        System.out.println();
    }

    static int[][] MatrizTransposta(int matriz[][])
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int [][] transposta = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) 
        {
           for(int j = 0; j < colunas; j++) 
           {
                transposta[j][i] = matriz[i][j];
           } 
        }

        return transposta;
    }

    static boolean MatrizIdentidade(int matriz[][])
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return false;
        }

        for(int i = 0; i < linhas; i++) 
        {
            for(int j = 0; j < colunas; j++) 
            {
                if(i == j)
                {
                    if(matriz[i][j] != 1)
                    {
                        return false;
                    }
                }
                else
                {
                    if(matriz[i][j] != 0)
                    {
                        return false;
                    }
                }
            }    
        }

        return true;
    }

    static String SomaDiagonais(int matriz[][])
    {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return "";
        }
        
        int diagPrinc = 0;
        int diagSec = 0;

        for(int i = 0; i < linhas; i++) 
        {
            for(int j = 0; j < colunas; j++) 
            {
                if(i == j)
                {
                    diagPrinc += matriz[i][j];
                }

                if(i == (colunas - j) - 1)
                {
                    diagSec += matriz[i][j];
                }
            }    
        }

        return "Diagonal Principal: " + diagPrinc + "\nDiagonal Secundária: " + diagSec;
    }

    static int[][] SomaMatrizes(int matriz1[][], int matriz2[][])
    {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;

        int linhas2 = matriz2.length;
        int colunas2 = matriz2[0].length;

        if(linhas1 != linhas2 || colunas1 != colunas2) 
        {
            return null;
        }
        
        int[][] matrizResultado = new int[linhas1][colunas1];

        for(int i = 0; i < linhas1; i++) 
        {
            for(int j = 0; j < colunas1; j++) 
            {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];  
            }
        }

        return matrizResultado;
    }

    static int[][] MultiplicaMatrizes(int matriz1[][], int matriz2[][])
    {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;

        int linhas2 = matriz2.length;
        int colunas2 = matriz2[0].length;

        if(colunas1 != linhas2) 
        {
            return null;
        }

        int[][] matrizResultado = new int[linhas1][colunas2];
        
        for (int i = 0; i < linhas1; i++) 
        {
            for (int j = 0; j < colunas2; j++) 
            {
                matrizResultado[i][j] = 0;

                for (int k = 0; k < colunas1; k++) 
                {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return matrizResultado;
    }
    
    static void ImprimirMatriz(String titulo, int[][] matriz)
    {
        System.out.println(titulo);

        if(matriz != null)
        {
            for (int i = 0; i < matriz.length; i++) 
            {
                for (int j = 0; j < matriz[i].length; j++) 
                {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("null");
        }
    }
    
    public static void main(String[] args) 
    {
        char[] palavra1 = {'E', 'M', 'A', 'N', 'N', 'U', 'E', 'L'};
        char[] palavra2 = {'I', 'G', 'O', 'R'};
        char[] anagrama1 = {'A', 'M', 'O', 'R'};
        char[] anagrama2 = {'R', 'O', 'M', 'A'};
        char[] copia = null;
        char[] palindromoChar = {'A', 'R', 'A', 'R', 'A'};

        var reverso = Reverso(palavra1);
        ImprimirChar("Reverso: ", reverso);

        var anagrama = Anagrama(anagrama1, anagrama2);
        System.out.println("É anagrama: " + anagrama);
        
        copia = CopiaStrs(palavra1, copia);
        ImprimirChar("Cópia: ", copia);
        
        var concatena = Concatenar(palavra1, palavra2);
        ImprimirChar("Concatena: ", concatena);

        var palindromo = Palindromo(palindromoChar);
        System.out.println("É palíndromo: " + palindromo);

        int[][] matriz1 = {{3, 5}, {7, 9}};
        int[][] matriz2 = {{1, 0}, {0, 1}};
        int[][] matriz3 = {{1, 5, 7}, {1, 7, 1}, {2, 4, 6}};

        var transposta = MatrizTransposta(matriz1);
        ImprimirMatriz("Transposta: ", transposta);

        var identidade = MatrizIdentidade(matriz2);
        System.out.println("É identidade: " + identidade);

        var diagonais = SomaDiagonais(matriz3);
        System.out.println(diagonais);

        var somaMatriz = SomaMatrizes(matriz1, matriz2);
        ImprimirMatriz("Soma: ", somaMatriz);
        
        var multiMatriz = MultiplicaMatrizes(matriz1, matriz2);
        ImprimirMatriz("Multiplicação: ", multiMatriz);
    }
}
