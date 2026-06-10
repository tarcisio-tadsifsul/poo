package exe25AreaCalculavel;

public class Teste {
    public static void main(String[] args) {
        // Criando o vetor usando o nome da Interface
        // Uma interface pode ser usada como tipo para guardar um objeto que assinou o contrato da interface
        // AreaCalculavel[] formas = new AreaCalculavel[5];
        AreaCalculavel formas[] = new AreaCalculavel[5];

        formas[0] = new Quadrado(10);
        formas[1] = new Retangulo(2, 8);
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
