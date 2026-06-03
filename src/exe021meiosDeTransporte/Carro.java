package exe021meiosDeTransporte;

public class Carro extends Automovel{

    // atributos
    private int qtdPortas;

    // Construtores
    public Carro(){
        this.qtdPortas = 0;
    }

    public Carro(
        String marca,
        String modelo,
        int qtdRodas,
        int velocidade,
        double potencialDoMotor,
        int qtdPortas
    ){
        super(
            marca, modelo, qtdRodas, velocidade,
            potencialDoMotor
        );
        this.qtdPortas = qtdPortas;
    }

    // Leitura | Escrita
    public double getqtdPortas() {
        return qtdPortas;
    }

    // Metodos
    @Override
    public String toString(){
        return super.toString() +
                "\n| QTD Portas:\t" + getqtdPortas();
    }

    @Override
    public void imprimirInformacoes(){
        System.out.println(
            this.toString()
        );
    }


// fim classe    
}
