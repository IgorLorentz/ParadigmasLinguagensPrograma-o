package Encapsulamento;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2;

        String nomeCliente;
        int numeroConta;
        char tipoConta;
        double saldo;
        
        System.out.println(c1);

        System.out.println("Insira os dados para primeira conta.");

        System.out.println("Nome do cliente: ");
        c1.setNomeCliente(scanner.nextLine());

        System.out.println("Número da conta: ");
        c1.setNumeroConta(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Tipo da conta: ");
        c1.setTipoConta(scanner.nextLine().toUpperCase().charAt(0));

        System.out.println("Saldo: ");
        c1.setSaldo(scanner.nextDouble());

        scanner.nextLine();

        System.out.println(c1);

        System.out.println("Agora vamos iniciar a segunda conta já com os dados.");

        System.out.println("Nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Tipo da conta: ");
        tipoConta = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Saldo: ");
        saldo = scanner.nextDouble();

        c2 = new ContaBancaria(nomeCliente, numeroConta, tipoConta, saldo);

        System.out.println(c2);

        scanner.close();
    }
}
