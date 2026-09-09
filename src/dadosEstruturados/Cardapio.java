package dadosEstruturados;

public class Cardapio {
    // Atributos
    static int idAux;
    private String idItem;
    private Item itens[];
    private int maxItens;
    private int totalItens;

    // Construtor
    public Cardapio(){
        this.idItem = "IT0" + (++idAux);
        this.itens = new Item[50];
    }
    
    // Inicializa items no cardápio
    
    //public adicionarItemCardapio(){}
    
    Item item1 = new Item("Xis Salada", 24.90);
    Item item2 = new Item("Hot Dog", 18.90);
    Item item3 = new Item("Batata Frita", 14.90);
    Item item4 = new Item("Refrigerante", 6.20);
    Item item5 = new Item("Agua", 3.50);
    
    // Métodos
    public String mostrarCardapio(){
        String listaCardapio = "";
        for (Item item : itens) {
            if (item != null) {
                listaCardapio += item.imprimirItem() + "\n";
            }
        }
        return "\n--------------------"
                + "\nITEM #" + this.idItem + " | Nome: " 
                + "\n--------------------"
                + "\n" + listaCardapio
                + "--------------------"
                + "\n";
    }
}
