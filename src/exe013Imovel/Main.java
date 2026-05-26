package exe013Imovel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);       
        int opcao = 0;

        while (true) {
            System.out.println("\n----------------------");
            System.out.println("\nMenu Imobiliaria: \n[1] Geral \n[2] Novo \n[3] Velho \n[0] Finalizar\n");
            System.out.print("Informe: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0 -> {
                    sc.close();
                    System.out.println("Encerrando...");
                    return;
                }
                case 1 -> {
                    Imovel geral = new Imovel(
                            "Rua Imovel Qualquer", 100000.00
                    );
                    System.out.println(geral.exibirDados());
                }
                case 2 -> {
                    Novo novoImovel = new Novo(
                            "Rua Novo Imovel", 150000.00, 5000.00
                    );
                    System.out.println(novoImovel.exibirDados());
                }
                case 3 -> {
                    Velho velhoImovel = new Velho(
                            "Rua Velho Imovel", 80000.00, 3000.00
                    );
                    System.out.println(velhoImovel.exibirDados());
                }
                default -> {
                    System.out.println("Opcao Invalida!");
                }
            }
        }
               
    // end class
    }        
}