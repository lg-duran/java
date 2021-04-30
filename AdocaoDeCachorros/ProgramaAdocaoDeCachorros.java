public class ProgramaAdocaoDeCachorros {
    public static void main(String[] args) {
    
        Cachorro cachorro1 = new Cachorro("Silvio Santos", "5 anos", "pastor alemao", "macho");
        DocumentacaoParaAdocao documentacao1 = new DocumentacaoParaAdocao("Antonio Ribeiro", "21 anos", "456789321-17", "14.584.645");
        Contrato contrato1 = new Contrato("30/03/2021", "Antonio Ribeiro aceita as responsabilidades do cachorro Silvio Santos", 
        "ONG adoçao feliz");
        
        cachorro1.imprimir();
        System.out.println("");
        documentacao1.imprimirDocumentacao();
        System.out.println("");
        contrato1.imprimirContrato();        
    }
}