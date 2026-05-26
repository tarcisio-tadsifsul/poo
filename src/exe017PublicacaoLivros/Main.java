package exe017PublicacaoLivros;

public class Main {
    public static void main(String[] args) {
        Publicacao livroP = new Publicacao(
                1122,
                "Mestre dos Codigos",
                "Codando Byteson");
        
        System.out.println("\n" + livroP.exibirFicha());
        
//        -------------------------

        Livro livroL = new Livro(
                "LV001ABC",
                1001,
                1212,
                "Do Zero ao Avancado em 1 dia (Contem ironia)",
                "Programano Sitios"
        );
        
        System.out.println("\n" + livroL.exibirFicha());
        
//        -------------------------
        
        LivroFisico livroF = new LivroFisico(
                "PROG-E1",
                320,
                "LV002ZXY",
                413,
                1236,
                "Desenvolvimento Mobile",
                "Instancio VarLet"
        );
        
        System.out.println("\n" + livroF.exibirFicha());
        System.out.println(livroF.calcularfrete(30));
        
        //        -------------------------
        
        Ebook livroD = new Ebook(
                2.1,
                ".epub",
                "LV003KQX",
                360,
                9632,
                "Banco de Dados Viciados",
                "Armazenatus Persistents"
        );
        
        System.out.println("\n" + livroD.exibirFicha());
    }
}
