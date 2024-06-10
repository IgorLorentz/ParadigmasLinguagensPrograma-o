package Polimorfismo;

public class Esfera {

    Esfera() {

    }

    public double area(double dim1) {
        double area = 0;
        area = 4 * Math.PI * Math.pow(dim1, 2);
        return area;
    }

    public double volume(double dim1) {
        double volume = 0;
        volume = 4 / 3 * Math.PI * Math.pow(dim1, 3);
        return volume;
    }

}
