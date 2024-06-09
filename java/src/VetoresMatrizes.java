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
    }
}
