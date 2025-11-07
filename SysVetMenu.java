import java.util.Scanner;

public class SysVetMenu {
    //atributo
    private Scanner teclado = new Scanner(System.in);

    //propriedades
    public void exibir() {
        int opcao = 0;

        do {
            System.out.println("==============================");
            System.out.println("      SISTEMA VETERINARIO     ");
            System.out.println("==============================");
            System.out.println("1. Especies");
            System.out.println("2. Animais");
            System.out.println("3. Clientes");
            System.out.println("9. Sair");
            System.out.println("Digite a opcao: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                EspecieMenu especieMenu = new EspecieMenu ();
                //especieMenu.exibir();
            } else if (opcao == 2) {
                AnimaisMenu animaisMenu = new AnimaisMenu ();
                //animaisMenu.exibir();
            } else if (opcao == 3) {

            }
        } while (opcao != 9);
    }
}