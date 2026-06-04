package exe22FaturaLoja;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("0001", 10);

        ItemFatura item1 = new ItemFatura(
                "Mouse",
                "Mouse Gamer",
                1,
                59.99);

        fatura1.adicionarItem(item1);

        ItemFatura item2 = new ItemFatura(
                "Teclado",
                "Teclado Mecanico",
                1,
                89.99);

        fatura1.adicionarItem(item2);

        System.out.println(fatura1.gerarFatura());
    }
}
