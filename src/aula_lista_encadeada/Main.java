package aula_lista_encadeada;

public class Main {
    public static void main(String[] args) {
       MinhaListaEncadeada <String> lista = new MinhaListaEncadeada<>();

       lista.add("C++");
       lista.add("Python");
       lista.add("Java");
       lista.addFirst("Assembly");

       System.out.println(lista.imprimir());

    }
}
