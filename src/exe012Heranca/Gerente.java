/**
 * Crie uma subclasse Gerente:
 * 
 * * Essa subclasse deve possuir os seguintes atributos:
 * - Possui um setor (string)
 * - Possui um bônus de R$ 1000,00 (double)
 * 
 * Nos métodos deve:
 * - Sobrescrever o método calcularSalario()
 * - Sobrescrever o método exibirDados()
 * 
 */
package exe012Heranca;

public class Gerente extends Funcionario {
    
    // Atributos
    private String setor;
    private double bonus; // Valor Fixo conforme exercício

    // Construtor
    public Gerente(String nome, double salarioBase) {
        // super() invoca o construtor da superclasse Funcionario
        super(nome, salarioBase);
        this.setor = "Sem Setor";
        this.bonus = 1000.00;
    }

    public Gerente(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
        this.bonus = 1000.00;
    }

    // Getter / Setters
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getBonus() {
        return this.bonus;
    }

    // public void setBonus(double bonus) {
    // this.bonus = bonus;
    // }

    /**
     * Calcula o salário total do funcionário.
     * 
     * @return O valor total somando o salário base e o bônus específico deste cargo.
     */
    @Override
    public double calcularSalario() {
        // Aproveita a lógica da superclasse e adiciona o bônus específico
        return super.getSalarioBase() + this.getBonus();
    }

    /**
     * Exibe os dados detalhados do gerente.
     * 
     * @return Uma {@code String} formatada contendo as informações gerais do 
     *         funcionário, o setor responsável e o salário total com bônus.
     */
    @Override
    public String exibirDados() {
        // Concatenamos o exibirDados do Funcionario com os dados exclusivos do Gerente
        return super.exibirDados() +
                "\n| Setor: \t\t" + this.getSetor() +
                "\n| Bonus: \t\t" + this.getBonus() +
                "\n| Salario total: \t" + this.calcularSalario();
    }

    // end class
}
