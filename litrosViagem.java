import java.util.Scanner;

public class litrosViagem {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valorTempo;
        double valorVelMedia;
        
        System.out.println("Digite o tempo gasto na viagem: ");
        valorTempo = teclado.nextDouble();

        System.out.println("Digite o valor da velocidade madia: ");
        valorVelMedia = teclado.nextDouble();

        System.out.println("Litros de combustivel gastos na viagem = " + valorVelMedia * valorTempo / 12);
    }
}