package exe25AreaCalculavel;

public class Circulo implements AreaCalculavel {
    // Atributos
    private double raio;
    static final double CONST_PI = 3.14;

    // Leitura | Escrita
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            this.raio = 1;
        }
    }

    // Construtores
    public Circulo(double raio) {
        setRaio(raio);
    }

    // Metodos
    @Override
    public double calculaArea() {
        // A = pi * r²
        // Math.PI * Math.pow(this.raio, 2);
        // CONST_PI * (this.raio * this.raio);
        return CONST_PI * Math.pow(this.raio, 2);
    }

}
