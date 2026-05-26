package exe018Mensagem;

public class Mensagem {

    // Atributos
    private String destinatario;
    private String conteudo;

    // Leitura / Escrita
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    // Construtor
    public Mensagem() {
        this.destinatario = "n/a";
        this.conteudo = "n/a";
    }

    public Mensagem(String destinatario, String conteudo) {
        setDestinatario(destinatario);
        setConteudo(conteudo);
    }

    // Metodos
    public String enviar() {
        return "Enviando mensagem generica para "
                + getDestinatario() + ".";
    }

}
