package exe021meiosDeTransporte;

public class Main {
    public static void main(String[] args) {

        Bicicleta bike = new Bicicleta(
                "Caloi",
                "Velox",
                2,
                0,
                18, false);

        bike.imprimirInformacoes();
        bike.acelerar(30);
        bike.frear(30);

        Carro carro = new Carro(
                "Fiat",
                "Palio",
                5, 0, 1.3, 4);

        carro.imprimirInformacoes();
        carro.acelerar(60);
        carro.frear(20);

        Moto moto = new Moto(
                "Honda",
                "CG Titan",
                2,
                0,
                1.0, true);

        moto.imprimirInformacoes();
        moto.acelerar(80);
        moto.frear(50);

    }
}
