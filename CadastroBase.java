public class CadastroBase {
    private int codigo;
    private String nome;

    public void setCodigo(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Código inválido, deve ser maior que 0!");
        }
        this.codigo = value;
    }

    public int getCodigo() { return this.codigo; }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException("Nome inválido! Informe ao menos 3 caracteres.");
        }
        this.nome = nome.trim();
    }

    public String getNome() { return this.nome; }
}
