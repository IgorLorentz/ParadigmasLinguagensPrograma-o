package Polimorfismo;

public class Paralelepipedo extends Generica{
    Paralelepipedo(){

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
}
