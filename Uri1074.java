import java.util.Scanner;

public class Uri1074 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X, Y;
        String T;

        X = teclado.nextInt();

        for (int c = 1; c <= X; c++) {
            Y = teclado.nextInt();
            if (Y % 2 == 0) {
                T = "EVEN";
            }
            else {
                T = "ODD";
            }

            if (Y > 0) {
                T = T + " POSITIVE";
            }
            else if (Y < 0) {
                T = T + " NEGATIVE";
            }
            else {
                T = "NULL";
            }
            System.out.println(T);
        }
    }
}