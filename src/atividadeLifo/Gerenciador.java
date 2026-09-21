import java.util.Scanner;

public class Gerenciador {
    private Scanner sc;
    private PilhaLivros pilha;
    private Livro novoLivro;
    private ColecaoLivros colecao;
    private String opcao;

    public Gerenciador(){
        this.sc = new Scanner(System.in);
        this.colecao = new ColecaoLivros();
        // this.pilha = new PilhaLivros(0);
    }

    public void encerrar() {
        System.exit(0);
    }

    public void iniciar(){
        this.colecao.iniciarColecao();
        
        System.out.println("\n===== PILHA DE LIVROS =====\n");
        System.out.print("| Informe a quantidade máxima de Livro da pilha \n-> _");
        this.pilha = new PilhaLivros(sc.nextInt());

        // Menu Principal
        do { 
            System.out.println("\n---- MENU -----"
                    + "\n[1] Mostrar Coleção"
                    + "\n[2] Adicionar Livro na Pilha"
                    + "\n[3] Remover Livro na Pilha"
                    + "\n[4] Mostrar Pilha"
                    + "\n[5] Mostrar Quantidade na Pilha"
                    + "\n[6] Mostrar Capacidade Atual da Pilha"
                    + "\n[7] Pesquisar Livro na Pilha"
                    + "\n[0] Sair");
            System.out.print("\n-> _");
            opcao = sc.next();

            switch (opcao) {
                
                // Encerra Progama
                case "0":
                    pilha = null;
                    novoLivro = null;
                    colecao = null;
                    sc.close();
                    System.out.println("[FIM] Encerrando programa...");
                    encerrar();
                    break;
                
                case "1":
                    System.out.println("\n---- COLEÇÃO LIVROS -----");
                    System.out.print(colecao.mostrarColecao());
                    break;

                case "2":
                    System.out.println("\n[2] Adicionar Livro na Pilha");
                    System.out.println(colecao.mostrarColecao());
                    System.out.print("Informe o ID do Livro: _");
                    if (pilha.adicionarLivroNaPilha(colecao.getItem(sc.nextInt()))) {
                        System.out.println("[OK] Livro adicionado com Sucesso!");
                        System.out.println(pilha.imprimirPilhaLivros());
                    } else {
                        System.out.println("[ERRO] Nenhum Livro com esse ID na Coleção");
                    }
                    break;

                case "3":
                    System.out.println("\n[3] Remover Livro na Pilha");
                    if(pilha.removerLivroDaPilha()){
                        System.out.println("\n[OK] Livro Removido do topo da Pilha!");
                        System.out.println(pilha.imprimirPilhaLivros());
                    } else {
                        System.out.println("[ERRO] Nenhum Livro Removido da Pilha");
                    }
                    break;
                case "4":
                    System.out.println("\n[4] Mostrar Pilha");
                    System.out.println(pilha.imprimirPilhaLivros());
                    break;
                case "5":
                    System.out.println("\n[5] Mostrar Quantidade");
                    System.out.println(pilha.contarLivroNaPilha());
                    break;

                case "6":
                    System.out.println("\n[5] Mostrar Capacidade");
                    System.out.println(pilha.retonarCapacidadePilha());
                    break;
                case "7":
                        // Faltou!
                        break;
            
                default:
                    System.out.println("\n[ERRO] Opcao Invalida!\n");
                    break;
            }

        } while (!opcao.equals("0"));
    }

}
