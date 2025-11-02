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
            System.out.println("ESPECIES");
            System.out.println("11. Adicionar");
            System.out.println("12. Alterar");
            System.out.println("13. Excluir");
            System.out.println("14. Pesquisar");
            System.out.println("19. Sair");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();

            if (opcao == 11) {
                Especie especie = new Especie();
                especie.setCodigo(teclado.nextInt());
                especie.setNome(teclado.next());

                bancoEspecies.adicionar(especie);

            } else if (opcao == 12) {

            } else if (opcao == 13) {
                int codigo = teclado.nextInt();
                bancoEspecies.excluir(codigo);

            } else if (opcao == 14) {

            }
        } while (opcao != 19);
    }
}