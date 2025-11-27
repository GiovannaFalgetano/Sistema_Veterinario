import java.util.Scanner;

public class ClientesMenu {
    //atributos
    private Scanner teclado = new Scanner(System.in);
    private ClientesBanco bancoClientes = new ClientesBanco();

    //metodo construtor 
    public ClientesMenu() {
        this.exibir();
    }

    //propriedades 
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("            CLIENTES          ");
            System.out.println("==============================");
            System.out.println("31. Adicionar");
            System.out.println("32. Alterar");
            System.out.println("33. Excluir");
            System.out.println("34. Pesquisar");
            System.out.println("35. Mostrar todos");
            System.out.println("36. Número de clientes cadastrados");
            System.out.println("39. Sair");
            System.out.println("==============================");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // consome o ENTER pendente


            if (opcao == 31) {
                Clientes clientes = new Clientes(); //código gerado
                boolean valido = false;

                do {
                    try {

                    System.out.println("Digite o nome do cliente:");
                    String nome = teclado.nextLine();
                    clientes.setNome(nome);

                    System.out.println("Digite o CPF do cliente:");
                    String cpf = teclado.nextLine();
                    clientes.setCpf(cpf);

                    System.out.println("Digite o email do cliente:");
                    String email = teclado.nextLine();
                    clientes.setEmail(email);

                    System.out.println("Digite a data de cadastro do cliente:");
                    String dataCadastro = teclado.nextLine();
                    clientes.setDataCadastro(dataCadastro);

                    valido = true;
                    } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    }
                } while (!valido);

                bancoClientes.adicionar(clientes);

            } else if (opcao == 32) { // Alterar
                System.out.println("Digite o código do cliente que deseja alterar:");
                int codigo = teclado.nextInt();
                teclado.nextLine(); // consome o ENTER pendente

                Clientes clientes = bancoClientes.pesquisar(codigo);

                if (clientes == null) {
                    System.out.println("Cliente não localizado!");
                } else {
                    boolean valido = false;
                    do {
                        try {
                            System.out.println("Digite o novo nome do cliente:");
                            String novoNome = teclado.nextLine();
                            clientes.setNome(novoNome);

                            System.out.println("Digite o novo CPF do cliente:");
                            String novoCpf = teclado.nextLine();
                            clientes.setCpf(novoCpf);

                            System.out.println("Digite o novo email do cliente:");
                            String novoEmail = teclado.nextLine();
                            clientes.setEmail(novoEmail);

                            System.out.println("Digite a nova data de cadastro do cliente:");
                            String novoDataCadastro = teclado.nextLine();
                            clientes.setDataCadastro(novoDataCadastro);

                            valido = true;
                            System.out.println("Cliente alterado com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            }
                    } while (!valido);
                    }
            } else if (opcao == 33) {
                System.out.println("Digite o codigo do cliente que deseja excluir");
                int codigo = teclado.nextInt();
                bancoClientes.excluir(codigo);

            } else if (opcao == 34) {
                System.out.println("Pesquisar cliente por:");
                System.out.println("1 - Código");
                System.out.println("2 - Nome");
                System.out.print("Escolha: ");
                int tipoBusca = teclado.nextInt();
                teclado.nextLine(); // limpa buffer

                Clientes clientes = null;

                if (tipoBusca == 1) {
                    System.out.print("Digite o código do cliente: ");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();

                    clientes = bancoClientes.pesquisar(codigo);

                } else if (tipoBusca == 2) {
                    System.out.print("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    clientes = bancoClientes.pesquisar(nome);

                } else {
                    System.out.println("Opção inválida!");
                    return; // volta ao menu sem erro
                }

                if (clientes == null) {
                    System.out.println("Cliente não localizado!");
                } else {
                    System.out.println("Cliente encontrado:");
                    System.out.println(clientes);
                }
           
            } else if (opcao == 35) {
                System.out.println("==============================");
                System.out.println("Imprimindo clientes cadastrados ...");
                bancoClientes.imprimirTodos();
                System.out.println("==============================");
            
            } else if (opcao == 36) {
                System.out.println("Número de clientes cadastrados: " + bancoClientes.getNumeroClientes());
            
            }
        } while (opcao != 39);
    } 
}
