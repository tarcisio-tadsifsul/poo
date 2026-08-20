package desafioLocadoraVeiculos;

public class Main {

    public static void main(String[] args) {

        Carro car1 = new Carro("Volvo", "A3", 500.00, "SUV");

        car1.adicionarAcessorio("Ar Condicionado");
        car1.adicionarAcessorio("GPS");
        car1.adicionarAcessorio("Roda Liga Leve");
        car1.adicionarAcessorio("Central multimídia");

        System.out.println(car1.toString());

        Carro car2 = new Carro("Fiat", "Tracker", 350.00, "Hatch");

        car2.adicionarAcessorio("Alarme automotivo");
        car2.adicionarAcessorio("GPS");
        car2.removerAcessorio("Calibrador Portátil");

        System.out.println(car2.toString());

    }
}
