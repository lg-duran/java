public class DocumentacaoParaAdocao {
    //atributos
    String nomeDaPessoa;
    String idadeDaPessoa;
    String cpf;
    String rg;
    
    //construtor
    public DocumentacaoParaAdocao(String nomeDaPessoa, String idadeDaPessoa, String cpf, String rg) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.idadeDaPessoa = idadeDaPessoa;
        this.cpf = cpf;
        this.rg = rg;
    }
    //metodo
    public void imprimirDocumentacao() {
        System.out.println("Documentacao para adocao:" + "\n" + "\nNome: " + this.nomeDaPessoa + "\nIdade: " 
        + this.idadeDaPessoa + "\nCPF: " + this.cpf + "\nRG: " + this.rg);
    }
}
    