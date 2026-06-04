# Exercício: Meios de Transporte

## Classe Main

```java
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
            bike.acelerar(50);
            bike.frear(20);

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
            moto.acelerar(100);
            moto.frear(35);

        }
    }

```

## Classe Veículo

```java
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
        this.velocidade -= valor;
        imprimirVelocidade("[#] Freou!", getVelocidade());
    }

    private void imprimirVelocidade(String acao, int velocidade) {
        System.out.println(acao + " Velocidade atual = " + velocidade + " km/h");
    }

    // fim classe
}
```

### Classe Bicicleta

```java
    package exe021meiosDeTransporte;

public class Bicicleta extends Veiculo {

    // Atributo
    private int numMarchas;
    private boolean bagageiro;

    // Construtor
    public Bicicleta() {
        this.numMarchas = 1;
        this.bagageiro = false;
    }

    public Bicicleta(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade,
            int numMarchas,
            boolean bagageiro) {
        super(marca, modelo, qtdRodas, velocidade);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }

    // Leitura | Escrita
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    // Metodos
    public String toString() {
        return super.toString() +
                "\n| QTD Marchas:\t\t" + getNumMarchas() +
                "\n| Bagageiro:\t\t" + (isBagageiro() ? "Sim" : "Não");
    }

}
```

### Classe Automovel

```java
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
            double potencialDoMotor) {
        super(marca, modelo, qtdRodas, velocidade);
        this.potencialDoMotor = potencialDoMotor;
    }

    // Leitura | Escrita
    public double getPotencialDoMotor() {
        return potencialDoMotor;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\n| Potencial Motor:\t" + getPotencialDoMotor();
    }

    // @Override
    // public void imprimirInformacoes(){
    // System.out.println(
    // this.toString()
    // );
    // }

    // fim classe
}
```

#### Classe Carro

```java
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
            double potencialDoMotor,
            int qtdPortas) {
        super(
                marca, modelo, qtdRodas, velocidade,
                potencialDoMotor);
        this.qtdPortas = qtdPortas;
    }

    // Leitura | Escrita
    public int getqtdPortas() {
        return qtdPortas;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\n| QTD Portas:\t\t" + getqtdPortas();
    }

    // @Override
    // public void imprimirInformacoes() {
    // System.out.println(
    // this.toString());
    // }

    // fim classe
}
```

#### Classe Moto

```java
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
        super(
                marca, modelo, qtdRodas,
                velocidade, potencialDoMotor);
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
```
