package tarcisiojacobsenn;

public class TarcisioJacobsenn {
    public static void main(String[] args) {
        Vendedor vendr1 = new Vendedor("Fulano de Tal", "12345678900", 3000.00, 2.5, 3);
        
        Venda v1 = new Venda("Produto P1", 5149.9);
        Venda v2 = new Venda("Produto P2", 3145.8);
        Venda v3 = new Venda("Produto P3", 1148.5);

        vendr1.registrarVenda(v1);
        System.out.println(v1.toString());
        vendr1.registrarVenda(v2);
        System.out.println(v2.toString());
        vendr1.registrarVenda(v3);
        System.out.println(v3.toString());
        
        vendr1.estornarVenda(3);
        
        System.out.println(vendr1.gerarExtratoMes());

        
    }
    
}
