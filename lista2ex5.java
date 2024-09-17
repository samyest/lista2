import java.util.Scanner;

public class lista2ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor entre 100 e 200: ");
        int X = scanner.nextInt();

       if (X > 100 && X < 200) {
        System.out.println("O valor está entre o intervalo de 100 e 200");
       } else {
        System.out.println("O valor não está entre o intervalo de 100 e 200");

       }

        scanner.close();

    }
}