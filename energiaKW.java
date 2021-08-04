import java.util.Scanner;

public class energiaKW {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valorSalarioMin;
        double valorKWGasto;
        
        System.out.println("Digite o valor do salario mínimo: ");
        valorSalarioMin = teclado.nextDouble();

        System.out.println("Digite o valor de KW: ");
        valorKWGasto = teclado.nextDouble();

        System.out.println("Valor de cada KW = " + valorSalarioMin*1/7/100);
        System.out.println("Valor a ser pago = " + valorSalarioMin*1/7/100*valorKWGasto);
        System.out.println("Valor a ser pago com desconto de 10% = " + valorSalarioMin*1/7/100*valorKWGasto*0.9);
    }
}