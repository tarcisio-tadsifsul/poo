package exe015Ingresso;

public class Ingresso {

    // Atributos
    private double valor;

    // Construtor
    public Ingresso(){
        this.valor = 200.00;
    }

    public Ingresso(double valor) {
        this.valor = 200.00;
    }

    // Get / Set
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Métodos
    public String imprimirValor(){
        return "Valor: " + this.getValor();
    }
    
}
