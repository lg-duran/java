import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);

        System.out.println("Crie um nome de usuário:");
        String nomeCriado = input2.next();

        if (nomeCriado == "admin" || nomeCriado == "administrador") {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nomeCriado + " cadastrado com sucesso");
        }

        System.out.println("Crie uma senha:");
        int senhaCriada = input2.nextInt();

        System.out.println("Login:");

        System.out.println("");

        System.out.println("Digite seu nome de usuário:");
        String nomeDigitado = input2.next();

        if (nomeDigitado == "") {
            System.out.println("Nome inválido");    
        } else {

        }

        System.out.println("Digite sua senha:");
        int senhaDigitada = input2.nextInt();
    }
}