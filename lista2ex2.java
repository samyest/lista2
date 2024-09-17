import java.util.Scanner;

public class lista2ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int X = scanner.nextInt();
        
       if (X % 2==0) {
        System.out.println("Seu valor é par");
       } else {
        System.out.println("Seu valor é ímpar");

       }

        scanner.close();

    }
}