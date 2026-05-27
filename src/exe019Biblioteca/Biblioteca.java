
package exe019Biblioteca;

import java.time.LocalDate;

public class Biblioteca {
    
    Emprestimo[] emprestimos = new Emprestimo[100];
    
    public void realizarEmprestimo(
                    Usuario usuario, 
                    Livro livro, 
                    LocalDate dataEmprestimo,
                    LocalDate dataDevolucao
        ){
        if (livro != null || usuario != null){
            for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] != null) {
                Emprestimo emprestimos = new Emprestimo(
                                            usuario,
                                            livro,
                                            dataEmprestimo,
                                            dataDevolucao
                );
            }
        }           
        }                   
    }
    
    public boolean devolverLivro(Livro livro){
        if (livro != null){
            for(int i=0; i<emprestimos.length; i++){
                if (emprestimos[i].getLivro().getTitulo().equals(livro.getTitulo())){
                    emprestimos[i].setLivro(null);
                    emprestimos[i].setDataDevolucao(LocalDate.of(2026, 05, 26));
                    return true;
                }
            }
        }
        return false;
    }
    
    public String imprimirEmprestimos(){
        String dados = "";
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] != null) {
                dados = dados + emprestimos[i].exibirEmprestimo() + "\n";
            }
        }
        return dados;
    }
}
