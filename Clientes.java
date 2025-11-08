public class Clientes extends CadastroBase {
   
    @Override
    public String toString() {
        return "Data de cadastro: " + getDataCadastro() + "\nCódigo: " + getCodigo() + " | Nome: " + getNome() + " | CPF: " + getCpf() + " | Email: " + getEmail();
    } 
}

