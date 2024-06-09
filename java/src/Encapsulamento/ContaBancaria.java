package Encapsulamento;

public class ContaBancaria 
{
    private String nomeCliente;
    private int numeroConta;
    private char tipoConta;
    private double saldo;

    ContaBancaria(){}

    ContaBancaria(String nomeCliente, int numeroConta, char tipoConta, double saldo)
    {
        setNomeCliente(nomeCliente);
        setNumeroConta(numeroConta);
        setSaldo(saldo);

        if(tipoConta == 'P' || tipoConta == 'C')
        {
            setTipoConta(tipoConta);
        }
        else
        {
            setTipoConta('P');
        }
    }

    public String getNomeCliente() 
    {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() 
    {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) 
    {
        this.numeroConta = numeroConta;
    }

    public char getTipoConta() 
    {
        return tipoConta;
    }

    public void setTipoConta(char tipoConta) 
    {
        if(tipoConta == 'P' || tipoConta == 'C')
        {
            this.tipoConta = tipoConta;
        }
        else
        {
            System.out.println("Valor inválido, use somente 'P' para conta poupança e 'C' para conta corrente");
        }
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    @Override
    public String toString() 
    {
        return "Nome do cliente: " + getNomeCliente() + 
        "\nNúmero da conta: " + getNumeroConta() +
        "\nTipo da conta: " + getTipoConta() +
        "\nSaldo: " + getSaldo(); 
    }
}
