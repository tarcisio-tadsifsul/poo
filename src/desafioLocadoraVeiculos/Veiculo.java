package desafioLocadoraVeiculos;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private double diaria;

    public Veiculo() {
        this.marca = "Sem Marca";
        this.modelo = "Sem Modelo";
        this.diaria = 0.0;
    }

    public Veiculo(String marca, String modelo, double diaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.diaria = diaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    @Override
    public String toString() {
        return "| Marca: " + this.marca +
                "\n| Modelo: " + this.modelo +
                "\n| Diaria: R$ " + this.diaria;
    }
}
