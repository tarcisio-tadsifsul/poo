package exe019Biblioteca;

public class Usuario {
    // Atributos
    private String nome;
    private String cpf;

    // Leitura / Escrita
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) {
            this.nome = "Sem Nome";
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.equals("")) {
            this.cpf = "Sem CPF";
        } else {
            this.cpf = cpf;
        }
    }

    // Construtores
    public Usuario() {
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
    }

    public Usuario(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    // Metodos
    public String exibirDados() {
        return "\nUsuário:"
                + "\n| Nome: " + getNome()
                + "\n| CPF:  " + getCpf();
    }
}
