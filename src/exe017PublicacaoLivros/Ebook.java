package exe017PublicacaoLivros;

public class Ebook extends Livro{
    
    //atributo
    private double tamanhoMB;
    private String formatoArquivo;
    
    // Leitura / Escrita
    public double getTamanhoMB() {
        return tamanhoMB;
    }

    public void setTamanhoMB(double tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    
    // Construtor
    public Ebook(){
        this.tamanhoMB = 0.0;
        this.formatoArquivo = "n/a";
    }
    
    public Ebook(
            double tamanhoMB,
            String formatoArquivo,
            String isbn,
            int numeroPaginas,
            int id,
            String titulo,
            String autor) {
        super(isbn, numeroPaginas, id, titulo, autor);
        setTamanhoMB(tamanhoMB);
        setFormatoArquivo(formatoArquivo);
    }
    
    
    // Metodos
    
    public String gerarLinkDownload(){
        String tituloLink = getTitulo().toLowerCase().replaceAll(" ", "-");        
        return "https://biblioteca.com/download/" + tituloLink;
    }
    
    @Override
    public String exibirFicha() {
        return super.exibirFicha()
                +"\n| Tipo:\t\tEbook"
                + "\n| Tamanho: \t" + this.getTamanhoMB() + "MB"
                + "\n| Formato: \t" + this.getFormatoArquivo()
                + "\n| Link: \t" + gerarLinkDownload();
    }
    
//end class    


}
