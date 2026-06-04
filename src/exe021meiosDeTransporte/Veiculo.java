package exe021meiosDeTransporte;

public abstract class Veiculo {

    // Atributos
    private String marca;
    private String modelo;
    private int qtdRodas;
    private int velocidade = 0;

    // Construtor
    public Veiculo() {
        this.marca = "Sem Marca";
        this.modelo = "Sem Modelo";
        this.qtdRodas = 0;
        this.velocidade = 0;
    }

    public Veiculo(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.velocidade = velocidade;
    }

    // Leitura | Escrita
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Metodos

    @Override
    // toString base com dados gerais
    public String toString() {
        return "\n-------------------------" +
                "\nVeiculo: " + this.getClass().getSimpleName() +
                "\n| Marca:\t\t" + getMarca() +
                "\n| Modelo:\t\t" + getModelo() +
                "\n| QTD Rodas:\t\t" + getQtdRodas() +
                "\n| Velocidade:\t\t" + getVelocidade();
    }

    // Método void herdado por todas as subclasses
    public void imprimirInformacoes() {
        System.out.println(
                this.toString() // O "this" chamará o toString da classe real do objeto (polimorfismo)
        );
    }

    // Método para acelerar o veículo
    public void acelerar(int valor) {
        this.velocidade += valor;
        imprimirVelocidade("[>] Acelerou!", getVelocidade());
    }

    // Método para reduzir a velocidade do veículo
    public void frear(int valor) {
        if (valor > this.velocidade) {
            this.velocidade = 0;
        } else {
            this.velocidade -= valor;
        }
        imprimirVelocidade("[#] Freou!", getVelocidade());
    }

    private void imprimirVelocidade(String acao, int velocidadeAtual) {
        System.out.println(acao + " Velocidade atual = " + velocidadeAtual + " km/h");
    }

}
