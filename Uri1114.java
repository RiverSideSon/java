import java.util.Scanner;

public class Uri1114 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int X;

        while (true) {
            X = teclado.nextInt();
            if (X == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
            else {
                System.out.println("Senha Invalida");
            }
        }
    }
}