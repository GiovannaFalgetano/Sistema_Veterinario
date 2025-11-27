public class Especie extends CadastroBase {

     private static int proximoCodigo = 1; // gerador estático

    public Especie() {
        super.setCodigo(proximoCodigo++); // gera código automaticamente
    }


    @Override
    public String toString() {
        return "Código: " + getCodigo() + " | Nome: " + getNome();
    }
}
