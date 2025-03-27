import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scan.nextInt();

        System.out.print("Por favor, digite o número da agencia: ");
        agencia = scan.next();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
    }
}