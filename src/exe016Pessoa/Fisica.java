package exe016Pessoa;

public class Fisica extends Pessoa{
    
    // Atributos
    private String cpf;
    private String dataNascimento;
    
    // construtores

    public Fisica(String nome, Endereco endereco) {
        super(nome, endereco);
        this.cpf = "ND";
        this.dataNascimento = "ND";
    }

    public Fisica(String nome, Endereco endereco, String cpf, String dataNascimento) {
        super(nome, endereco);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    // Acesso / Leitura

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(!cpf.equals("")){
            this.cpf = cpf;            
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (!dataNascimento.equals("")) {
            this.dataNascimento = dataNascimento;            
        }
    }
    
   
    // Metodos
    public String exibirDados() {
        return "\n" + super.exibirDados("Fisica") + 
                "\n| CPF:\t\t\t" + this.getCpf() +
                "\n| Data Nascimento:\t" + this.getDataNascimento();
    }
    
//end class    
}
