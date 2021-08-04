import java.util.Scanner;

public class Uri1068 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X, c = 0;

        X = teclado.nextInt();

        while (c < 6) {
            if (X % 2 != 0) {
                System.out.println(X);
                c++;
            }
            X++;
        }
    }
}