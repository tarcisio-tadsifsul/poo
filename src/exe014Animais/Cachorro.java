
package exe014Animais;

public class Cachorro extends Animal {
    public Cachorro(String nome, String raca){
        super(nome, raca);
    }
    
    public String latir(){
        return "late";
    }
    
    public String exibirDados(){
        return  "Animal:" +
                "\n| Tipo:\tcachorro" + 
                "\n| Nome:\t" + super.getNome() +
                "\n| Raca:\t" + super.getRaca();
    }
    
//    end class
}
