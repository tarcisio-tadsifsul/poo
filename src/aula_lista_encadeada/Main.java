package aula_lista_encadeada;

public class Main {
    public static void main(String[] args) {
       myLinkedList <String> lista = new myLinkedList<>();

       lista.add("C++");
       lista.add("Python");
       lista.add("Java");
       lista.addFirst("Assembly");

       System.out.println("");
       System.out.println(lista.imprimir());

    }
}
