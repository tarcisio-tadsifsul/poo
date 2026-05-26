
package exe010funcionarios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Funcionarios f1 = new Funcionarios();        
//        System.out.println(f1.imprimirDados());

        Departamento deptoRh = new Departamento("RH");
        
        Funcionarios func1 = new Funcionarios(
            "Jonas", "1122334455", 1500.00, deptoRh, "01/09/2000" 
        );
        deptoRh.admitirFuncionario(func1);
        
        Funcionarios func2 = new Funcionarios(
            "Marcos", "1020304050", 1000.00, deptoRh, "01/01/2000" 
        );
        deptoRh.admitirFuncionario(func2);
        
        Funcionarios func3 = new Funcionarios(
            "Sergio", "9988776644", 2000.00, deptoRh, "01/05/2000" 
        );
        deptoRh.admitirFuncionario(func3);
        

        deptoRh.listarFuncionarios();
    // fim main
    }
}
