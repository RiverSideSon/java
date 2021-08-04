import java.util.Scanner;

public class Uri1065 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X, Y = 0;

        for (int c = 1; c <= 5; c++) {
            X = teclado.nextInt();
            if (X % 2 == 0) {
                Y++;
            }
        }
        System.out.println(Y + " valores pares");
    }
}