package Polimorfismo;

public class Figuras {
    public double volumeEsfera() {
        volume = 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    public double areaEsfera() {
        area = 4 * Math.PI * Math.pow(r, 2);
    }

    public double volumeCilindro() {
        volume = Math.PI * Math.pow(r, 2) * h;
    }

    public double areaCilindro() {
        area = (2 * Math.PI * r) * (r + h);
    }

    public double volumeParalelepipedo() {

        volume = base * altura * comprimento;
    }

    public double areaParalelepipedo() {
        area = (2 * altura * base) + (2 * altura * comprimento) + (2 * base * comprimento);
    }

    public double volumeCone() {

        volume = 1 / 3 * Math.PI * Math.pow(r, 2) * h;
    }

    public double areaCone() {
        area = (Math.PI * Math.pow(r, 2)) + (Math.PI * r * g);
    }
}
