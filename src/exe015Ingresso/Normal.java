package exe015Ingresso;

public class Normal extends Ingresso{

    // Construtor
    public Normal(double valor){
        super(valor);
    }
    
    // Método
    public String imprimir(){
        return "Ingresso Normal: R$ " + getValor();
    }
    
//end class    
}
