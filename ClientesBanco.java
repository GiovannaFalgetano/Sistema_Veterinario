import java.util.ArrayList;
import java.util.List;


public class ClientesBanco {
    private List<Clientes> lista;
    private int numeroClientes;

    public ClientesBanco () {
        lista = new ArrayList<Clientes>();
        numeroClientes = 0;
    }

    public void adicionar (Clientes cliente) {
        lista.add(cliente);
        numeroClientes = numeroClientes + 1;
    }

    public void excluir (int codigo) {
        Clientes localizado = null;

        for (Clientes item : lista) {
            if(item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            System.out.println("Cliente não localizado!");
        } else {
            lista.remove(localizado);
            this.numeroClientes = this.numeroClientes - 1;
            System.out.println("Cliente removido!");
        }
    }

    public int getNumeroClientes() {
        return this.numeroClientes;
    }

    public void imprimirTodos() {
        if (getNumeroClientes() <= 0) {
            System.out.println("Nenhum cliente cadastrado");
        } else {
            for (Clientes item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public void alterar (Clientes clientes) {
        Boolean localizado = false;

        for (Clientes item : lista) {
            if(item.getCodigo() == clientes.getCodigo()) {
                item.setNome(clientes.getNome());
                localizado =  true;
                break;
            }
        }

        if (localizado == false) {
            System.out.println("Cliente não localizado!");
        } else {
            System.out.println("Cliente alterado");
        }
    }

    public Clientes pesquisar (int codigo) {
        for (Clientes item : lista) {
            if(item.getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    public Clientes pesquisar(String nome) {
        for (Clientes item : lista) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }


}
