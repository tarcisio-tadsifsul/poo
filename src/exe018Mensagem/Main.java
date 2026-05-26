package exe018Mensagem;

public class Main {
    public static void main(String[] args) {
        // Mensagem Generica
        Mensagem msgA = new Mensagem(
                "Fulano",
                "Mensagem de Teste do Fulano");

        System.out.println(msgA.enviar());

        // Email
        Email msgEmail = new Email(
                "Siclano",
                "Você se cadastrou no App",
                "Cadastro Realizado!");

        System.out.println(msgEmail.enviar());

        // SMS
        String st161 = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec";
        String st160 = "Esta é uma mensagem com menos de 160 caracteres de texto!";

        Sms shortMsg1 = new Sms("Beltrano", st160);
        System.out.println(shortMsg1.enviar());

        Sms shortMsg2 = new Sms("Beltrano", st161);
        System.out.println(shortMsg2.enviar());

    }
}
