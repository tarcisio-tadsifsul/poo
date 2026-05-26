package exe015Ingresso;

public class CamaroteSuperior extends Vip{

    // Atributos
    private double adicionalSuperior;
    
    // Construtor
    public CamaroteSuperior(double valorBase, double adicionalVip, String localizacao){
        super(valorBase, adicionalVip, localizacao);
        this.adicionalSuperior = 50.00;
    }
    
    // Acesso
    public double getAdicionalSuperior(){
        return this.adicionalSuperior;
    }

    // Metodo
    private void setLocalCamaroteSuperior(){
        this.setLocalizacao("Camarote Superior");
    }
    
    public String imprimirLocalizacao(){
        return this.getLocalizacao();
    }
    
    public double retornaValorVipSup(){
        return this.getValor() + this.getAdicionalVip() + this.adicionalSuperior;
    }
    
//end class    
}
