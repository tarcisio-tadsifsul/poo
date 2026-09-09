/*
 * Last In, First Out - LIFO
 */
package lifo;
public class Principal {
    public static void main(String[] args) {
        ArquivoTexto arquivo = new ArquivoTexto(3);
        
        arquivo.empilhar("Ola");
        arquivo.empilhar("mundo");
        System.out.println(arquivo.imprimir());
    }
}
