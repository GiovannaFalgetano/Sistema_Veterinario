public class CadastroBase {
    private int codigo;
    private String nome;

    public void setCodigo(int value) {
        if (value <= 0) {
            System.out.println("Código inválido, deve ser maior 0!");
        } else {
            this.codigo = value;
        }
    }
    public int getCodigo() {return this.codigo;}

    public void setNome (String value) {
        if (value == null) {
            System.out.println("Nome invalido, informe ao menos 5 caracteres!");
        }else if (value.toString().trim().length() < 5) {
            System.out.println("Campo não pode ter menos de 5 caracteres!");
        } else {
            this.nome = value;
        }
    }
            
    public String getNome () {return this.nome;}
}
