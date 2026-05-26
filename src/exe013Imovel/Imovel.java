
package exe013Imovel;

public class Imovel {
    
    // Atributos
    private String endereco;
    private double preco;
    
    // Construtores
    public Imovel(){
        this.endereco = "ND";
        this.preco = 0.00;
    }

    public Imovel(String endereco, double preco) {
        setEndereco(endereco);
        setPreco(preco);
    }
    
    // Getter / Setter
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >=0){
            this.preco = preco;
        }
    }
    
    
    // Métodos
    public String exibirDados(){
        return "\nImovel:" +
                "\n| Endereco:\t" + this.getEndereco() + 
                "\n| Preco:\t" + this.getPreco();
        
    }
    
    
// end class
}
