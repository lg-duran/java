public class Cachorro {
    //atributos
    String nomeDoCachorro; 
    String idadeDoCachorro;
    String racaDoCachorro;
    String machoOuFemea;

    //construtor
    public Cachorro(String nomeDoCachorro, String idadeDoCachorro, String racaDoCachorro, String machoOuFemea) {
    
        this.nomeDoCachorro = nomeDoCachorro;
        this.idadeDoCachorro = idadeDoCachorro;
        this.racaDoCachorro = racaDoCachorro;
        this.machoOuFemea = machoOuFemea;    
        
    }
    //metodo
    public void imprimir(){
        System.out.println("Cachorro: " + "\n" + "\nNome: " + this.nomeDoCachorro + "\nIdade: " + this.idadeDoCachorro + "\nRaca: " 
        + this.racaDoCachorro +"\nMacho ou Femea: " + this.machoOuFemea);
    }    
}