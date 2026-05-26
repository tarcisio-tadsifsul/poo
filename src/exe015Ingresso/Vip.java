package exe015Ingresso;

public class Vip extends Ingresso{
    
    // Atributos
    private String localizacao;
    private double adicionalVip;
    
    // Construtor
    public Vip(double valor, double adicionalVip, String localizacao) {
        super(valor); //
        setAdicionalVip(adicionalVip);
        this.localizacao = localizacao;
    }
    
    // Acesso / Leitura
    public String getLocalizacao(){
        return this.localizacao;
    }
    
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    
    public double getAdicionalVip(){
        return this.adicionalVip;
    }
    
    public void setAdicionalVip(double adicional){
        if(adicional >= 0){
            this.adicionalVip = adicional;
        }
    }
    
    // Métodos
    public double retornaValorVip(){
        return super.getValor() + this.getAdicionalVip();
    }
            
//end class    
}
