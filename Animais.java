public class Animais extends CadastroBase{
   
    // Gerador estático (pertence à classe, não ao objeto)
    private static int gerador = 1;

    // Construtor: cria o código automaticamente
    public Animais() {
        // usa o setCodigo da classe base, com validação
        super.setCodigo(gerador++);
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() + " | Nome: " + getNome() + " | Apelido: " + getApelido() + " | Data de nascimento: " + getDataNasc() + "\nObservações: " + getObs(); 
    } 
}

