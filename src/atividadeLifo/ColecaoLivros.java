public class ColecaoLivros {
    private Livro[] colecao;

    public ColecaoLivros() {
        this.colecao = new Livro[5];
    }

    public Livro getItem(int id) {
        return this.colecao[id];
    }

    public void iniciarColecao() {
        colecao[0] = new Livro("Programação C++", "João Cê Mais Mais");
        colecao[1] = new Livro("Lógica Matemática", "Mario Numerus");
        colecao[2] = new Livro("Banco de Dados SQL", "Salvador Dados");
        colecao[3] = new Livro("Tecnologia Social", "Carlos Silva");
        colecao[4] = new Livro("Historia da Informação", "Pedro Dados");
    }

    public boolean verificaLivroPorId(int id) {
        for (int i = 0; i < colecao.length; i++) {
            if (colecao[i] != null && colecao[i].getIdLivro() == (id)) {
                return true;
            }
        }
        return false;
    }

    public String mostrarColecao() {
        if (colecao.length > 0) {
            String listaLivrosColecao = "";

            for (int i = 0; i < colecao.length; i++) {
                if (colecao[i] != null) {
                    listaLivrosColecao += colecao[i].imprimirLivro() + "\n";
                }
            }
            return listaLivrosColecao;
        }
        return "\n[NENHUM LIVRO NA COLECAO]\n";
    }
}
