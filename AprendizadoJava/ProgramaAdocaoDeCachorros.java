public class ProgramaAdocaoDeCachorros {
    public static void main(String[] args) {
    
        Cachorro cachorro1 = new Cachorro("Silvio Santos", "5 anos", "pastor alemao", "macho");
        DocumentacaoParaAdocao documentacao1 = new DocumentacaoParaAdocao("Antonio Ribeiro", "21 anos", "456789321-17", "14.584.645");
        
        cachorro1.imprimir();
        System.out.println("");
        documentacao1.imprimirDocumentacao();
        
    }
}