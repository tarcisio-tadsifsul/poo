import java.util.Scanner;

public class Gerenciador {
    private Scanner sc;
    private String opcao;
    private PilhaLivros pilha;
    private String maxPilha;
    private ColecaoLivros colecao;
    private int idLivro;
    private String nomeLivro;
    private String opPesquisa;

    public Gerenciador() {
        this.sc = new Scanner(System.in);
        this.colecao = new ColecaoLivros();
        // this.pilha = new PilhaLivros(0);
    }

    public void encerrar() {
        pilha = null;
        colecao = null;
        sc.close();
        System.out.println("[FIM] Encerrando programa...");
        System.gc(); // Solicita a limpeza explícita da memória antes de sair
        System.exit(0);
    }

    public void iniciar() {
        this.colecao.iniciarColecao();

        System.out.println("\n===== PILHA DE LIVROS =====\n");
        do {
            System.out.print("| Informe a quantidade máxima de Livro da pilha ou [s] Sair \n-> _");
            maxPilha = sc.next();
            if (maxPilha.equalsIgnoreCase("s")) {
                encerrar();
            }
            if (Integer.valueOf(maxPilha) > 0) {
                this.pilha = new PilhaLivros(Integer.valueOf(maxPilha));
            } else {
                System.out.println("\n[ATENCAO] A quantidade mínima deve ser 1!\n");
            }
        } while (Integer.valueOf(maxPilha) <= 0);

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
                    idLivro = sc.nextInt();
                    if (colecao.verificaLivroPorId(idLivro)) {
                        pilha.adicionarLivroNaPilha(colecao.getItem(idLivro));
                        System.out.println("[OK] Livro adicionadona com Sucesso!");
                        System.out.println(pilha.imprimirPilhaLivros());
                    } else {
                        System.out.println("[ERRO] Nenhum Livro com esse ID na Coleção");
                    }

                    break;

                case "3":
                    System.out.println("\n[3] Remover Livro na Pilha");
                    if (pilha.removerLivroDaPilha()) {
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
                    System.out.println("\n[6] Mostrar Capacidade");
                    System.out.println(pilha.retonarCapacidadePilha());

                    break;

                case "7":
                    System.out.println("\n[7] Pesquisar Livro na Pilha");
                    do {
                        System.out.println("Pesquisa por:\n[1] ID \n[2] Nome \n[0] Sair");
                        System.out.println("-> _");
                        opPesquisa = sc.next();
                        switch (opPesquisa) {
                            case "1":
                                System.out.print("Informe o ID do Livro: _");
                                idLivro = sc.nextInt();
                                if (pilha.pesquisarLivroPilha("", idLivro)) {
                                    System.out.println("[✓] O livro [ID-" + idLivro + "] está na pilha!");
                                }
                            case "2":
                                System.out.print("Informe o Nome do Livro: _");
                                nomeLivro = sc.nextLine();
                                if (pilha.pesquisarLivroPilha(nomeLivro, 0)) {
                                    System.out.println("[✓] O livro '" + nomeLivro + "' está na pilha!");
                                }
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("[XXX] Livro pesquisado não está na pilha!");
                                break;
                        }
                    } while (!opPesquisa.equals("0"));

                    System.out.print("Informe o ID ou Nome do Livro: _");

                    break;

                default:
                    System.out.println("\n[ERRO] Opcao Invalida!\n");
                    break;
            }

        } while (!opcao.equals("0"));
    }

}
