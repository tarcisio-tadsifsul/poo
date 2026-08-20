package desafioLocadoraVeiculos;

public class Carro extends Veiculo {
    private static int auxId = 0;
    private int id = 0;
    private String categoria;
    private String[] acessorios;

    public Carro() {
        super();
        this.categoria = "Sem Categoria";
        this.acessorios = new String[3];
    }

    public Carro(
            String marca, String modelo, double diaria,
            String categoria) {
        super(marca, modelo, diaria);
        this.id = incrementarId();
        this.categoria = categoria;
        this.acessorios = new String[3];
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    private int incrementarId() {
        this.id = ++auxId;
        return this.id;
    }

    public boolean adicionarAcessorio(String acessorio) {

        for (int i = 0; i < this.acessorios.length; i++) {

            if (this.acessorios[i] == null) {
                this.acessorios[i] = acessorio;

                System.out.println("\nAcessório adicionado!");
                return true;
            }
        }
        System.out.println("\nNumero total de acessorios atingido!");
        return false;
    }

    public boolean removerAcessorio(String nomeAcessorio) {

        for (int i = 0; i < this.acessorios.length; i++) {

            if (this.acessorios[i] != null && this.acessorios[i].equalsIgnoreCase(nomeAcessorio)) {
                this.acessorios[i] = null;

                System.out.println("\nAcessorio removido!");
                return true;
            }

        }
        System.out.println("\nAcessorio não encontrado!");
        return false;
    }

    private String mostrarAcessorios() {
        String listaAcessorios = "";

        for (String acessorio : acessorios) {
            if (acessorio != null) {
                listaAcessorios += "\n| - " + acessorio;
            }
        }

        return listaAcessorios;
    }

    private String retornaDados() {
        return "| ID: " + this.id +
                "\n| Categoria: " + this.categoria;
    }

    @Override
    public String toString() {
        return "\n| DADOS DO VEÍCULO" +
                "\n-------------------------" +
                "\n" + this.retornaDados() +
                "\n" + super.toString() +
                "\n-------------------------" +
                "\n| ACESSORIOS" +
                this.mostrarAcessorios();

    }

}
