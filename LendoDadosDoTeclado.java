import java.util.Scanner;

public class LendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do(a) participante");
        String nome = input.next();

        System.out.println("Digite a idade do(a) participante");    
        int idade = input.nextInt();

        String nome2 = null;
        nome2 = "";

        if (nome2 == null || nome2 == "") {
            System.out.println("ERRADO!!!!!!!!!!");
        }

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");            
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto");
        } else if (idade >= 20 && idade <= 59) {
            System.out.println(nome + " participará da categoria Adulto");
        } else if (idade >= 60) {
            System.out.println(nome + " participará da categoria Idoso");
        }
    }
}
