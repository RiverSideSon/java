import java.util.Scanner;

public class Uri1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int HI, MI, HF, MF, X;

        HI = teclado.nextInt();
        MI = teclado.nextInt();
        HF = teclado.nextInt();
        MF = teclado.nextInt();

        MI = (HI * 60) + MI;
        MF = (HF * 60) + MF;

        X = MF - MI;
        
        if (X <= 0) {
            X = X + (24 * 60);
        }

        System.out.println("O JOGO DUROU "+(X / 60)+" HORA(S) E "+(X % 60)+" MINUTO(S)");
    }
}