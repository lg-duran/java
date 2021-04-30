import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = input.next();

        System.out.println("Olá, " + nome);    

    }
}