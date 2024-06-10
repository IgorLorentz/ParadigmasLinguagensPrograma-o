package Polimorfismo;
import java.util.Scanner;
public class Figuras_Main {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);
        while (opcao != 0)
        {
            System.out.println
                    (
                            "Selecione a opção desejada:"
                                    + "\n1- Esfera"
                                    + "\n2- Cilindro"
                                    + "\n3- Cone"
                                    + "\n4- Paralelepipedo"
                                    + "\n0- Sair"
                    );

            opcao = scanner.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Quadrado criado com sucesso!");
                    quadrado = new Esfera();

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

                
            }
        }

    }
}
