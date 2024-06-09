package Quadrado;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = null;
        int opcao = -1;
        double valor = 0;

        while (opcao != 0) 
        {
            System.out.println
            (
                "Selecione a opção desejada:"
                + "\n1- Criar um quadrado"
                + "\n2- Criar um quadrado informando o lado"
                + "\n3- Criar um quadrado informando o perímetro"
                + "\n4- Criar um quadrado informando a área"
                + "\n5- Criar um quadrado informando a diagonal"
                + "\n6- Imprimir valores"
                + "\n0- Sair"
            );

            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    quadrado = new Quadrado();
                    System.out.println("Quadrado criado com sucesso!");
                    break;
                
                case 2:
                    System.out.println("Informe o lado do quadrado: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(valor);
                    System.out.println("Quadrado criado com sucesso!");
                    break;

                case 3:
                    System.out.println("Informe o perímetro do quadrado: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(0, valor);
                    System.out.println("Quadrado criado com sucesso!");
                    break;

                case 4:
                    System.out.println("Informe a área do quadrado: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(1, valor);
                    System.out.println("Quadrado criado com sucesso!");
                    break;

                case 5:
                    System.out.println("Informe a diagonal do quadrado: ");
                    valor = scanner.nextDouble();
                    quadrado = new Quadrado(2, valor);
                    System.out.println("Quadrado criado com sucesso!");
                    break;

                case 6:
                    if(quadrado != null)
                    {
                        System.out.println
                        (
                            "Lado: " + quadrado.getLado()
                            + "\nPerímetro: " + quadrado.perimetro() 
                            + "\nÁrea: " + quadrado.area()
                            + "\nDiagonal: " + quadrado.diagonal()
                        );
                    }
                    else
                    {
                        System.out.println("Quadrado não foi criado!");
                    }
                    break;
            }
        }

        scanner.close();
    }
}
