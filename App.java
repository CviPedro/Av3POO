
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int escolha;
            System.out.println("----- Menu principal -----");
            System.out.println("1 - Gerenciar Funcionario");
            System.out.println("2 - Gerenciar Hospede");
            System.out.println("3 - Gerenciar Quarto");
            System.out.println("4 - Gerenciar Produto");
            System.out.println("5 - Gerenciar Reserva");
            System.out.print(" Escolha uma das opções: ");
            escolha = sc.nextInt();
            sc.nextLine();
            
            switch(escolha){
                case 1 -> Utilidade.gerenciarFuncionario();
                case 2 -> Utilidade.gerenciarHospede();
                case 3 -> Utilidade.gerenciarQuarto();
                case 4 -> Utilidade.gerenciarProduto();
                case 5 -> Utilidade.gerenciarReserva();
                case 6 -> {
                    System.out.println("Fechando do sistema...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente!");
                
            }
        }
        
    }
}
