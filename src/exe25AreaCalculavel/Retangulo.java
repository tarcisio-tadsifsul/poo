package exe25AreaCalculavel;

public class Retangulo implements AreaCalculavel {

    // Atributos
    private double base;
    private double altura;

    // Leitura | Escrita
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    // Construtores
    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Metodos
    @Override
    public double calculaArea() {
        // A = b * h
        return getBase() * getAltura();
    }

}
