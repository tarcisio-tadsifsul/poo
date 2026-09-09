package lifo;

public class ArquivoTexto {
    private String[] palavras;
    private int quantidade;
    private int max;
    private int topo; // ultimo elemento do vetor (pilha)
    
    // Construtor
    public ArquivoTexto(int maxPalavras){
        this.max = maxPalavras; // maximo de palavras do arquivo de texto
        this.quantidade = 0;    // iniciliza em 0
        this.topo = -1;         // em vetor vazio, o primeiro index que será adicionado é 0; então (topo + 1) = 0;
        this.palavras = new String[maxPalavras]; // instancia o vetor do tipo String
    }
    
    // getMaximo (capacidade maxima da pilha)
    public int getMax(){
        return this.max;
    }
    
    // get quantidade (quantidade de elementos atualmente)
    public int getQuantidade(){
        return this.quantidade;
    }

    // Empilhar ou push
    public Boolean empilhar(String palavra){
        if(this.quantidade < this.max){ // verifica se o vetor não está vazio
         
            this.topo++;                // assume o primeira index do vetor. (topo + 1)
            palavras[topo] = palavra;   // vetor do index recebe o dado
            this.quantidade++;          // incrementa a quantidade            
            return true;
        }        
        return false;
    }
    
    // Desempilhar ou pop
    public Boolean desempilhar(){
        if (quantidade > 0 ){           // verifica se o vetor não está vazio
            this.palavras[topo] = null; // esvazia a última posição do vetor
            this.topo--;                // decrementa o topo (topo - 1)
            this.quantidade--;          // decrementa a quantidade
            return true;
        }         
        return false;
    }

    // Imprimir
    public String imprimir(){
        StringBuilder atrBuilder = new StringBuilder();
        // String aux = "";
        if (this.quantidade > 0) {
            for (String p: palavras) {      // verifica se o vetor não está vazio
                if (p != null){             // verifica se p não é nula, caso contrario, passa para a próxima
                    atrBuilder.append(p + " ");   // concatena as strings de forma dinamina com menos consumo de memoria
                    // aux+= p + " ";       // concatena cada objeto string
                }                
            }
            return atrBuilder.toString();
        }
        
        return "Arquivo em branco!";
    }
}
