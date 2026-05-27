
package exe019Biblioteca;

public class Endereco {
    
    // Atributos
    private String logradouro;
    private String numero;
    
    
    // Contrutor
    public Endereco() {
        this.logradouro = "Sem Logradouro";
        this.numero = "Sem Numero";
    }

    public Endereco(String logradouro, String numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }
    
    // Leitura / Escrita

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String retornarEndereco(){
        return this.logradouro + ", " + this.numero;
    }
    
}
