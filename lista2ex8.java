import java.util.Scanner;

public class lista2ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        double c = scanner.nextInt();


        if (a < b + c && b < a + c && c < a + b) {

        if (a == b && b == c) {
            System.out.println("Equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles.");
        } else {
            System.out.println("Escaleno.");
        }
        } else {
        System.out.println("Não forma um triângulo.");
     }

        scanner.close();

    }
}