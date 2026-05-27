package exe019Biblioteca;

public class Usuario {
    // Atributos
    private String nome;
    private String cpf;
    private Endereco endereco;

    // Leitura / Escrita
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) {
            this.nome = "Sem Nome";
        } else {
            this.nome = nome.trim();
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.equals("")) {
            this.cpf = "Sem CPF";
        } else {
            this.cpf = cpf.trim();
        }
    }

    // Construtores
    public Usuario() {
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
        this.endereco = null;
    }

    public Usuario(String nome, String cpf, Endereco endereco) {
        setNome(nome);
        setCpf(cpf);
        this.endereco = endereco;
    }

    // Metodos
    public String exibirDados() {
        return "\nUsuario:"
                + "\n| Nome: " + getNome()
                + "\n| CPF:  " + getCpf()
                + "\n| Endereco: " + this.endereco.retornarEndereco();
    }
}
