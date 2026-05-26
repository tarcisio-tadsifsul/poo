
package exe003produto;

public class Principal {
    public static void main(String[] args){
        Produto produtoA = new Produto("Mouse", 49.99, 30);
        
        System.out.println(produtoA.imprimirInfos());
        
        produtoA.removerEstoque(0);
        
        System.out.println(produtoA.imprimirInfos());
    }
}
