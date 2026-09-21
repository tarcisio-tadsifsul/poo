package atividadeFifo;

import java.util.Scanner;

public class Gerenciador {
    private Scanner sc;
    private FilaPedidos fila;
    private Pedido novoPedido;
    private String opcao;
    private String opPedido;
    private int idPedidoPesquisado;
    private String nomeCliente = "";
    private boolean pedidoExiste;
    private Cardapio cardapio;

    public Gerenciador() {
        this.sc = new Scanner(System.in);
        this.fila = new FilaPedidos();
        this.cardapio = new Cardapio();
    }

    public void finalizar() {
        System.exit(0);
    }

    public void iniciar() {

        System.out.println("\n----- | Iniciar Pedidos | -----\n");
        cardapio.iniciarCardapio();

        // Mostra Menu Principal
        do {
            System.out.println("[ -MENU- ]"
                    + "\n[1] Adicionar Pedido"
                    + "\n[2] Realizar Pedido"
                    + "\n[3] Mostrar Fila Pedidos"
                    + "\n[4] Pesquisar Pedido"
                    + "\n[0] Sair");
            System.out.print("\nOPCAO: _");
            opcao = sc.next();

            switch (opcao) {
                case "0":
                    fila = null;
                    System.out.println("[FIM] Encerrando programa...");
                    sc.close();
                    finalizar();
                    break;

                case "1":
                    System.out.println("\n[1] ADICIONAR PEDIDO");
                    System.out.print("Qual o nome do cliente?\nCliente: ");
                    nomeCliente = sc.next();

                    // Verifica se pedido existe:
                    pedidoExiste = fila.verificarPedidoJaExiste(nomeCliente);

                    if (!pedidoExiste) {
                        novoPedido = new Pedido(nomeCliente);
                        fila.adicionarPedidoNaFila(novoPedido);

                        // Menu Pedido
                        do {
                            // System.out.println("\n[Pedido #" + novoPedido.getIdPedido() + "]\n");
                            // Mostra Menu
                            System.out.println("\n[OPCOES: Pedido #" + novoPedido.getIdPedido() + "]"
                                    + "\n[1] Mostrar Cardápio"
                                    + "\n[2] Adicionar Item"
                                    + "\n[3] Remover Item"
                                    + "\n[4] Fechar Pedido");
                            System.out.print("\nOPCAO: _");
                            opPedido = sc.next();

                            switch (opPedido) {

                                // Mostrar cardápio de itens
                                case "1":
                                    System.out.println("\n[1] CARDAPIO\n");
                                    System.out.println(cardapio.mostrarCardapio());
                                    break;

                                // Adicionar item no pedido
                                case "2":
                                    System.out.println("\n[2] ADICIONAR ITEM\n");
                                    System.out.println(cardapio.mostrarCardapio());
                                    System.out.print("ITEM: _");
                                    novoPedido.adicinarItem(
                                            cardapio.getItem(
                                                    sc.nextInt()));
                                    break;

                                // Remover item do pedido
                                case "3":
                                    System.out.println("\n[3] REMOVER ITEM\n");
                                    System.out.println(novoPedido.mostrarItensPedido());
                                    System.out.print("NOME DO ITEM: _");
                                    novoPedido.removerItem(sc.next());
                                    break;

                                // Fechar pedido e voltar para Menu principal
                                case "4":
                                    System.out.println("\n[OK] Pedido Fechado!\n");
                                    break;

                                default:
                                    System.out.println("[ERRO] Opcao Invalida!\n");
                                    break;
                            }

                        } while (!opPedido.equals("4"));

                        System.out.println("\n[OK] Pedido Recebido com Sucesso!\n");
                    } else {
                        System.out.println("\n[ATENCAO] Cliente com pedido já em andamento!\n");
                    }

                    break;

                case "2":
                    System.out.println("\n[2] REALIZAR PEDIDO");
                    if (fila.realizarPedidoDaFila()) {
                        System.out.println("[OK] Pedido realizado!");
                    } else {
                        System.out.println("[AVISO] Nenhum pedido na Fila");
                    }
                    break;

                case "3":
                    if (fila.mostrarFilaPedidos().equalsIgnoreCase("0")) {
                        System.out.println("\n[AVISO] Nenhum pedido na Fila\n");
                    } else {
                        System.out.println("\n[3] PEDIDOS NA FILA");
                        System.out.println(fila.mostrarFilaPedidos());
                    }
                    break;
                case "4":
                    System.out.println("\n[4] PESQUISAR PEDIDO");
                    System.out.print("\nInforme o ID do pedido: _");
                    idPedidoPesquisado = sc.nextInt();
                    if (idPedidoPesquisado == fila.pesquisarPedidoID(idPedidoPesquisado)) {
                        System.out.println("\nIndex do Pedido: #" + idPedidoPesquisado + "\n");
                        fila.mostraPedido(idPedidoPesquisado);
                    } else {
                        System.out.println("\n[ERRO] Pedido Não Encontrado!\n");
                    }
                    break;
                default:
                    System.out.println("[ERRO] Opcao Invalida!\n");
            }
        } while (!opcao.equals("0"));
    }
}
