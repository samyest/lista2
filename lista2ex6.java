import java.util.Scanner;

public class lista2ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        double c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos NÃO podem formar um triângulo.");
        }

        scanner.close();

    }
}