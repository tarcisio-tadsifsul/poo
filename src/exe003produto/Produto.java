package exe003produto;

public class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    // Construtores
    public Produto(){
        this.nome = "Produto Sem Nome";
        this.preco = 1;
        this.quantidadeEstoque = 0;
    }
    
    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = verificaEstoque(qtd);
    }
        
    // Metodos de acesso/leitura    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){        
        if(preco <= 0){
            this.preco = 1;
        }
        this.preco = preco;
    }
    
    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int qtd){
        this.quantidadeEstoque = verificaEstoque(qtd);
    }
    
    // Metodos    
    private int verificaEstoque(int qtd){
        if (qtd < 0 && this.quantidadeEstoque == 0){
            return 0;
        }
        if (this.quantidadeEstoque > 0){
            return this.quantidadeEstoque;
        }
        return qtd;
    }
    
    // adicionarEstoque
    public void adicionarEstoque(int qtd){
        if (qtd > 0){
            this.quantidadeEstoque += qtd;
        }
    }
    
    // removerEstoque
    public void removerEstoque(int qtd){
        int calculoQtd = getQuantidadeEstoque() - qtd;
        if (calculoQtd >= 0 && qtd >= 0){
            this.quantidadeEstoque -= qtd;
        }
    }
    
    // Imprimir informações do produto
    public String imprimirInfos(){
        return """
               Produto:""" +     
               "\n| Nome:\t\t" + this.nome + 
               "\n| Preco:\t" + this.preco + 
               "\n| Estoque:\t" + this.quantidadeEstoque + 
                "\n";
    }
//fim class    
}
