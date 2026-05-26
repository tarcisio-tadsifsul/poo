
package exe010funcionarios;

public class Departamento {
    private String nomeDepto;
    private Funcionarios[] listaFuncionarios; // Vetor de objetos Funcionarios
    private int contador = 0;
  
    // Construtor
    public Departamento(String nome){
        this.nomeDepto = nome;
        this.listaFuncionarios = new Funcionarios[10]; // inicializa o vetor com 10 posiçoes
    }
    
    // Método Leitura
    public String getNomeDepto() {
        return nomeDepto;
    }
    
    
    // Metodo
    public void admitirFuncionario(Funcionarios f){
        if (contador < listaFuncionarios.length) {
            listaFuncionarios[contador] = f;
            contador++;
        }
    }
        
    public void listarFuncionarios(){
        System.out.println("Lista de Funcionario Depto: " + this.getNomeDepto());
//        for(int i = 0; i < this.listaFuncionarios.length; i)
        for (Funcionarios f : listaFuncionarios) {
            if (f != null){
                System.out.println("- " + f.getNome());
            }
        }
    }
// end class    
}

