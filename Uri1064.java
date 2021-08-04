import java.util.Scanner;

public class Uri1064 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double X = 0, M = 0;
        int Y = 0;

        for (int c = 1; c <= 6; c++) {
            X = teclado.nextDouble();
            if (X > 0) {
                Y++;
                M = M + X;
            }
        }
        System.out.println(Y + " valores positivos");
        System.out.printf("%.1f\n", M/Y);
    }
}