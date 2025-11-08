public class Animais extends CadastroBase{
   
    @Override
    public String toString() {
        return "Código: " + getCodigo() + " | Nome: " + getNome() + " | Apelido: " + getApelido() + " | Data de nascimento: " + getDataNasc() + "\nObservações: " + getObs(); 
    } 
}

