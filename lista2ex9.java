import java.util.Scanner;

public class lista2ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("1 unidade de laranja a R$0,30, porém se forem 12 unidades valor passa a ser R$ 0,25 a unidade. Digite o número de laranjas que deseja:");
        int quantidade = scanner.nextInt();
        
        double preco;

        if (quantidade <= 0) {
            System.out.println("Nenhum item esta sendo comprado");
     
            if (quantidade < 12) {
                preco = 0.30;  

            } else {
                preco = 0.25; 
            }
            double valorTotal = quantidade * preco;

            System.out.printf("O valor total da compra é: R$ %.2f\n", valorTotal);
        }

        scanner.close();
    }
}