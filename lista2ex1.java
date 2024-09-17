import java.util.Scanner;

public class lista2ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int X = scanner.nextInt();
        
       if (X > 100) {
        System.out.println("Seu valor é maior do que 100");
       } else {
        System.out.println("Seu valor é menor que 100");

       }

        scanner.close();

    }
}