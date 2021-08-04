import java.util.Scanner;

public class Uri1048 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double X, Y, Z;

        X = teclado.nextDouble();

        if (X >= 0 && X <= 400) {
          Y = 1.15;
        }
        else if (X <= 800) {
          Y = 1.12;
        }
        else if (X <= 1200) {
          Y = 1.10;
        }
        else if (X <= 2000) {
          Y = 1.07;
        }
        else {
          Y = 1.04;
        }

        Z = X * Y;
        X = Z - X;

        System.out.printf("Novo salario: %.2f\n", Z);
        System.out.printf("Reajuste ganho: %.2f\n", X);
        System.out.printf("Em percentual: %.0f %%\n", ((Y-1)*100));
    }
}