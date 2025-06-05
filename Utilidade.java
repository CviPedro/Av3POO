
import java.util.Scanner;

public class Utilidade{
    public static void gerenciarFuncionario(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Funcionario -----");
        System.out.println("1 - ADD Funcionario");
        System.out.println("2 - Editar Funcionario");
        System.out.println("3 - Listar Funcionario");
        System.out.println("4 - Consultar Funcionario");
        System.out.print("\n Escolha uma das opções: ");

        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                Funcionario f = new Funcionario("", "", "", 1);
                for (Funcionario func : f.listar()) {
                    func.mostrar(); 
                }

            }
            break;
            case 2:
                System.out.println("Editar() não foi cadastrada");
                break;
            case 3:{
                Funcionario f = new Funcionario("", "", "", 1);
                f.listar();
            }
            case 4: {
                Funcionario f = new Funcionario("", "", "", 1);
                f.consultar("id");
            }
            
            default:
        }
    }
        public static void gerenciarHospede(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Hospede -----");
        System.out.println("1 - ADD Hospede");
        System.out.println("2 - Editar Hospede");
        System.out.println("3 - Listar Hospede");
        System.out.println("4 - Consultar Hospede");
        System.out.print("\n Escolha uma das opções: ");
        
        opcao = sc.nextInt();
        
        switch(opcao){
            case 1 -> {
                    Hospede h = new Hospede("", "", "", 1);
                    h.inserir();
                
            }
            case 2 ->  {
                System.out.println("Editar() não foi cadastrada");
            }
            case 3 -> {
                Hospede h = new Hospede("", "", "", 1);
                    h.listar();
               
            }
            case 4 -> {
                Hospede h = new Hospede("", "", "", 1);
                    h.consultar("id");
                
            }
            
            default -> {
            }
        }
    }
    
        public static void gerenciarProduto(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Produto -----");
        System.out.println("1 - ADD Produto");
        System.out.println("2 - Editar Produto");
        System.out.println("3 - Listar Produto");
        System.out.println("4 - Consultar Produto");
        System.out.print("\n Escolha uma das opções: ");

        
        opcao = sc.nextInt();
    
        switch(opcao){
            case 1 -> {
                Produto p = new Produto("", 1, 1.0);
                    p.inserir();
                
            }
            case 2 -> System.out.println("Editar() não foi cadastrada");
            case 3 -> {
                Produto p = new Produto("", 1, 1.0);
                    p.listar();
                }
            
            case 4 -> {
                Produto p = new Produto("", 1, 1.0);
                    p.consultar(1);
                
            }
        }
    }

        public static void gerenciarQuarto(){
        int opcao;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----- Menu Quarto -----");
            System.out.println("1 - ADD Quarto");
            System.out.println("2 - Editar Quarto");
            System.out.println("3 - Listar Quarto");
            System.out.println("4 - Consultar Quarto");
            System.out.print("\n Escolha uma das opções: ");
            
            
            
            opcao = sc.nextInt();
        }
        switch(opcao){
            case 1 -> {
                Quarto q = new Quarto("", 1);
                    q.inserir();
                
            }
            case 2 -> System.out.println("Editar() não foi cadastrada");
            case 3 -> {
                Quarto q = new Quarto("", 1);
                q.listar();
            }
            case 4 -> {
                Quarto q = new Quarto("", 1);
                    q.consultar(1);
            }
           
        }
    }


    public static void gerenciarReserva(){
    int opcao;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----- Menu Reserva -----");
            System.out.print("\n Escolha uma das opções: ");
            System.out.println("1 - ADD Reserva");
            System.out.println("2 - Editar Reserva");
            System.out.println("3 - Listar Reserva");
            System.out.println("4 - Consultar Reserva");
            
            opcao = sc.nextInt();
        }
    switch(opcao){
        case 1: {
            Reserva r = new Reserva(1, 1.0, "", "", true, true, null, null);
                    r.inserir();
        }
        break;
        case 2: 
            System.out.println("Editar() não foi cadastrada");
            break;
        case 3: {
            Reserva r = new Reserva(1, 1.0, "", "", true, true, null, null);
                    r.listar();
        }
        break;
        case 4: {
            Hospede h = new Hospede("rg", "cpf", "nome", 20);
            Quarto q = new Quarto("desc", 1);
            Reserva r = new Reserva(1, 1.0, "", "", true, true, q, h);
            r.consultar(1);
        }
        
        default:
    }     
    }
}



