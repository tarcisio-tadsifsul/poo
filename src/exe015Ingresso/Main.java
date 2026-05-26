package exe015Ingresso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        
        System.out.print("Tipo de Ingresso: \n[1] Normal \n[2] Vip \n\nInforme Opcao: ");
        op = sc.nextInt();
        
        if (op == 1){
            Normal ingresso = new Normal(50.00);
            System.out.println( ingresso.imprimir() );
            System.exit(0);
        } else {
            System.out.println("Camarote Vip: \n[1] Inferior \n[2] Superior \n\nInforme Opcao: ");
            op = sc.nextInt();
            if (op == 1){
                CamaroteInferior vipInferior = new CamaroteInferior(100.00, 50.00, "Inferior");
                System.out.println(vipInferior.imprimir());
            }
        }
        
        
        
        
    }
}
