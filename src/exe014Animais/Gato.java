
package exe014Animais;

public class Gato extends Animal{
    public Gato(String nome, String raca){
        super(nome, raca);
    }
    
    public String miar(){
        return "mia";
    }
    
    public String exibirDados(){
        return  "Animal:" +
                "\n| Tipo:\tgato" + 
                "\n| Nome:\t" + super.getNome() +
                "\n| Raca:\t" + super.getRaca();
    }
    
//    end class
}
