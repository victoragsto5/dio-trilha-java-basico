import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Random geradorNumero = new Random();

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite seu endereço: ");
        String endereco = scan.next();

        System.out.println("Sua conta é a: ");
        int numeroConta = geradorNumero.nextInt(Integer.MAX_VALUE);

        scan.close();

        System.out.println("Olá, seu nome é: " + nome + " " + sobrenome);
        System.out.println("Você reside em: " + endereco);
        System.out.println("Número da sua conta: " + numeroConta);
    }
}
