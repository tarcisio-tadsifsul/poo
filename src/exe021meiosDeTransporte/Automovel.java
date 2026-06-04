package exe021meiosDeTransporte;

public class Automovel extends Veiculo {

    // Atributos
    private double potenciaDoMotor;

    // Construtores
    public Automovel() {
        this.potenciaDoMotor = 0.0;
    }

    public Automovel(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade,
            double potenciaDoMotor) {
        super(marca, modelo, qtdRodas, velocidade);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    // Leitura | Escrita
    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\n| Potencial Motor:\t" + getPotenciaDoMotor();
    }

}
