package exe013Imovel;

public class Velho extends Imovel{
    // Atributos
    private double desconto;
    
    // Construtores   
    public Velho(String endereco, double preco, double desconto){
        super(endereco, preco);
        setDesconto(desconto);
    }
    
    // Getter / Setter
    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto >= 0){
            this.desconto = desconto;
        }
    }
    
    private double aplicarDesconto(){
        return getPreco() - this.getDesconto();
    }
    
    // Métodos
    @Override
    public String exibirDados(){
        return super.exibirDados() + 
                "\n| Desconto:\t" + this.getDesconto() + 
                "\n| Valor final:\t" + this.aplicarDesconto();
    }
    
    
// end class


}

