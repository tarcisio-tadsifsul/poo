package dadosEstruturados;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private FilaPedidos fila;
    
    
    public Menu(){
        this.sc = new Scanner(System.in);
        this.fila = new FilaPedidos();
    }

    public void start(){
        String opcao = "";
        
        do {            
            System.out.println("\nIniciar Pedidos:\n--------------------");
            // sout com menus
            System.out.println("Digite opcao menu: ");
            opcao = sc.next();
            
            switch (opcao) {
                case "0":
                    sc.close();
                    // fila = null se encerrar o programa
                    break;
                case "opcao menu 1,2,3,4...":
                    // entra no menu e chama o metodo conforme a opcap
                    break;
                default:
                    // sout default
                    break;
            }
        } while (opcao != "0");
        
               
        
    }
}
