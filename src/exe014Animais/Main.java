
package exe014Animais;

public class Main {
    public static void main(String[] args){
        
        Cachorro dog = new Cachorro("Bob", "Caramelo");
        Gato cat = new Gato("Chico", "Siames");
        
        String template = "%s \n\n%s %s e %s!%n%n";
        
        // Exibe os dados do cachorro
        System.out.printf(
                template, 
                dog.exibirDados(),
                dog.getNome(),
                dog.latir(),
                dog.caminhar()
        );

        // Exibe os dados do gato
        System.out.printf(
                template,
                cat.exibirDados(),
                cat.getNome(),
                cat.miar(),
                cat.caminhar()
        );       
        
    }
}
