package exe25AreaCalculavel;

public class Teste {
    public static void main(String[] args) {
        // Criando o vetor usando o nome da Interface
        AreaCalculavel[] formas = new AreaCalculavel[5];

        formas[0] = new Quadrado(2);
        formas[1] = new Retangulo(2, 4);
        formas[2] = new Circulo(3);
        formas[3] = new Quadrado(5);
        formas[4] = new Retangulo(6, 9);

        for (AreaCalculavel forma : formas) {
            System.out.println(
                    forma.getClass().getSimpleName() +
                            ":\t" +
                            forma.calculaArea());
        }
    }
}
