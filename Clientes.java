public class Clientes extends CadastroBase {
   
     private static int proximoCodigo = 1; // gerador estático

    public Clientes() {
        super.setCodigo(proximoCodigo++); // gera código automaticamente
    }

    @Override
    public String toString() {
        return "Data de cadastro: " + getDataCadastro() + "\nCódigo: " + getCodigo() + " | Nome: " + getNome() + " | CPF: " + getCpf() + " | Email: " + getEmail();
    } 
}

