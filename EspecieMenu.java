import java.util.Scanner;

public class EspecieMenu {
    //atributos
    private Scanner teclado = new Scanner(System.in);
    private EspecieBanco bancoEspecies = new EspecieBanco();

    //metodo construtor 
    public EspecieMenu() {
        this.exibir();
    }

    //propriedades 
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("            ESPECIES          ");
            System.out.println("==============================");
            System.out.println("11. Adicionar");
            System.out.println("12. Alterar");
            System.out.println("13. Excluir");
            System.out.println("14. Pesquisar");
            System.out.println("15. Mostrar todos");
            System.out.println("16. Número de especies cadastradas");
            System.out.println("19. Sair");
            System.out.println("==============================");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();

            if (opcao == 11) {
                Especie especie = new Especie();
                boolean valido = false;

                do {
                    try {
                    System.out.println("Digite o código da espécie:");
                    int codigo = teclado.nextInt();
                    teclado.nextLine(); // consome o ENTER pendente
                    especie.setCodigo(codigo);

                    System.out.println("Digite o nome da espécie:");
                    String nome = teclado.nextLine();
                    especie.setNome(nome);

                    valido = true;
                    } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    }
                } while (!valido);

                bancoEspecies.adicionar(especie);

            } else if (opcao == 12) { // Alterar
                System.out.println("Digite o código da espécie que deseja alterar:");
                int codigo = teclado.nextInt();
                teclado.nextLine(); // consome o ENTER pendente

                Especie especie = bancoEspecies.pesquisar(codigo);

                if (especie == null) {
                    System.out.println("Espécie não localizada!");
                } else {
                    boolean valido = false;
                    do {
                        try {
                            System.out.println("Digite o novo nome da espécie:");
                            String novoNome = teclado.nextLine();
                            especie.setNome(novoNome);
                            valido = true;
                            System.out.println("Espécie alterada com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            }
                    } while (!valido);
                    }
            } else if (opcao == 13) {
                System.out.println("Digite o codigo da especie que deseja excluir");
                int codigo = teclado.nextInt();
                bancoEspecies.excluir(codigo);

            } else if (opcao == 14) {
                System.out.println("Pesquisar espécie por:");
                System.out.println("1 - Código");
                System.out.println("2 - Nome");
                System.out.print("Escolha: ");
                int tipoBusca = teclado.nextInt();
                teclado.nextLine(); // limpa buffer

                Especie especie = null;

                if (tipoBusca == 1) {
                    System.out.print("Digite o código da espécie: ");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();

                    especie = bancoEspecies.pesquisar(codigo);

                } else if (tipoBusca == 2) {
                    System.out.print("Digite o nome da espécie: ");
                    String nome = teclado.nextLine();

                    especie = bancoEspecies.pesquisar(nome);

                } else {
                    System.out.println("Opção inválida!");
                    return;
                }

                if (especie == null) {
                    System.out.println("Espécie não localizada!");
                } else {
                    System.out.println("Espécie encontrada:");
                    System.out.println(especie);
                }
            } else if (opcao == 15) {
                System.out.println("==============================");
                System.out.println("Imprimindo Especies...");
                bancoEspecies.imprimirTodos();
                System.out.println("==============================");

            } else if (opcao == 16) {
                System.out.println("Número de especies cadastradas: " + bancoEspecies.getNumeroEspecies());
                
            }
        } while (opcao != 19);
    } 
}  

