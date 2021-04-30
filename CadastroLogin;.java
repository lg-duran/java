import java.util.Scanner;

public class CadastroELogin {
    Scanner input3 = new Scanner(System.in);

    System.out.println("Digite seu nome de Usuário: ");
    String nomeCadastrado = input3.next();

    if (nomeCadastrado.equalsIgnoreCase("admin") || nomeCadastrado.equalsIgnoreCase("administrador")) {
        System.out.println("Nome Inválido")
    } else {

    }

    System.out.println("Digite sua senha: ");
    String senhaCadastrada = new input3.next();

    System.out.println("Login: ");

    System.out.println("");

    System.out.print("Digite seu nome de Usuário: ");
    String nomeInserido = input3.next();

    System.out.print("Digite sua senha: ");
    String senhaInserida = input3.next();

    if (nomeInserido.equals(nomeCadastrado) && senhaInserida.equals(senhaCadastrada)) {
        System.out.println("Bem vindo(a) " + nomeCadastrado);
    } else {
        System.out.println("Nome de Usuario e/ou senha inválidos");
    }

}