import java.util.Scanner;

public class Uri1060 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double X;
        int Y = 0;

        for (int c = 1; c <= 6; c++) {
            X = teclado.nextDouble();
            if (X > 0) {
                Y++;
            }
        }
        System.out.println(Y + " valores positivos");
    }
}