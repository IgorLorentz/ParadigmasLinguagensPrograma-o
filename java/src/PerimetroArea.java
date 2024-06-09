import java.util.Scanner;

public class PerimetroArea {

    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        int raio;
        double perim;
        double area;

        System.out.println("Entre com o valor do raio:");
        raio = scanner.nextInt();

        perim = 2 * PI * raio;

        area = PI * Math.pow(raio, 2);

        System.out.println("O perímetro da circunferência de raio " + raio + " é " + perim);

        System.out.println("A área é " + area);

        scanner.close();
    }
}
