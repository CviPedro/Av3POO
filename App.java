public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("----- Menu principal -----");
        System.out.print("\n Escolha uma das opções: ");
        System.out.println("1 - Gerenciar Funcionario");
        System.out.println("2 - Gerenciar Hospede");
        System.out.println("3 - Gerenciar Quarto");
        System.out.println("4 - Gerenciar Produto");
        System.out.println("5 - Gerenciar Reserva");

        escolha = sc.nextInt();
        sc.nextLine();

        switch(escolha){
            case 1:
                Util.gerenciarFuncionario();
                break;
            case 2:
                Util.gerenciarHospede();
                break;
            case 3:
                Util.gerenciarQuarto();
                break;
            case 4:
                Util.gerenciarProduto();
                break;
            case 5:
                Util.gerenciarReserva();
                break;
            case 6:
                System.out.println("Fechando do sistema...");
                sc.close(); 
                return;
            default:
            System.out.println("Opção inválida, tente novamente!");

        }
        
    }
}
