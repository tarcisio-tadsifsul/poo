package atividadeFifo;

public class Cardapio {
    // Atributos
    private Item itens[];

    // Construtor
    public Cardapio() {
        this.itens = new Item[10];
    }

    // Getters

    public Item getItem(int id) {
        return this.itens[id];
    }

    // Inicializa items no cardápio
    public void iniciarCardapio() {
        itens[0] = new Item("Xis Salada", 24.90);
        itens[1] = new Item("Hot Dog", 18.90);
        itens[2] = new Item("Batata Frita", 14.90);
        itens[3] = new Item("Refrigerante", 6.20);
        itens[4] = new Item("Agua", 3.50);
    }

    // Ideia de método adicionarItemCardapio(){}

    // Métodos

    /**
     * Cria uma string com a lista dos itens do cardápio
     * 
     * @return
     */
    public String mostrarCardapio() {
        if (itens.length > 0) {
            String listaCardapio = "";

            for (int i = 0; i < itens.length; i++) {
                if (itens[i] != null) {
                    listaCardapio += (i + 1) + ". " + itens[i].imprimirItem() + "\n";
                }
            }
            return listaCardapio;
        }
        return "\n[SEM ITENS NO CARDAPIO]\n";
    }
}
