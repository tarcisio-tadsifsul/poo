package exe23Empregado;

public class Empregado {

    // Atributos
    private String nome;
    private String sobrenome;
    private double salario;

    // Leitura | Escrita
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            this.salario = 0.0;
        }
    }

    // Construtores
    public Empregado() {
        this.nome = "Sem Nome";
        this.sobrenome = "Sem Sobrenome";
        this.salario = 0.0;
    }

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalario(salario);
    }

    public double calcularSalarioAnual() {
        return getSalario() * 12;
    }

    public double aumentarSalario(double aumento) {
        double novoSalario = getSalario() * (1 + (aumento / 100));
        setSalario(novoSalario);
        return getSalario();
    }

    public String imprimirInfos() {
        return "\nNome: " + getNome() + " " + getSobrenome()
                + "\nSalario Mensal: R$ " + String.format("%.2f", getSalario())
                + "\nSalario Anual: R$ " + String.format("%.2f", calcularSalarioAnual());
    }

}
