package exe28Matematica;

public class Matematica {

    // Atributos
    private double valor1;
    private double valor2;

    // Construtor
    public Matematica(){
        this.valor1 = 0.0;
        this.valor2 = 0.0;
    }

    public Matematica(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // leitura | Escrita
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    //Metodo
    public double somar(double v1, double v2){
        return v1 + v2;
    }

    public double dividir(double v1, double v2){
        if (v1 != 0){
            return v1 / v2;
        }
        return 0.0;
    }
    
}
