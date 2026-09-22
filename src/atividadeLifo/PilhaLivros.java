public class PilhaLivros {
    private Livro[] pilhaLivros;
    private Livro[] auxFila;
    private int quantidade;
    private int max;
    private int topo;

    public PilhaLivros() {
        this.max = 10;
        this.quantidade = 0;
        this.topo = -1;
        this.pilhaLivros = new Livro[10];
    }

    public PilhaLivros(int maxLivros) {
        this.max = maxLivros;
        this.quantidade = 0;
        this.topo = -1;
        this.pilhaLivros = new Livro[maxLivros];
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getMax() {
        return max;
    }

    /**
     * Métodos de adicionar livros no topo da pilha, conforme a política LIFO
     * 
     * @param livro
     * @return boolean
     */
    public Boolean adicionarLivroNaPilha(Livro livro) {
        if (this.quantidade == this.max) {
            this.aumentaCapacidadePilha();
        }
        if (this.quantidade < this.max) {

            if (!verificarDuplicadePilha(livro.getIdLivro())) {
                this.topo++;
                pilhaLivros[topo] = livro;
                this.quantidade++;
                return true;
            }
        }
        return false;
    }

    /**
     * Métodos de remover último livro na pilha, conforme a política LIFO
     * 
     * @return boolean
     */
    public Boolean removerLivroDaPilha() {
        if (quantidade > 0) {
            this.pilhaLivros[topo] = null;
            this.topo--;
            this.quantidade--;
            return true;
        }
        return false;
    }

    /**
     * método para redimensionar a estrutura, tornando-a dinâmica sempre que
     * necessário
     * 
     */
    private void aumentaCapacidadePilha() {
        int aumentaCapacidade = max + Math.round(max * 1.5f);
        auxFila = new Livro[aumentaCapacidade];

        for (int i = 0; i < max; i++) {
            if (pilhaLivros[i] != null) {
                auxFila[i] = pilhaLivros[i];
            }
        }

        max = aumentaCapacidade;
        pilhaLivros = auxFila;
    }

    /**
     * Método para ver a quantidade de elementos que há na pilha
     * 
     * @return
     */
    public int contarLivroNaPilha() {
        // int totalLivros = 0;

        // for (Livro livro : pilhaLivros) {
        // if (livro != null) {
        // totalLivros++;
        // }
        // }

        return this.quantidade;
    }

    /**
     * Método para ver a capacidade máxima de elementos que a pilha suporta
     * 
     * @return int
     */
    public int retonarCapacidadePilha() {
        return this.max;
    }

    /**
     * Método para evitar duplicidade de elementos na mesma pilha
     * 
     * @param idVerificado
     * @return boolean
     */
    public boolean verificarDuplicadePilha(int idVerificado) {
        if (quantidade > 0) {
            for (int i = 0; i < quantidade; i++) {
                if (pilhaLivros[i].getIdLivro() == idVerificado) {
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Método para verificar se um dado elemento está ou não na estrutura
     * 
     * @param nomePesquisado
     * @param idPesquisado
     * @return boolean
     */
    public boolean pesquisarLivroPilha(String nomePesquisado, int idPesquisado) {
        String livroNomeLower;
        if (!nomePesquisado.equalsIgnoreCase("")) {
            nomePesquisado = nomePesquisado.toLowerCase();
            if (quantidade > 0) {
                for (int i = 0; i < quantidade; i++) {
                    livroNomeLower = pilhaLivros[i].getNomeLivro().toLowerCase();
                    if (livroNomeLower.contains(nomePesquisado)) {
                        return true;
                    }
                }
            }
        }
        if (idPesquisado != 0) {
            if (quantidade > 0) {
                for (int i = 0; i < quantidade; i++) {
                    if (pilhaLivros[i].getIdLivro() == idPesquisado) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * Método para imprimir, que deve retornar uma string da estrutura de dados
     *
     */
    public String imprimirPilhaLivros() {
        StringBuilder atrBuilder = new StringBuilder();
        if (this.quantidade > 0) {
            for (Livro livro : pilhaLivros) {
                if (livro != null) {
                    atrBuilder.append(livro.imprimirLivro() + "\n");
                }
            }
            return atrBuilder.toString();
        }

        return "Nenhum livro na Pilha!";
    }

}
