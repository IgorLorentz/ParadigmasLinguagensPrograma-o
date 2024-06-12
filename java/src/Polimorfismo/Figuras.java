package Polimorfismo;

public abstract class Figuras {
    String nome;
    double dim1;
    double dim2;
    double dim3;
    double aumento = 20;

    public abstract double area();

    public abstract double volume();

    public abstract void aumentar();
}
