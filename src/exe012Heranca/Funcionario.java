/**
 * Crie uma classe chamada Funcionario, que será a superclasse do sistema.
 * Essa classe deve possuir os seguintes atributos:
 * - string nome
 * - double salarioBase
 * 
 * Implemente:
 * - um construtor
 * - um método calcularSalario()
 * - um método exibirDados()
 * 
 */

package exe012Heranca;

public class Funcionario {

    // Atributos
    private String nome;
    private double salarioBase;

    // Construtores
    public Funcionario() {
        this.nome = "Sem Nome";
        this.salarioBase = 0.0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salarioBase = salario;
    }

    // Getter / Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salario) {
        this.salarioBase = salario;
    }

    // Metodos
    
    /**
     * Retorna o salário base do funcionário.
     * 
     * @return Retorna o salário base do funcionário
     */
    public double calcularSalario() {
        return this.getSalarioBase();
    }

    /**
     * Exibe os dados detalhados do Funcionário.
     * 
     * @return Uma {@code String} formatada contendo as informações gerais
     *         do funcionário.
     */
    public String exibirDados() {
        return "Funcionario: " +
                "\n| Nome: \t\t" + this.getNome() +
                "\n| Salario: \t\t" + this.getSalarioBase();
    }

    // end class
}
