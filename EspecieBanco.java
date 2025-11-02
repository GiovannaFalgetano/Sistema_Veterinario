import java.util.ArrayList;
import java.util.List;

public class EspecieBanco {
    //atributos
    private List<Especie> lista;
    private int numeroEspecies;

    //construtor 
    public EspecieBanco () {
        lista = new ArrayList<Especie>();
        numeroEspecies = 0;
    }

    //propriedades
    public void adicionar (Especie especie) {
        lista.add(especie);
        numeroEspecies = numeroEspecies + 1; 
    }


    public void excluir (int codigo) {
        Especie localizado = null;

        for (Especie item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("Especie não localizada!");
        } else {
            lista.remove(localizado);
            this.numeroEspecies = this.numeroEspecies - 1;
            System.out.println("Especie removida!");
        }
    }
    
}