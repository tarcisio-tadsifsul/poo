
package exe014Animais;

public class Animal {
    
    // Atributos
    private String nome;
    private String raca;
    
    // Construtores
    public Animal(){
        this.nome = "";
        this.raca = "";
    }
    
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    // Acesso / Leitura
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    // Metodos
    public String caminhar(){
        return "caminha";
    }
    
}
