
package tarcisiojacobsenn;

public class Vendedor extends Funcionario {
    
    // Atributos
    private double taxaComissao;
    private int quantidadeVendas;
    private int quantidadeVendasEstornadas;
    private Venda vendas[];
    
    // Construtores
    public Vendedor() {
        super();
        this.taxaComissao = 0.00;
        this.quantidadeVendas = 0;
        this.quantidadeVendasEstornadas = 0;
        this.vendas = new Venda[quantidadeVendas];
    }

    public Vendedor(String nome, String cpf, double salarioBase, double taxaComissao, int quantidadeVendas) {
        super(nome, cpf, salarioBase);
        this.taxaComissao = taxaComissao;
        this.quantidadeVendasEstornadas = 0;
        this.quantidadeVendas = quantidadeVendas;
        this.vendas = new Venda[quantidadeVendas];
    }
    
    // metodos
    public boolean registrarVenda(Venda venda){
        for (int i = 0; i < this.quantidadeVendas; i++) {
            if (this.vendas[i] == null){
                this.vendas[i] = venda;
                System.out.println("Venda #"+(i+1)+" Registrada com Sucesso!");
                return true;
            }                
        }
        
        System.out.println("[ERRO] Venda Não Registrada!");
        return false;
    }
    
    public boolean estornarVenda(int codigoVenda){
        for (int i = 0; i < this.quantidadeVendas; i++) {
            if (this.vendas[i] != null && codigoVenda == this.vendas[i].getCodigo()){
                this.quantidadeVendasEstornadas++;
                this.vendas[i] = null;
                System.out.println("Venda #"+(i+1)+" estornada com Sucesso!");
                return true;
            }
        }
        
        System.out.println("[ERRO] Venda Nao Estornada!");
        return false;
    }
    
    public double calcularTotalVendido(){
        double somaTotalVendido = 0.0;
        for (Venda venda : vendas) {
            if (venda != null){
                somaTotalVendido += venda.getValor();
            }
        }
        return somaTotalVendido;
    }
    
    @Override
    public double calcularSalarioFinal() {
        double salarioFinal = super.getSalarioBase() + (calcularTotalVendido() * (this.taxaComissao / 100));
        return salarioFinal;
    }
        
    public String gerarExtratoMes(){
        return super.exibirDados() +
                "\nTaxa Comissao: " + this.taxaComissao + "%" +
                "\nQTD Vendas Realizadas: " + this.quantidadeVendas + 
                "\nQTD Vendas Estornadas: " + this.quantidadeVendasEstornadas +
                "\nTotal Vendido: R$" + this.calcularTotalVendido() +
                "\nSalario + Comissao: R$" + this.calcularSalarioFinal() +
                "\n";
    }
    
}
