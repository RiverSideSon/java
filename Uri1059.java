import java.util.Scanner;

public class Uri1059 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        for (int c = 1; c <= 100; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}