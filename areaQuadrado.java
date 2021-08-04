import java.util.Scanner;

public class areaQuadrado {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valorLado;
        
        System.out.println("Digite o tamanho do lado do quadrado: ");
        valorLado = teclado.nextDouble();

        System.out.println("Area do quadrado = " + valorLado * valorLado);
    }
}