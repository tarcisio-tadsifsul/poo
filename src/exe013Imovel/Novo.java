
package exe013Imovel;

public class Novo extends Imovel{
    
    // Atributos
    private double adicional;
    
    // Construtores   
    public Novo(String endereco, double preco, double adicionalPreco){
        super(endereco, preco);
        setAdicional(adicionalPreco);
    }
    
    // Getter / Setter
    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicionalPreco) {
        if(adicionalPreco >= 0){
            this.adicional = adicionalPreco;
        }
    }
    
    private double aplicarAdicional(){
        return getPreco() + this.getAdicional();
    }
    
    // Métodos
    @Override
    public String exibirDados(){
        return super.exibirDados() + 
                "\n| Adicional:\t" + this.getAdicional() +
                "\n| Valor final:\t" + this.aplicarAdicional();
    }
    
    
// end class
}

