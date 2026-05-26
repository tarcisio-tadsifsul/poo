package exe015Ingresso;

public class CamaroteInferior extends Vip{
    
    // Atributos
//    private String localizacao;
    
    // Construtor
    public CamaroteInferior(double valorBase, double adicionalVip, String localizacao){
        super(valorBase, adicionalVip, localizacao);
    }
    
    private void setLocalCamaroteInferior(){
        super.setLocalizacao("Camarote Inferior");
    }

    // Metodo
    public String imprimir(){
        return "Localizacao:\t" + this.getLocalizacao() + "Valor:\tR$ " + this.getValor() + this.getAdicionalVip();
    }
// end class   
}
