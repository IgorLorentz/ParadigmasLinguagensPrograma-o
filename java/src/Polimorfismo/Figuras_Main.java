package Polimorfismo;

import java.util.Scanner;

public class Figuras_Main {
    public static void main(String[] args) {
        int opcao = -1;
        double dim1, dim2, dim3;
        String nome;

        Scanner scanner = new Scanner(System.in);
        while (opcao != 0) {
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

            switch (opcao) {
                case 1:
                    nome = "Esfera";
                    System.out.println("Informe o raio!");
                    dim1 = scanner.nextDouble();
                    Esfera esfera = new Esfera(nome, dim1);

                    esfera.area();
                    esfera.volume();

                    esfera.display();
                    esfera.aumentar();
                    esfera.display();

                    esfera.area();
                    esfera.volume();
                    break;

                case 2:
                    nome = "Cilindro";
                    System.out.println("Informe o raio!");
                    dim1 = scanner.nextDouble();
                    System.out.println("Informe a altura!");
                    dim2 = scanner.nextDouble();
                    Cilindro cilindro = new Cilindro(nome, dim1, dim2);

                    cilindro.area();
                    cilindro.volume();

                    cilindro.display();
                    cilindro.aumentar();
                    cilindro.display();

                    cilindro.area();
                    cilindro.volume();

                    break;

                case 3:
                    nome = "Cone";
                    System.out.println("Informe o raio!");
                    dim1 = scanner.nextDouble();
                    System.out.println("Informe a altura!");
                    dim2 = scanner.nextDouble();
                    System.out.println("Informe a altura!");
                    dim3 = scanner.nextDouble();
                    Cone cone = new Cone(nome, dim1, dim2, dim3);

                    cone.area();
                    cone.volume();

                    cone.display();
                    cone.aumentar();
                    cone.display();

                    cone.area();
                    cone.volume();

                    break;

                case 4:
                    nome = "Paralelepipedo";
                    System.out.println("Informe a base!");
                    dim1 = scanner.nextDouble();
                    System.out.println("Informe a altura!");
                    dim2 = scanner.nextDouble();
                    System.out.println("Informe a profundidade!");
                    dim3 = scanner.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(nome, dim1, dim2, dim3);

                    paralelepipedo.area();
                    paralelepipedo.volume();

                    paralelepipedo.display();
                    paralelepipedo.aumentar();
                    paralelepipedo.display();

                    paralelepipedo.area();
                    paralelepipedo.volume();

                    break;
            }
        }

    }
}
