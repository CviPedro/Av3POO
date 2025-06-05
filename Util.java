public class Util(){
    public static void gerenciarFuncionario(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Funcionario -----");
        System.out.print("\n Escolha uma das opções: " "\n");
        System.out.println("1 - ADD Funcionario");
        System.out.println("2 - Editar Funcionario");
        System.out.println("3 - Listar Funcionario");
        System.out.println("4 - Consultar Funcionario");
        
        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                try{
                    Funcionario.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 2:
                System.out.println("Editar() não foi cadastrada")
                break;
            case 3:{
                try{
                    Produto.listar();
                } catch (IOException e){

                }
            }
            case 4: {
                try{
                    Produto.consultar();
                } catch (IOException e){

                }
            }
            
            default:
        }
    }
        public static void gerenciarFuncionario(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Hospede -----");
        System.out.print("\n Escolha uma das opções: " "\n");
        System.out.println("1 - ADD Hospede");
        System.out.println("2 - Editar Hospede");
        System.out.println("3 - Listar Hospede");
        System.out.println("4 - Consultar Hospede");
        
        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                try{
                    Hospede.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 2: {
                System.out.println("Editar() não foi cadastrada")
                break;
            }
            case 3: {
                try{
                    Hospede.listar();
                } catch (IOException e){

                }
            }
            break;
            case 4: {
                try{
                    Hospede.consultar();
                } catch (IOException e){

                }
            }
            break;
            
            default:
        }
    }
    
        public static void gerenciarProduto(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Produto -----");
        System.out.print("\n Escolha uma das opções: " "\n");
        System.out.println("1 - ADD Produto");
        System.out.println("2 - Editar Produto");
        System.out.println("3 - Listar Produto");
        System.out.println("4 - Consultar Produto");
        
        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                try{
                    Produto.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 2: 
                System.out.println("Editar() não foi cadastrada")
                break;
            case 3:{
                try{
                    Produto.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 4: {
                try{
                    Produto.inserir();
                } catch (IOException e){

                }
            }
            break;
            
            default:
        }
    }
        
        
        public static void gerenciarQuarto(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Quarto -----");
        System.out.print("\n Escolha uma das opções: " "\n");
        System.out.println("1 - ADD Quarto");
        System.out.println("2 - Editar Quarto");
        System.out.println("3 - Listar Quarto");
        System.out.println("4 - Consultar Quarto");
        
        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                try{
                    Quarto.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 2: 
                System.out.println("Editar() não foi cadastrada")
                break;
            case 3: {
                try{
                    Quarto.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 4: {
                try{
                    Quarto.inserir();
                } catch (IOException e){

                }
            }
            
            default:
        }
    }
        public static void gerenciarReserva(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Menu Reserva -----");
        System.out.print("\n Escolha uma das opções: " "\n");
        System.out.println("1 - ADD Reserva");
        System.out.println("2 - Editar Reserva");
        System.out.println("3 - Listar Reserva");
        System.out.println("4 - Consultar Reserva");
        
        opcao = sc.nextInt();

        switch(opcao){
            case 1: {
                try{
                    Reserva.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 2: 
                System.out.println("Editar() não foi cadastrada")
                break;
            case 3: {
                try{
                    Reserva.inserir();
                } catch (IOException e){

                }
            }
            break;
            case 4: {
                try{
                    Reserva.inserir();
                } catch (IOException e){

                }
            }
            
            default:
        }
    }        
}
