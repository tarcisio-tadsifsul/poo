package exe25AreaCalculavel;

public class Quadrado implements AreaCalculavel {

    // Atributos
    private double lado;

    // Leitura | Escrita
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
    }

    // Construtores
    public Quadrado(double lado) {
        setLado(lado);
    }

    // Metodos
    @Override
    public double calculaArea() {
        // A = (lado)² quando tiver valor de lado do quadrado
        // A = (diagonal)² / 2 quando tiver valor diagonal do quadrado
        return Math.pow(this.lado, 2);
    }

}
