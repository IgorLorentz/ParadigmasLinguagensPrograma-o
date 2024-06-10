package Polimorfismo;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de X:");
        int x = scanner.nextInt();
        
        ClasseA prtA[] = new ClasseA[4];

        prtA[0] = new ClasseA();
        prtA[1] = new ClasseA1();
        prtA[2] = new ClasseA2();
        prtA[3] = new ClasseA3();

        for(int i = 0; i < prtA.length; i++) 
        {
            System.out.println(i + " : " + prtA[i].calculo(x));    
        }

        scanner.close();
    }
}
