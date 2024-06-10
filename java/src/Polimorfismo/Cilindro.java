package Polimorfismo;

public class Cilindro {

    Cilindro() {

    }

    public double volume(double dim1, double dim2) {
        double volume;
        volume = Math.PI * Math.pow(dim1, 2) * dim2;
        return volume;
    }

    public double area(double dim1, double dim2) {
        double area;
        area = (2 * Math.PI * dim1) * (dim1 + dim2);
        return area;
    }
}
