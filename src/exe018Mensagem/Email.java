package exe018Mensagem;

public class Email extends Mensagem {

    // atributo
    private String assunto;

    // Leitura / Escrita
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    // Construtores
    public Email() {
        this.assunto = "";
    }

    public Email(String destinatario, String conteudo, String assunto) {
        super(destinatario, conteudo);
        setAssunto(assunto);
    }

    // Metodos
    @Override
    public String enviar() {
        return "Enviando E-mail para "
                + getDestinatario()
                + " com o assunto \"" + getAssunto() + "\".";
    }

}
