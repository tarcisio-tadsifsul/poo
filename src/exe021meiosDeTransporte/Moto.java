package exe021meiosDeTransporte;

public class Moto extends Automovel {

    // Atributo
    private boolean partidaEletrica;

    // Construtor
    public Moto() {
        this.partidaEletrica = false;
    }

    public Moto(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade,
            double potencialDoMotor,
            boolean partidaEletrica) {
        super(marca, modelo, qtdRodas, velocidade, potencialDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    // Leitura | Escrita
    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\n| Partida Elétrica:\t" + (isPartidaEletrica() ? "Sim" : "Não");
    }
}
