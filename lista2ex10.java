import java.util.Scanner;

public class lista2ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Escolha o produto:\n");
        System.out.printf("1 - Banana -> R$ 0,30 cada ou R$ 0,25 se escolher 12 unidades)\n");
        System.out.printf("2 - Laranja -> R$ 0,40 cada ou R$ 0,35 se escolher 12 unidades)\n");
        System.out.printf("3 - Maçã -> R$ 0,50 cada ou R$ 0,45 se escolher 12 unidades)\n");
        System.out.printf("4 - Kiwi -> R$ 0,40 cada ou R$ 0,30 se escolher 12 unidades)\n");
        
        System.out.printf("Escolha o item desejado");
        int produto = scanner.nextInt();
        System.out.printf("Escolha quantidade de itens");
        int quantidade = scanner.nextInt();


        if (quantidade <= 0) {
            System.out.println("Nenhum intem a ser comprado");
        } else {
            double preco = 0.0;
        
            switch (produto) {
                case 1: // Banana
                    if (quantidade < 12) {
                        preco = 0.30;
                    } else {
                        preco = 0.25;
                    }
                    break;
                case 2: // Laranja
                    if (quantidade < 12) {
                        preco = 0.40;
                    } else {
                        preco = 0.35;
                    }
                    break;
                case 3: // Maçã
                    if (quantidade < 12) {
                        preco = 0.50;
                    } else {
                        preco = 0.45;
                    }
                    break;
                case 4: // Kiwi
                    if (quantidade < 12) {
                        preco = 0.40;
                    } else {
                        preco = 0.30;
                    }
                    break;
                default:
                    System.out.println("Produto inválido.");
                    scanner.close();
                    return;  // Sai do programa se o produto for inválido
            }
            
            // Calcula o valor total da compra
            double valorTotal = quantidade * preco;
            
            // Exibe o valor total da compra com duas casas decimais
            System.out.printf("O valor total da compra é: R$ %.2f\n", valorTotal);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}