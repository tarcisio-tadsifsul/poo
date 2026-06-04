package exe021meiosDeTransporte;

public class Carro extends Automovel {

    // atributos
    private int qtdPortas;

    // Construtores
    public Carro() {
        this.qtdPortas = 0;
    }

    public Carro(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade,
            double potenciaDoMotor,
            int qtdPortas) {
        super(marca, modelo, qtdRodas, velocidade, potenciaDoMotor);
        this.qtdPortas = qtdPortas;
    }

    // Leitura | Escrita
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\n| QTD Portas:\t\t" + getQtdPortas();
    }

}
