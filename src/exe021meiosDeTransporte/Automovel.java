package exe021meiosDeTransporte;

public class Automovel extends Veiculo {

    // Atributos
    private double potencialDoMotor;

    // Construtores
    public Automovel() {
        this.potencialDoMotor = 0.0;
    }

    public Automovel(
        String marca,
        String modelo,
        int qtdRodas,
        int velocidade,
        double potencialDoMotor
    ) {
        super(marca, modelo, qtdRodas, velocidade);
        this.potencialDoMotor = potencialDoMotor;
    }

    // Leitura | Escrita
    public double getPotencialDoMotor() {
        return potencialDoMotor;
    }

    // Metodos
    @Override
    public String toString(){
        return super.toString() +
                "\n| Potencial Motor:\t" + getPotencialDoMotor();
    }

    @Override
    public void imprimirInformacoes(){
        System.out.println(
            this.toString()
        );
    }

//fim classe    
}
