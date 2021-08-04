import java.util.Scanner;

public class areaTrapezio {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valorBaseMaior;
        double valorBaseMenor;
        double valorAltura;
        
        System.out.println("Digite o tamanho da base menor do trapezio: ");
        valorBaseMenor = teclado.nextDouble();

        System.out.println("Digite o tamanho da base maior do trapezio: ");
        valorBaseMaior = teclado.nextDouble();

        System.out.println("Digite o tamanho da altura do trapezio: ");
        valorAltura = teclado.nextDouble();

        System.out.println("Area do trapezio = " + (valorBaseMaior + valorBaseMenor) * valorAltura / 2);
    }
}