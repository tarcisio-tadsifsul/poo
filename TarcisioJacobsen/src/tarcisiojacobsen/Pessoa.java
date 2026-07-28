package tarcisiojacobsen;

abstract class Pessoa {

    private String nome;
    private String cpf;
    private String email;

    public Pessoa() {
        this.nome = "Sem Nome";
        this.cpf = "Sem CPF";
        this.email = "Sem Email";
    }
    
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }            

    @Override
    public String toString(){
        return "\n| Nome: " + this.nome
             + "\n| CPF: " + this.cpf
             + "\n| Email: " + this.email;
    }
}
