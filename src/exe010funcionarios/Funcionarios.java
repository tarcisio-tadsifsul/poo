package exe010funcionarios;

public class Funcionarios {
    // Atributos
    private String nome;
    private String rg;
    private double salario;
    private Departamento depto;
    private String dataEntrada;
    
    // Metodos Acesso/Leitura
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0){
            this.salario = salario;
        } else {
            this.salario = 0.0;
        }
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }
    
    
    // Construtores
    public Funcionarios(){
        this.nome = "n/a";
        this.rg = "n/a";
        this.salario = 0.0;
        this.dataEntrada = "n/a";
    }
    
    public Funcionarios(String nome, String rg, double salario, Departamento depto, String data){
        this.nome = nome;
        this.rg = rg;
        this.setSalario(salario);
        this.depto = depto;
        this.dataEntrada = data;
    }
        
    // Metodos
    public double recebeAumento(double percentual){
        double salarioAtual = this.getSalario();
        double novoSalario = salarioAtual * (1 + percentual / 100);
        this.setSalario(novoSalario);
        return this.getSalario();
    }
    
    public double calculaGanhoAnual(){
        double salarioMensal = this.getSalario();
        double ganhoAnual = (salarioMensal * 12) + salarioMensal;
        return ganhoAnual;
    }
    
    public String imprimirDados(){
        String verificaDepto = (this.depto != null) ? this.depto.getNomeDepto() : "Sem Departamento";
        return "DADOS FUNCIONARIO " +
               "\n | Nome:\t\t"         + this.nome +
               "\n | RG:\t\t\t"         + this.rg +
               "\n | Salario:\t\tR$ "   + this.salario +
               "\n | Departamento:\t"   + verificaDepto +
               "\n | Data Entrada:\t"   + this.dataEntrada +
                "\n----------------------------------" + 
                "\n | Ganho Anual:\t\tR$ " + this.calculaGanhoAnual() +
               "\n";
    }
}
