package exe017PublicacaoLivros;

public class LivroFisico extends Livro{
    
    //atributo
    private String localizacaoEstante;
    private int pesoGramas;       
    
    // Leitura / Escrita
    public String getLocalizacaoEstante() {
        return localizacaoEstante;
    }

    public void setLocalizacaoEstante(String localizacaoEstante) {
        this.localizacaoEstante = localizacaoEstante;
    }

    public double getPesoGramas() {
        return pesoGramas;
    }

    public void setPesoGramas(int pesoGramas) {
        if(pesoGramas > 0){
            this.pesoGramas = pesoGramas;
        } else {
            this.pesoGramas = 100;
        }
    }
        
    // Construtor
    public LivroFisico(){
        this.localizacaoEstante = "N/A";
        this.pesoGramas = 0;
    }
    
    public LivroFisico(
            String localEstante,
            int pesoGramas,
            String isbn,
            int numeroPaginas,
            int id,
            String titulo,
            String autor
    ){
        super(isbn, numeroPaginas, id, titulo, autor);
        setLocalizacaoEstante(localEstante);
        setPesoGramas(pesoGramas);
    }

    // Metodos
    
    public String calcularfrete(double distanciaKm){
        double valorFrete = 0.0;
        if(distanciaKm > 0){
            valorFrete = this.getPesoGramas() * distanciaKm * 0.05;
            return "|----------------------" + 
                "\n| Valor Frete:\t" + "R$ " + valorFrete;
        } else {
            return "|----------------------" + 
                "\n| Valor Frete:\tDistancia Invalida";
        }
        
    }    
    
    @Override
    public String exibirFicha(){
        return super.exibirFicha() + 
                "\n| Tipo:\t\tFisico" +
                "\n| Estante:\t" + this.getLocalizacaoEstante() +
                "\n| Peso:\t\t" + this.getPesoGramas() + "gr";
    }
}
