public class Contrato {
    
    String dataDeEmissao;
    String conteudoDoContrato;
    String emissorDoContrato;
    
    public Contrato(String dataDeEmissao, String conteudoDoContrato, String emissorDoContrato) {    
        this.dataDeEmissao = dataDeEmissao;
        this.conteudoDoContrato = conteudoDoContrato;        
        this.emissorDoContrato = emissorDoContrato;
    }
    
    public void imprimirContrato() {
        System.out.println("Contrato:" + "\n" + "\nData : " + dataDeEmissao + "\n" + conteudoDoContrato + "\nEmitido por: " + 
        emissorDoContrato);
    }
}