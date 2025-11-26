import java.util.ArrayList;
import java.util.List;

public class AnimaisBanco {
    private List<Animais> lista;
    private int numeroAnimais;

    public AnimaisBanco () {
        lista = new ArrayList<Animais>();
        numeroAnimais = 0;
    }

    public void adicionar (Animais animais) {
        lista.add(animais);
        numeroAnimais = numeroAnimais + 1; 
    }

    public void excluir (int codigo) {
        Animais localizado = null;

        for (Animais item : lista) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("Animal não localizado!");
        } else {
            lista.remove(localizado);
            this.numeroAnimais = this.numeroAnimais - 1;
            System.out.println("Animal removido!");
        }
    }

    public int getNumeroAnimais() {
        return this.numeroAnimais;
    }

    public void imprimirTodos() {
        if (getNumeroAnimais() <= 0) {
            System.out.println("Nenhum animalzinho cadastrado");
        } else {
            for (Animais item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public void alterar (Animais animais) {
        Boolean localizado = false;

        for (Animais item : lista) {
            if (item.getCodigo() == animais.getCodigo()) {
                item.setNome(animais.getNome());
                item.setApelido(animais.getApelido());
                item.setDataNasc(animais.getDataNasc());
                item.setObs(animais.getObs());
                localizado = true;
                break;
            }
        }

        if (localizado == false) {
            System.out.println("Animalzinho não localizado!");
        } else {
            System.out.println("Animalzinho alterado");
        }
    }

    public Animais pesquisar(int codigo) {
    for (Animais item : lista) {
        if (item.getCodigo() == codigo) {
            return item; 
        }
    }
    return null; 
    }

    public Animais pesquisar(String nome) {
    for (Animais item : lista) {
        if (item.getNome().equalsIgnoreCase(nome)) {
            return item;
        }
    }
    return null;
}

}


