import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double X, Y, I;

        X = teclado.nextDouble();

        if (X > 2000) {
            X = X - 2000;
            if (X > 1000) {
                I = 1000 * 0.08;
                X = X - 1000;
                if (X > 1500){
                    I = I + (1500 * 0.18);
                    X = X - 1500;
                    I = I + (X * 0.28);
                }
                else{
                    I = I + (X * 0.18);
                }
            }
            else {
                I = X * 0.08;
            }
            System.out.printf("R$ %.2f\n", I);
        }
        else {
            System.out.println("Isento");
        }
    }
}