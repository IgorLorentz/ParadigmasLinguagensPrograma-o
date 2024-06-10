package Polimorfismo;

public class Paralelepipedo extends Figuras{
    Paralelepipedo(String nome, int dim1, int dim2, int dim3){
        this.nome = nome;
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }
    public double volume(double dim1, double dim2, double dim3) {
        double volume;
        volume = dim1 * dim2 * dim3;
        return volume;
    }

    public double area(double dim1, double dim2, double dim3) {
        double area;
        area = (2 * dim1 * dim2) + (2 * dim1 * dim3) + (2 * dim2 * dim3);
        return area;
    }
    void display(){
        System.out.println(nome + dim1 + dim2 + dim3);
    }
}
