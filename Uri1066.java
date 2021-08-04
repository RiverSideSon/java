import java.util.Scanner;

public class Uri1066 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X, P = 0, I = 0, M = 0, N = 0;

        for (int c = 1; c <= 5; c++) {
            X = teclado.nextInt();
            if (X > 0) {
                M++;
            }
            else if (X < 0) {
                N++;
            }

            if (X % 2 == 0) {
                P++;
            }
            else {
                I++;
            }
        }
        System.out.println(P+" valor(es) par(es)");
        System.out.println(I+" valor(es) impar(es)");
        System.out.println(M+" valor(es) positivo(s)");
        System.out.println(N+" valor(es) negativo(s)");
    }
}