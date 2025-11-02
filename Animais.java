public class Animais {
    private int codigo;
    private String nome;

        public void setCodigo (int codigo) {
        if (codigo <= 0) {
            System.out.println("Código Invalido, informe valores acima de 0");
        } else {
            this.codigo = codigo;
        }
    }
    public int getCodigo() {return this.codigo;}

    public void setNome (String nome) {
        if (nome == null) {
            System.out.println("Campo nome não pode ser nulo!");
        } else if (nome.toString().trim().length() < 5) {
            System.out.println("Campo nome deve conter ao menos 5 caracteres!");
        } else {
            this.nome = nome;
        }
        
    }
    public String getNome () {return this.nome;}
}

