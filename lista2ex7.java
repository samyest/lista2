import java.util.Scanner;

public class lista2ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total eleitores: ");
        int eleitores = scanner.nextInt();

        System.out.print("Digite o número votos em branco: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int validos = scanner.nextInt();

        System.out.print("Digite o número de votos nulo: ");
        int nulos = scanner.nextInt();

        double percentualBrancos = (votosBrancos * 100.0) / eleitores;
        double percentualNulos = (validos * 100.0) / eleitores;
        double percentualValidos = (nulos * 100.0) / eleitores;
        
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        

        scanner.close();

    }
}