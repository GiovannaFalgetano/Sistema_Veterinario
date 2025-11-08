import java.util.Scanner;

public class AnimaisMenu {
    //atributos
    private Scanner teclado = new Scanner(System.in);
    private AnimaisBanco bancoAnimais = new AnimaisBanco();

    //metodo construtor 
    public AnimaisMenu() {
        this.exibir();
    }

    //propriedades 
    private void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("            ANIMAIS        ");
            System.out.println("==============================");
            System.out.println("11. Adicionar");
            System.out.println("12. Alterar");
            System.out.println("13. Excluir");
            System.out.println("14. Pesquisar");
            System.out.println("15. Mostrar todos");
            System.out.println("16. Número de animais cadastrados");
            System.out.println("19. Sair");
            System.out.println("==============================");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();

            if (opcao == 11) {
                Animais animais = new Animais();
                boolean valido = false;

                do {
                    try {
                    System.out.println("Digite o código do animal:");
                    int codigo = teclado.nextInt();
                    teclado.nextLine(); // consome o ENTER pendente
                    animais.setCodigo(codigo);

                    System.out.println("Digite o nome do animal:");
                    String nome = teclado.nextLine();
                    animais.setNome(nome);

                    System.out.println("Digite o apelido do animal:");
                    String apelido = teclado.nextLine();
                    animais.setApelido(apelido);

                    System.out.println("Digite a data de nascimento do animal:");
                    String dataNasc = teclado.nextLine();
                    animais.setDataNasc(dataNasc);

                    System.out.println("Digite uma observação do animal (se necessário):");
                    String obs = teclado.nextLine();
                    animais.setObs(obs);

                    valido = true;
                    } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    }
                } while (!valido);

                bancoAnimais.adicionar(animais);

            } else if (opcao == 12) { // Alterar
                System.out.println("Digite o código do animal que deseja alterar:");
                int codigo = teclado.nextInt();
                teclado.nextLine(); // consome o ENTER pendente

                Animais animais = bancoAnimais.pesquisar(codigo);

                if (animais == null) {
                    System.out.println("Animal não localizado!");
                } else {
                    boolean valido = false;
                    do {
                        try {
                            System.out.println("Digite o novo nome do animalzinho:");
                            String novoNome = teclado.nextLine();
                            animais.setNome(novoNome);

                            System.out.println("Digite o novo apelido do animalzinho:");
                            String novoApelido = teclado.nextLine();
                            animais.setApelido(novoApelido);

                            System.out.println("Digite a nova data de nascimento do animalzinho:");
                            String novoDataNasc = teclado.nextLine();
                            animais.setDataNasc(novoDataNasc);

                            System.out.println("Digite a nova observação do animalzinho (se necessário):");
                            String novoObs = teclado.nextLine();
                            animais.setObs(novoObs);

                            valido = true;
                            System.out.println("Animal alterado com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            }
                    } while (!valido);
                    }
            } else if (opcao == 13) {
                System.out.println("Digite o codigo do animal que deseja excluir");
                int codigo = teclado.nextInt();
                bancoAnimais.excluir(codigo);

            } else if (opcao == 14) {
                System.out.println("Digite o codigo do animal que deseja pesquisar:");
                int codigo = teclado.nextInt();
                teclado.nextLine();

                Animais animais = bancoAnimais.pesquisar(codigo);

                if (animais == null) {
                    System.out.println("Animal não localizado");
                } else {
                    System.out.println("Animal encontrado:");
                    System.out.println(animais);
                }

            }else if (opcao == 15) {
                System.out.println("==============================");
                System.out.println("Imprimindo animais cadastrados ...");
                bancoAnimais.imprimirTodos();
                System.out.println("==============================");
            } else if (opcao == 16) {
                System.out.println("Número de animais cadastrados: " + bancoAnimais.getNumeroAnimais());
            }
        } while (opcao != 19);
    } 
}
