package exe021meiosDeTransporte;

public class Main {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel(
            "Ford",
            "F12",
            4,
            50,
            1.0
        );
        auto1.imprimirInformacoes();

        Carro car = new Carro(
            "Fiat", "Palio", 5, 0, 1.3, 4);
        car.imprimirInformacoes();
            
    }
}
