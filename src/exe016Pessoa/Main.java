package exe016Pessoa;

public class Main {
    public static void main(String[] args) {
        Endereco stEnderecoP = new Endereco("Rua Gerano Bug, 123");
        Pessoa alguem = new Pessoa(
                "Programano Codes", stEnderecoP
        );        
        System.out.println( alguem.exibirDados("") );
        
        
        Endereco stEnderecoPf = new Endereco("Rua Testano Aplet, 456");
        Fisica pf = new Fisica(
                "Code Silva",
                stEnderecoPf,
                "123.456.789-00",
                "01/01/2000"
        );        
        System.out.println( pf.exibirDados() );
        
        Endereco stEnderecoPj = new Endereco("Rua Corrigindo Error, 100");
        Juridica pj = new Juridica(
                "Degundado Costa",
                stEnderecoPj,
                "987.654.321/0001-00",
                "Informatic"
        );
        System.out.println( pj.exibirDados() );
    }
}
