package exe26Tributavel;

public class SeguroDeVida implements Tributavel {

    // Atributos
    private final double tributo;

    // Construtor
    public SeguroDeVida() {
        this.tributo = 42.0;
    }

    // Metodos
    @Override
    public double calculaTributos() {
        return this.tributo;
    }

}
