package exe021meiosDeTransporte;

public abstract class Veiculo {

    // Atributos
    private String marca;
    private String modelo;
    private int qtdRodas;
    private int velocidade = 0;

    // Construtor
    public Veiculo(){}

    public Veiculo(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade
        ){
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
    public String toString(){
        return "\nTipo " + this.getClass().getSimpleName() +
                "\n| Marca:\t\t" + getMarca() +
                "\n| Modelo:\t\t" + getModelo() +
                "\n| QTD Rodas:\t\t" + getQtdRodas() +
                "\n| Velocidade:\t\t" + getVelocidade();
    }

    // Método void herdado por todas as subclasses
    public void imprimirInformacoes(){
        System.out.println(
            this.toString() // O "this" chamará o toString da classe real do objeto (polimorfismo)
        );
    }

    public void acelerar(int valor){
        
    }


//fim classe    
}
