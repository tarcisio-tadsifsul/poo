package exe28Matematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        double v1 = 0.0, v2 = 0.0;
        Matematica mat = new Matematica(v1, v2);

        String[] textos = new String[5];

        textos[0] = "\nCALCULADORA SIMPLES";
        textos[1] = "\nOperações:\n [1] Somar\t[2] Subtrair\n [3] Dividir\t[4] Multiplicar\n [0] Sair";
        textos[2] = "\nOperacao: ";
        textos[3] = "Informe valor 1: ";
        textos[4] = "Informe valor 2: ";

        while (true) { 
            System.out.printf("%s \n %s \n %s", textos[0], textos[1], textos[2]);
            op = sc.nextInt();

            if (op == 0){
                System.out.println("Saindo...");
                break;
            }

            System.out.printf("%s", textos[3]);
            v1 = sc.nextDouble();
            System.out.printf("%s", textos[4]);
            v2 = sc.nextDouble();

            switch (op) {
                case 1 -> System.out.println("\nResultado: " + mat.subtrair(v1, v2));
                case 2 -> System.out.println("\nResultado: " + mat.subtrair(v1, v2));
                case 3 -> System.out.println("\nResultado: " + mat.dividir(v1, v2));
                case 4 -> System.out.println("\nResultado: " + mat.multiplicar(v1, v2));
                default -> System.out.println("Opcao Invalida!");
            }
        }
    }
}
