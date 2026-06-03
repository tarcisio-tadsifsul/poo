
package exe020Empresa;

public class Gerente extends Funcionario {
    
    // Atributos
    private int vetor[] = new int[10];    
    private Funcionario departamento[];
    private int qtdFuncionrios;

    // Construtores
    public Gerente(int qtdFuncionario) {
        this.departamento = new Funcionario[qtdFuncionrios];
    }

    public Gerente(
            Funcionario[] departamento,
            int qtdFuncionrios
        ) {
        this.departamento = departamento;
        this.qtdFuncionrios = qtdFuncionrios;
    }

    public Gerente(
            Funcionario[] departamento,
            int qtdFuncionrios,
            String nome,
            String cpf,
            double salario
        ) {
        super(nome, cpf, salario);
        this.departamento = departamento;
        this.qtdFuncionrios = qtdFuncionrios;
    }

    // Leitura / Escrita
    public Funcionario[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Funcionario[] departamento) {
        this.departamento = departamento;
    }

    public int getQtdFuncionrios() {
        return qtdFuncionrios;
    }

    public void setQtdFuncionrios(int qtdFuncionrios) {
        this.qtdFuncionrios = qtdFuncionrios;
    }
    
    
    // Métodos
    
}
