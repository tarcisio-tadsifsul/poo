package exe23Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {

        Empregado func1 = new Empregado(
                "Programano",
                "Appson",
                1400.00);

        Empregado func2 = new Empregado(
                "Desenvilson",
                "Codis",
                1500.00);

        System.out.println(
                "\nEmpregados:\n"
                        + func1.imprimirInfos()
                        + "\n"
                        + func2.imprimirInfos());

        func1.aumentarSalario(10);
        func2.aumentarSalario(10);

        System.out.println(
                "\n--------------------\n"
                        + "\nAumento de Salario:\n"
                        + func1.imprimirInfos()
                        + "\n"
                        + func2.imprimirInfos());

    }
}
