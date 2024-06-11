package Polimorfismo;

public class Esfera extends Figuras{

    Esfera(String nome, double dim1) {
        this.nome = nome;
        this.dim1 = dim1;
    }
    public double area() {
        double area = 0;
        area = 4 * Math.PI * Math.pow(dim1, 2);
        return area;
    }

    public double volume() {
        double volume = 0;
        volume = 4 / 3 * Math.PI * Math.pow(dim1, 3);
        return volume;
    }
    void display(){
        System.out.println(nome + dim1);
    }

}
