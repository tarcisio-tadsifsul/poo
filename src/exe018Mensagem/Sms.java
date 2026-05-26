package exe018Mensagem;

public class Sms extends Mensagem {
    // atributos

    // Construtor
    public Sms() {
    };

    public Sms(String destinatario, String conteudo) {
        super(destinatario, conteudo);
    }

    // Metodos
    @Override
    public String enviar() {
        return getConteudo().length() > 160
                ? "[ERRO] SMS muito longo!"
                : "Enviando SMS para " + getDestinatario();
    }

}
