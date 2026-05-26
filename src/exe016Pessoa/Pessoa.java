package exe016Pessoa;

public class Pessoa {
    
    // Atributos
    private String nome;
    private Endereco endereco;
    
    // Construtores
    public Pessoa(){
        this.nome = "ND";
        this.endereco = new Endereco("Não Informado");
    }
        
    public Pessoa(String nome, Endereco endereco) {
        setNome(nome);
        this.endereco = endereco;
    }
    
    
    // Acesso / Leitura
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getEndereco() {
//        return this.endereco;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
    
    // Metodos   
    public String exibirDados(String tipo){
        String titulo = "";
        if (!tipo.equals("")){
            titulo = "Pessoa " + tipo + ":";
        } else {
            titulo = "Pessoa:";
        }
        return titulo +
                "\n| Nome:\t\t\t" + this.nome + 
                "\n| Endereco:\t\t" + this.endereco; 
        
        // Se o Endereco tiver Sobrescrita do toString(),
        // `this.endereco` funciona automaticamente aqui!
    }
    
    
    
    
    
    
//end class    
}
