package exe016Pessoa;

public class Endereco {
    
    // Atributo
    private String endereco;
    
    
    //Contrutor        
    public Endereco(){
        this.endereco = "ND";
    }
    
    public Endereco(String endereco) {
        this.endereco = endereco;
    }  
    
    // Acesso / Leitura
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Sobrescrita do Metodo toString()
    // para mostrar o conteúdo do objeto tipo Endereço
    @Override
    public String toString() {
        return this.endereco;
    }
    
    
// end class



}
