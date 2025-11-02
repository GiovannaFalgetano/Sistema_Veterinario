public class Especie extends CadastroBase {

    @Override
    public String toString() {
        return "Código: " + getCodigo() + " | Nome: " + getNome();
    }
}
