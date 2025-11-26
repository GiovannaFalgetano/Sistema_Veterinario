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

    public int getNumeroEspecies() {
        return this.numeroEspecies;
    }

    public void imprimirTodos() {
        if (getNumeroEspecies () <= 0) {
            System.out.println("Nenhuma especie cadastrada");
        } else {
            for (Especie item : lista) {
                System.out.println(item.toString());
            }
        }
    }
    
    public void alterar (Especie especie) {
        Boolean localizado = false;

        for (Especie item : lista) {
            if (item.getCodigo() == especie.getCodigo()) {
                item.setNome(especie.getNome());
                localizado = true;
                break;
            }
        }

        if (localizado == false) {
            System.out.println("Especie não localizada!");
        } else {
            System.out.println("Estado alterado");
        }
    }

   public Especie pesquisar(int codigo) {
        for (Especie item : lista) {
            if (item.getCodigo() == codigo) {
                return item; // já retorna imediatamente se encontrado
            }
        }
    return null; // retorna null se não encontrou
    }

    public Especie pesquisar(String nome) {
        for (Especie item : lista) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
    return null;
}




}
