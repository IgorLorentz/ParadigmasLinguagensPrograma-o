package Polimorfismo;

public class Cone extends Figuras{

    Cone(String nome, double dim1, double dim2, double dim3) {
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    public double volume(double dim1, double dim3) {
        double volume;
        volume = 1 / 3 * Math.PI * Math.pow(dim1, 2) * dim3;
        return volume;
    }

    public double area(double dim1, double dim2) {
        double area;
        area = (Math.PI * Math.pow(dim1, 2)) + (Math.PI * dim1 * dim2);
        return area;
    }
    void display(){
        System.out.println(nome + dim1 + dim2 + dim3);
    }
}
