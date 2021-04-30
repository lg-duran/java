import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner codigo2 = new Scanner(System.in);
        int codigo1 = 558930;
        /*void imprimirLinhaEmBranco() {
            System.out.println("");
        } */      

        System.out.println("Digite o seu nome:");
        String nome = teclado.next();
        System.out.println("Olá, " + nome);
        //System.out.println(imprimirLinhaEmBranco);
        System.out.println("Digite esse código " + codigo1 + " para sabermos que é voçê.");
        int codigo = codigo2.nextInt();

        if(codigo == 558930) {
            //.imprimirLinhaEmBranco    
            System.out.println("Bem vindo, " + nome);
        } else {
            //.imprimirLinhaEmBranco
            System.out.println("Código inválido");
        }
    }
}