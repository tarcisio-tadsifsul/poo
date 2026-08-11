package tarcisiojacobsenn;

public class Venda {
    
    // Atributos
    private static int auxCodigo = 1;
    private int codigo;
    private String descricaoProduto;
    private double valor;
    
    // Construtores
    public Venda() {
        this.codigo = Venda.auxCodigo++;
        this.descricaoProduto = "ND";
        this.valor = 0.00;
    }

    public Venda(String descricao, double valor) {
        this.codigo = Venda.auxCodigo++;
        this.descricaoProduto = descricao;
        this.valor = valor;
    }
    
    // Acesso | Leitura
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricao(String descricao) {
        this.descricaoProduto = descricao;
    }

    public double getValor() {
        return valor;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public void setValor(double valor) {
        if(valor > 0){
            this.valor = valor;            
        } else {
            this.valor = 0.00;
        }
    }
    
    //Metodos    
    @Override
    public String toString(){
        return "Codigo Venda: " + this.codigo + "\nDescricao: " + this.descricaoProduto + "\nValor: " + this.valor + "\n";
    }
   
}
