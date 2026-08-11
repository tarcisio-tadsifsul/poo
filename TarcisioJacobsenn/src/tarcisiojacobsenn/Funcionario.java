package tarcisiojacobsenn;

public class Funcionario {
    
    //atributos
    private String nome;
    private String cpf;
    private double salarioBase;

    // Construtores
    public Funcionario() {
        this.nome = "ND";
        this.cpf = "ND";
        this.salarioBase = 0.00;
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // Acesso | Leitura
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // Métodos
    public double calcularSalarioFinal(){
        return this.salarioBase;
    }
    
    public String exibirDados(){
        return "\nNome: " + this.nome + " | CPF: " + this.cpf + "\nSalario Base: R$" + this.salarioBase;
    }
    
}
