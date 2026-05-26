package exe016Pessoa;

public class Juridica extends Pessoa{
    
    // Atributos
    private String cnpj;
    private String razaoSocial;

    // Construtores
    public Juridica() {
        this.cnpj = "ND";
        this.razaoSocial = "ND";
    }

    public Juridica(String nome, Endereco endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
    }

    // Acesso / Leitura
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(!cnpj.equals("")){
            this.cnpj = cnpj;            
        }
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        if(!razaoSocial.equals("")){
            this.razaoSocial = razaoSocial;            
        }
    }

    // Metodos

    public String exibirDados() {
        return "\n" + super.exibirDados("Juridica") + 
                "\n| CNPJ:\t\t\t" + this.getCnpj()+
                "\n| Razao Social:\t\t" + this.getRazaoSocial();
    }
    
    
    
    
    
}
