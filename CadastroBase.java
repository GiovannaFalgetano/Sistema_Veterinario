public class CadastroBase {
    private int codigo;
    private String nome;
    private String apelido;
    private String dataNasc;
    private String obs;
    private String cpf;
    private String email;
    private String dataCadastro;

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

    public void setApelido(String apelido) { this.apelido = apelido;}
    public String getApelido() {return this.apelido; }

    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }
    public String getDataNasc() { return this.dataNasc;}

    public void setObs(String obs) { this.obs = obs; }
    public String getObs() { return this.obs; }

    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getCpf() { return this.cpf; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }

    public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }
    public String getDataCadastro() { return this.dataCadastro; }

}
