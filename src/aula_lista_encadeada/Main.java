package aula_lista_encadeada;

public class Main {
    public static void main(String[] args) {
       MyLinkedList <String> lista = new MyLinkedList<>();

       lista.addLast("C++");
       lista.addLast("Python");
       lista.addLast("Java");
       
       lista.addFirst("Assembly");
       
       lista.addLast("HTML");
       lista.addLast("CSS");
       
       lista.removeLast();
       lista.removeFirst();

       lista.addMiddle("SQL");
       
       lista.addLast("Postgres");
       lista.addLast("NodeJS");
       lista.addLast("TypeScript");
       
       lista.removeMiddle();
       
       lista.addPosicaoEspecifica(2, "PHP");
       lista.removePosicaoEspecifica(8);

       System.out.println("");
       System.out.println(lista.imprimir());
       
       String elemento = "Java";
       String contemNaLista = lista.containsEl(elemento) ? "Sim" : "Nao";
        System.out.println("\nContem '" + elemento + "' na lista? " + contemNaLista);
      

    }
}
