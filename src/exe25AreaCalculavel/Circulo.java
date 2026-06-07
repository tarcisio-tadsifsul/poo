package exe25AreaCalculavel;

public class Circulo implements AreaCalculavel {
    // Atributos
    private double raio;

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
        return Math.PI * Math.pow(raio, 2);
    }

}
