import java.util.Scanner;

public class Uri1067 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X;

        X = teclado.nextInt();

        for (int c = 1; c <= X; c++) {
            if (c % 2 != 0) {
                System.out.println(c);
            }
        }
    }
}