import java.util.Scanner;

public class lista2ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int X1 = scanner.nextInt();
    
        System.out.print("Digite o segundo valor: ");
        int X2 = scanner.nextInt();

       if (X1 < X2) {
        System.out.println("O primeiro valor é menor");
       } else {
        System.out.println("O segundo valor é menor");

       }

        scanner.close();

    }
}