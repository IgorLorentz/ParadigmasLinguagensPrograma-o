package Quadrado;

public class Quadrado {
    private double lado;
    
    Quadrado()
    {
        lado = 1;
    }

    Quadrado(double lado)
    {
        this.lado =lado;
    }

    Quadrado(int acao, double valor)
    {
        switch(acao) 
        {
            case 0:
                setLado(valor / 4);
                System.out.println("Valor do lado para o valor do perímetro informado: " + lado);
                break;

            case 1:
                setLado(Math.sqrt(valor));
                System.out.println("Valor do lado para o valor da área informada: " + lado);
                break;

            case 2:
                setLado(valor * Math.sqrt(2));
                System.out.println("Valor do lado para o valor da diagonal informada: " + lado);
                break;
        }
    }

    public boolean ladoValido()
    {
        if (lado > 0) {
            return true;
        }

        return false;
    }

    public double perimetro()
    {
        return 4 * lado;
    }

    public double area()
    {
        return Math.pow(lado, 2);
    }

    public double diagonal()
    {
        return Math.sqrt(Math.pow(lado, 2) * 2);
    }

    public double getLado()
    {
        return lado;
    }

    private void setLado(double novoLado)
    {
        lado = novoLado;
    }
}
