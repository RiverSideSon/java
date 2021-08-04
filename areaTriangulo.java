import java.util.Scanner;

public class areaTriangulo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valorBase;
        double valorAltura;
        
        System.out.println("Digite o tamanho da base do triangulo: ");
        valorBase = teclado.nextDouble();

        System.out.println("Digite o tamanho da altura do triangulo: ");
        valorAltura = teclado.nextDouble();

        System.out.println("Area do triangulo = " + (valorBase * valorAltura) / 2);
    }
}