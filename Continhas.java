public class Continhas {
    public static void main(String args[]) {
        int a, b, c;
        a = 23;
        b = 4;
        c = a + b;
        System.out.println("Valor da soma = " + c);
        c = a - b;
        System.out.println("Valor da soma = " + c);
        c = a * b;
        System.out.println("Valor da mult = " + c);
        c = a / b;
        System.out.println("Valor do rest = " + c);

        float x, y, z;
        x = 23.0f;
        y = 3.0f;
        z = x / y;
        System.out.println("Valor do divisão com decimal = " + z);
        System.out.printf("Valor do divisão com decimal 2 decimais = %.2f\n", z);
        System.out.printf("Valor do divisão com decimal 3 decimais = %.3f\n", z);
    }
}